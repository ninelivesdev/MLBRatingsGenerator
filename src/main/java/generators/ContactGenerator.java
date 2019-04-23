package generators;

import managers.ResourceManager;

/**
 * Generates a contact rating for a player based on his batting average
 */
public class ContactGenerator
{
  private final ResourceManager MGR = ResourceManager.getInstance();
  private final double CONTACT_INTERVAL = Double.parseDouble(MGR.getValue("CONTACT_INTERVAL"));
  private final double CONTACT_MIN = Double.parseDouble(MGR.getValue("CONTACT_MIN"));

  public ContactGenerator()
  { }

  /**
   * Generates a player's contact rating
   *
   * @param   BATTING_AVERAGE   batting average
   * @return  contact rating as an integer, scaled 0-99
   */
  public int getContactRating(final double BATTING_AVERAGE)
  { return (int)((BATTING_AVERAGE - CONTACT_MIN) / CONTACT_INTERVAL); }
}
