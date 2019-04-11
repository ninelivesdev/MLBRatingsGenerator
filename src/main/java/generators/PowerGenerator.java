package generators;

import managers.GeneratorResourceManager;

/**
 * Generates a power rating for a player and apply's a prospect adjustment if applicable
 */
public class PowerGenerator
{
  private final GeneratorResourceManager MGR = GeneratorResourceManager.getInstance();
  private final double INCREMENT_VALUE = Double.parseDouble(MGR.getValue("INCREMENT_VALUE"));

  public PowerGenerator()
  { }

  /**
   * Gets a veteran's power rating by:
   *    1.  Dividing the passed in HR by AB to calculate a HR-to-AB ratio
   *    2.  Dividing the HR-to-AB ratio by the fixed increment value (HR-to-AB value per game rating point)
   *    3.  Adding the result to the base value (lowest game rating)
   *
   * @param   HR    home runs the player hit
   * @param   AB    number of at bats needed to hit HR value
   * @return  integer value between 30 and 99 depicting a game rating
   */
  public int getPowerRating(final int HR, final int AB)
  {
    final double HR_TO_AB_RATIO = ((double)HR / (double)AB);
    final int BASE_VALUE = Integer.parseInt(MGR.getValue("BASE_VALUE"));

    return (int)((HR_TO_AB_RATIO / INCREMENT_VALUE) + BASE_VALUE);
  }

  /**
   * Subtracts the fixed prospect modifier value from the passed power rating
   *
   * @param   powerRating   generated power rating
   * @return  integer value between 0 and 60 depicting the rating for a prospect
   */
  public int applyProspectAdjustment(int powerRating)
  {
    final int PROSPECT_MODIFIER = Integer.parseInt(MGR.getValue("PROSPECT_MODIFIER"));

    return (powerRating - PROSPECT_MODIFIER);
  }
}
