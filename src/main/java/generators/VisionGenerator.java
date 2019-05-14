package generators;

import managers.ResourceManager;

/**
 * Generates a vision rating based on his atbats-per-strikeout ratio
 */
public class VisionGenerator
{
  private final ResourceManager MGR = ResourceManager.getInstance();
  private final double VISION_INTERVAL = Double.parseDouble(MGR.getValue("VISION_INTERVAL"));
  private final double VISION_MIN = Double.parseDouble(MGR.getValue("VISION_MIN"));

  public VisionGenerator()
  { }

  /**
   * Generates a player's vision rating
   *
   * @param   PLATE_APPEARANCES   number of official plate appearances
   * @param   STRIKEOUTS          number of strikeouts in those plate appearances
   * @return  vision rating as an integer, scaled 0-99
   */
  public int getVisionRating(final double PLATE_APPEARANCES, final double STRIKEOUTS)
  { return (int) (((PLATE_APPEARANCES / STRIKEOUTS) - VISION_MIN) / VISION_INTERVAL); }
}
