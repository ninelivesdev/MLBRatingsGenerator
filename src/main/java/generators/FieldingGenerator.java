package generators;

import managers.ResourceManager;

/**
 * Generates a fielding rating for a player based on his fielding percentage
 */
public class FieldingGenerator
{
  private final ResourceManager MGR = ResourceManager.getInstance();
  private final double FIELDING_INTERVAL = Double.parseDouble(MGR.getValue("FIELDING_INTERVAL"));
  private final double FIELDING_MIN = Double.parseDouble(MGR.getValue("FIELDING_MIN"));

  public FieldingGenerator() { }

  /**
   * Generates a player's fielding rating
   *
   * @param   FIELDING_PCT  player's fielding percentage
   * @return  fielding rating as an integer, scaled 0-99
   */
  public int getFieldingRating(final double FIELDING_PCT)
  { return (int)((FIELDING_PCT - FIELDING_MIN) / FIELDING_INTERVAL); }
}
