package generators;

import managers.ResourceManager;

/**
 * Generates a contact rating for a player based on his batting average
 */
public class ContactGenerator
{
  private final ResourceManager MGR = ResourceManager.getInstance();
  private final double INCREMENT_VALUE_CONTACT = Double.parseDouble(MGR.getValue("INCREMENT_VALUE_CONTACT"));
  
  public ContactGenerator()
  { }

  /**
   * Gets a player's contact rating by dividing batting average by the fixed increment value
   *
   * @param   BATTING_AVERAGE   player's batting average
   * @return  integer value between 30 and 99 depicting the player's contact rating
   */
  public int getContactRating(final double BATTING_AVERAGE)
  { return (int)(BATTING_AVERAGE / INCREMENT_VALUE_CONTACT); }
}
