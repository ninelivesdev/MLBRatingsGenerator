package generators;

import managers.ResourceManager;

/**
 * Generates a power rating for a player based on the number of home runs in at-bats
 */
public class PowerGenerator
{
  private final ResourceManager MGR = ResourceManager.getInstance();
  private final double POWER_INTERVAL = Double.parseDouble(MGR.getValue("POWER_INTERVAL"));
  private final double POWER_MIN = Double.parseDouble(MGR.getValue("POWER_MIN"));

  public PowerGenerator() { }

  /**
   * Generates a player's power rating
   *
   * @param   HOMERUNS    homeruns hit
   * @param   ATBATS      at-bats needed to hit HOMERUNS
   * @return  power rating as an integer, scaled 0-99
   */
  public int getPowerRating(final int HOMERUNS, final int ATBATS)
  {
    final double HR_TO_AB_RATIO = ((double)HOMERUNS / (double)ATBATS);

    return (int)((HR_TO_AB_RATIO / POWER_INTERVAL) + POWER_MIN);
  }
}
