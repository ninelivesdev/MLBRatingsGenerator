package generators;

import managers.ResourceManager;

/**
 * Generates a speed rating based on his sprint speed in feet-per-second
 */
public class SpeedGenerator
{
  private final ResourceManager MGR = ResourceManager.getInstance();
  private final double SPEED_INTERVAL = Double.parseDouble(MGR.getValue("SPEED_INTERVAL"));
  private final double SPEED_MIN = Double.parseDouble(MGR.getValue("SPEED_MIN"));

  public SpeedGenerator()
  { }

  /**
   * Generates a player's speed rating
   *
   * @param   SPRINT_SPEED   sprint speed in feet-per-second
   * @return  speed rating as an integer, scaled 0-99
   */
  public int getSpeedRating(final double SPRINT_SPEED)
  { return (int)((SPRINT_SPEED - SPEED_MIN) /SPEED_INTERVAL); }
}
