package generators;

import managers.ResourceManager;

/**
 * Generates a discipline rating based on a player's walk(in plate appearances) percentage
 */
public class DisciplineGenerator
{
  private final ResourceManager MGR = ResourceManager.getInstance();
  private final double DISCIPLINE_INTERVAL = Double.parseDouble(MGR.getValue("DISCIPLINE_INTERVAL"));
  private final double DISCIPLINE_MIN = Double.parseDouble(MGR.getValue("DISCIPLINE_MIN"));

  public DisciplineGenerator()
  { }

  /**
   * Generates a player's discipline rating
   *
   * @param   BB_PCT  walks-in-plate appearance percentage
   * @return  vision rating as an integer, scaled 0-99
   */
  public int getDisciplineRating(final double BB_PCT)
  { return (int) (((BB_PCT) - DISCIPLINE_MIN) / DISCIPLINE_INTERVAL); }
}
