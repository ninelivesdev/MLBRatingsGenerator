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
  void testGetPowerRating_forVeteran_bigPowerHitter()
  {
    final int HR = 44;
    final int AB = 462;
    final int EXP_RESULT = 100;
    final int RESULT = generator.getPowerRating(HR, AB);
    assertEquals(EXP_RESULT, RESULT);
  }

  @Test
  void testGetPowerRating_forVeteran_averagePowerHitter()
  {
    final int HR = 18;
    final int AB = 325;
    final int EXP_RESULT = 71;
    final int RESULT = generator.getPowerRating(HR, AB);
    assertEquals(EXP_RESULT, RESULT);
  }

  @Test
  void testGetPowerRating_forVeteran_poorPowerHitter()
  {
    final int HR = 6;
    final int AB = 409;
    final int EXP_RESULT = 40;
    final int RESULT = generator.getPowerRating(HR, AB);
    assertEquals(EXP_RESULT, RESULT);
  }

  @Test
  void testGetPowerRating_forProspect_bigPowerHitter()
  {
    final int HR = 20;
    final int AB = 332;
    final int EXP_RESULT = 49;
    final int TEMP_RESULT = generator.getPowerRating(HR, AB);
    final int ADJUSTED_RESULT = generator.applyProspectAdjustment(TEMP_RESULT);
    assertEquals(EXP_RESULT, ADJUSTED_RESULT);
  }

  @Test
  void testGetPowerRating_forProspect_averagePowerHitter()
  {
    final int HR = 14;
    final int AB = 379;
    final int EXP_RESULT = 32;
    final int TEMP_RESULT = generator.getPowerRating(HR, AB);
    final int ADJUSTED_RESULT = generator.applyProspectAdjustment(TEMP_RESULT);
    assertEquals(EXP_RESULT, ADJUSTED_RESULT);
  }

  @Test
  void testGetPowerRating_forProspect_poorPowerHitter()
  {
    final int HR = 4;
    final int AB = 189;
    final int EXP_RESULT = 20;
    final int TEMP_RESULT = generator.getPowerRating(HR, AB);
    final int ADJUSTED_RESULT = generator.applyProspectAdjustment(TEMP_RESULT);
    assertEquals(EXP_RESULT, ADJUSTED_RESULT);
  }

  @AfterEach
  void tearDown()
  { generator = null; }
}
