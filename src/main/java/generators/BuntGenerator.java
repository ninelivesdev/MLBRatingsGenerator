package generators;

import managers.ResourceManager;

/**
 * Generates a bunt rating based on the player's successful bunt percentage
 */
public class BuntGenerator
{
  private final ResourceManager MGR = ResourceManager.getInstance();
  private final double BUNT_INTERVAL = Double.parseDouble(MGR.getValue("BUNT_INTERVAL"));
  private final double BUNT_MIN = Double.parseDouble(MGR.getValue("BUNT_MIN"));
  private final int BUNT_MODIFIER_TIER1_THRESHOLD = Integer.parseInt(MGR.getValue("BUNT_MODIFIER_TIER1_THRESHOLD"));
  private final int BUNT_MODIFIER_TIER2_THRESHOLD = Integer.parseInt(MGR.getValue("BUNT_MODIFIER_TIER2_THRESHOLD"));
  private final int BUNT_MODIFIER_TIER3_THRESHOLD = Integer.parseInt(MGR.getValue("BUNT_MODIFIER_TIER3_THRESHOLD"));
  private final int BUNT_MODIFIER_TIER4_THRESHOLD = Integer.parseInt(MGR.getValue("BUNT_MODIFIER_TIER4_THRESHOLD"));
  // BUNT_MODIFIER_TIER1_VALUE is 100% of given value, no modification needed
  private final double BUNT_MODIFIER_TIER2_VALUE = Double.parseDouble(MGR.getValue("BUNT_MODIFIER_TIER2_VALUE"));
  private final double BUNT_MODIFIER_TIER3_VALUE = Double.parseDouble(MGR.getValue("BUNT_MODIFIER_TIER3_VALUE"));
  private final double BUNT_MODIFIER_TIER4_VALUE = Double.parseDouble(MGR.getValue("BUNT_MODIFIER_TIER4_VALUE"));

  public BuntGenerator()
  { }

  /**
   * Generates a player's bunt rating
   *
   * @param   BUNTS      number of successful bunts
   * @param   BUNT_PCT   successful bunt percentage
   * @return  bunt rating as an integer, scaled 0-99
   */
  public int getBuntRating(final int BUNTS, final double BUNT_PCT)
  { return applyBuntModifier(BUNTS, ((BUNT_PCT - BUNT_MIN) / BUNT_INTERVAL)); }

  /**
   * Applies a modifier value to the bunt rating
   *
   * @param   BUNTS       number of successful bunts
   * @param   tempRating  initial bunt rating
   * @return  bunt rating as an integer, scaled 0-99
   */
  private int applyBuntModifier(final int BUNTS, double tempRating)
  {
    if (BUNTS >= BUNT_MODIFIER_TIER1_THRESHOLD)
      return (int)(tempRating);
    if (BUNTS >= BUNT_MODIFIER_TIER2_THRESHOLD)
      return (int)(tempRating * BUNT_MODIFIER_TIER2_VALUE);
    if (BUNTS >= BUNT_MODIFIER_TIER3_THRESHOLD)
      return (int)(tempRating * BUNT_MODIFIER_TIER3_VALUE);
    if (BUNTS >= BUNT_MODIFIER_TIER4_THRESHOLD)
      return (int)(tempRating * BUNT_MODIFIER_TIER4_VALUE);

    return 0;
  }
}
