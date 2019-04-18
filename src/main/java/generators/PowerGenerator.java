package generators;

import managers.ResourceManager;

/**
 * Generates a power rating for a player based on the number of home runs in at-bats
 */
public class PowerGenerator
{
  private final ResourceManager MGR = ResourceManager.getInstance();
  private final double INCREMENT_VALUE_POWER = Double.parseDouble(MGR.getValue("INCREMENT_VALUE_POWER"));

  public PowerGenerator()
  { }

  /**
   * Gets a player's power rating by:
   *    1.  Dividing the passed in HR by AB to calculate a HR-to-AB ratio
   *    2.  Dividing the HR-to-AB ratio by the fixed increment value (HR-to-AB value per game rating point)
   *    3.  Adding the result to the base value (lowest game rating)
   *
   * @param   HR    home runs the player hit
   * @param   AB    number of at bats needed to hit HR value
   * @return  integer value between 30 and 99 depicting the player's power rating
   */
  public int getPowerRating(final int HR, final int AB)
  {
    final double HR_TO_AB_RATIO = ((double)HR / (double)AB);
    final int BASE_VALUE = Integer.parseInt(MGR.getValue("BASE_VALUE"));

    return (int)((HR_TO_AB_RATIO / INCREMENT_VALUE_POWER) + BASE_VALUE);
  }
}
