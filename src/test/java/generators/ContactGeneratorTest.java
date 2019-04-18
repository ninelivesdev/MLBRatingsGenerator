package generators;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContactGeneratorTest
{
  private ContactGenerator generator;

  @BeforeEach
  void setUp()
  { generator = new ContactGenerator(); }

  @Test
  void testGetContactRating_greatHitter()
  {
    final double BATTING_AVERAGE = 0.338;
    final int EXP_RESULT = 91;
    final int RESULT = generator.getContactRating(BATTING_AVERAGE);
    assertEquals(EXP_RESULT, RESULT);
  }

  @Test
  void testGetContactRating_averageHitter()
  {
    final double BATTING_AVERAGE = 0.278;
    final int EXP_RESULT = 75;
    final int RESULT = generator.getContactRating(BATTING_AVERAGE);
    assertEquals(EXP_RESULT, RESULT);
  }

  @Test
  void testGetContactRating_poorHitter()
  {
    final double BATTING_AVERAGE = 0.219;
    final int EXP_RESULT = 59;
    final int RESULT = generator.getContactRating(BATTING_AVERAGE);
    assertEquals(EXP_RESULT, RESULT);
  }

  @AfterEach
  void tearDown()
  { generator = null; }
}
