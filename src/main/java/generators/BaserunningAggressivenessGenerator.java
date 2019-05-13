package generators;

import managers.ResourceManager;

/**
 * Generates a baserunning aggressiveness rating based on the number of bases a runner has taken
 */
public class BaserunningAggressivenessGenerator
{
  private final ResourceManager MGR = ResourceManager.getInstance();
  private final double BASERUNNING_AGGRESSIVENESS_INTERVAL = Double.parseDouble(MGR.getValue("BASERUNNING_AGGRESSIVENESS_INTERVAL"));
  private final double BASERUNNING_AGGRESSIVENESS_MIN = Double.parseDouble(MGR.getValue("BASERUNNING_AGGRESSIVENESS_MIN"));

  public BaserunningAggressivenessGenerator() { }

  /**
   * Gets a player's baserunning aggressiveness rating
   *
   * @param   BASES_TAKEN   number of bases a runner has taken
   * @return  baserunning aggressiveness rating as an integer, scaled 0-99
   */
  public int getBaserunningAggressivenessRating(final int BASES_TAKEN)
  { return (int)((BASES_TAKEN - BASERUNNING_AGGRESSIVENESS_MIN) / BASERUNNING_AGGRESSIVENESS_INTERVAL); }
}
