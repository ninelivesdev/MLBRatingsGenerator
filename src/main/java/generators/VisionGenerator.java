package generators;

import managers.ResourceManager;

/**
 * Generates a vision rating based on his strikeout(in plate appearances) percentage
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
   * @param   SO_PCT   strikeouts-in-plate appearances percentage
   * @return  vision rating as an integer, scaled 0-99
   */
  public int getVisionRating(final double SO_PCT)
  { return (int) ((SO_PCT - VISION_MIN) / VISION_INTERVAL); }
}
