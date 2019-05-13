package generators;

import managers.ResourceManager;

/**
 * Generates a stealing rating for a player based on his stolen base percentage
 */
public class StealingGenerator
{
  private final ResourceManager MGR = ResourceManager.getInstance();
  private final double STEALING_INTERVAL = Double.parseDouble(MGR.getValue("STEALING_INTERVAL"));
  private final double STEALING_MIN = Double.parseDouble(MGR.getValue("STEALING_MIN"));

  public StealingGenerator() { }

  public int getStealingRating(final int STOLEN_BASES, final int STOLEN_BASE_PCT)
  { return applyStolenBasesModifier(STOLEN_BASES, ((STOLEN_BASE_PCT - STEALING_MIN) / STEALING_INTERVAL)); }

  private int applyStolenBasesModifier(final int STOLEN_BASES, double tempRating)
  {
    if (STOLEN_BASES >= 60)
      return (int)(tempRating);
    if (STOLEN_BASES >= 50)
      return (int)(tempRating * 0.90);
    if (STOLEN_BASES >= 40)
      return (int)(tempRating * 0.85);
    if (STOLEN_BASES >= 30)
      return (int)(tempRating * 0.80);
    if (STOLEN_BASES >= 20)
      return (int)(tempRating * 0.75);
    if (STOLEN_BASES >= 10)
      return (int)(tempRating * 0.70);
    if (STOLEN_BASES >= 0)
      return (int)(tempRating * 0.65);

    return 0;
  }
}
