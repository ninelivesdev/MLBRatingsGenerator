package generators;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PowerGeneratorTest
{
  private PowerGenerator generator;

  @BeforeEach
  void setUp()
  { generator = new PowerGenerator(); }

  @Test
  void testGetPowerRating_bigPowerHitter()
  {
    final int HR = 44;
    final int AB = 462;
    final int EXP_RESULT = 100;
    final int RESULT = generator.getPowerRating(HR, AB);
    assertEquals(EXP_RESULT, RESULT);
  }

  @Test
  void testGetPowerRating_averagePowerHitter()
  {
    final int HR = 18;
    final int AB = 325;
    final int EXP_RESULT = 71;
    final int RESULT = generator.getPowerRating(HR, AB);
    assertEquals(EXP_RESULT, RESULT);
  }

  @Test
  void testGetPowerRating_poorPowerHitter()
  {
    final int HR = 6;
    final int AB = 409;
    final int EXP_RESULT = 40;
    final int RESULT = generator.getPowerRating(HR, AB);
    assertEquals(EXP_RESULT, RESULT);
  }

  @AfterEach
  void tearDown()
  { generator = null; }
}
