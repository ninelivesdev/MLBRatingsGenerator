package adjusters;

import managers.ResourceManager;

/**
 * Adjusts a player's generated rating in the event they are considered a minor league prospect
 */
public class ProspectAdjuster
{
  private final ResourceManager MGR = ResourceManager.getInstance();
  private final int MODIFIER = Integer.parseInt(MGR.getValue("PROSPECT_MODIFIER"));

  public ProspectAdjuster()
  { }

  /**
   * Subtracts a modifier value from the generated power rating to produce a prospect rating
   *
   * @param   POWER_RATING    power rating generated based on stats
   * @return  prospect's power rating with the adjustment applied
   */
  public int applyProspectAdjustment(final int POWER_RATING)
  { return (POWER_RATING - MODIFIER); }
}
