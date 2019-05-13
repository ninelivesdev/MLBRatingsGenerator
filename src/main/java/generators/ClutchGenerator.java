package generators;

import managers.ResourceManager;

/**
 * Generates a clutch rating for a player based on his batting averages when there are two outs and runners in scoring
 * position, and when the game is late and close (see baseball-reference.com's description)
 */
public class ClutchGenerator
{
  private final ResourceManager MGR = ResourceManager.getInstance();
  private final double CLUTCH_INTERVAL = Double.parseDouble(MGR.getValue("CLUTCH_INTERVAL"));
  private final double CLUTCH_MIN = Double.parseDouble(MGR.getValue("CLUTCH_MIN"));

  public ClutchGenerator()
  { }

  /**
   * Generates a player's clutch rating
   *
   * @param   TWO_OUTS_RISP_AVG   batting average with two outs and a runner(s) in scoring position
   * @param   LATE_AND_CLOSE_AVG  batting average in a late and close game situation
   * @return  clutch rating as an integer, scaled 0-99
   */
  public int getClutchRating(final double TWO_OUTS_RISP_AVG, final double LATE_AND_CLOSE_AVG)
  { return (int)((((TWO_OUTS_RISP_AVG + LATE_AND_CLOSE_AVG)/ 2) - CLUTCH_MIN) / CLUTCH_INTERVAL); }
}
