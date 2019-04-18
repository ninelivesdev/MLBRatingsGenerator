package adjusters;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProspectAdjusterTest
{
  private ProspectAdjuster adjuster;

  @BeforeEach
  void setUp()
  { adjuster = new ProspectAdjuster(); }

  @Test
  void testApplyProspectAdjustment_power_topProspect()
  {
    final int POWER_RATING = 91;
    final int EXP_RESULT = 66;
    final int RESULT = adjuster.applyProspectAdjustment(POWER_RATING);
    assertEquals(EXP_RESULT, RESULT);
  }

  @Test
  void testApplyProspectAdjustment_power_averageProspect()
  {
    final int POWER_RATING = 68;
    final int EXP_RESULT = 43;
    final int RESULT = adjuster.applyProspectAdjustment(POWER_RATING);
    assertEquals(EXP_RESULT, RESULT);
  }

  @Test
  void testApplyProspectAdjustment_power_lowProspect()
  {
    final int POWER_RATING = 39;
    final int EXP_RESULT = 14;
    final int RESULT = adjuster.applyProspectAdjustment(POWER_RATING);
    assertEquals(EXP_RESULT, RESULT);
  }

  @AfterEach
  void tearDown()
  { adjuster = null; }
}
