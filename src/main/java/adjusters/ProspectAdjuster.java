package adjusters;

import managers.ResourceManager;

/**
 * Adjusts a player's generated rating if they are a minor league prospect
 */
public class ProspectAdjuster
{
  private final ResourceManager MGR = ResourceManager.getInstance();
  private final int MODIFIER = Integer.parseInt(MGR.getValue("PROSPECT_MODIFIER"));

  public ProspectAdjuster()
  { }

  /**
   * Applies a prospect adjustment to a player's rating
   *
   * @param   INITIAL_RATING    initial rating generated
   * @return  adjusted power rating
   */
  public int applyProspectAdjustment(final int INITIAL_RATING)
  { return (INITIAL_RATING - MODIFIER); }
}
