package adjusters;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProspectAdjusterTest
{
  private ProspectAdjuster adjuster;
  private int initialPowerRating;
  private int expectedResult;
  private int result;

  @BeforeEach
  void setUp()
  {
    adjuster = new ProspectAdjuster();
    initialPowerRating = 0;
    expectedResult = 0;
    result = 0;
  }

  @Test
  void testApplyProspectAdjustment_power_topProspect()
  {
    initialPowerRating = 91;
    expectedResult = 66;
    result = adjuster.applyProspectAdjustment(initialPowerRating);
    assertEquals(expectedResult, result);
  }

  @Test
  void testApplyProspectAdjustment_power_averageProspect()
  {
    initialPowerRating = 68;
    expectedResult = 43;
    result = adjuster.applyProspectAdjustment(initialPowerRating);
    assertEquals(expectedResult, result);
  }

  @Test
  void testApplyProspectAdjustment_power_lowProspect()
  {
    initialPowerRating = 39;
    expectedResult = 14;
    result = adjuster.applyProspectAdjustment(initialPowerRating);
    assertEquals(expectedResult, result);
  }

  @AfterEach
  void tearDown()
  {
    adjuster = null;
    initialPowerRating = 0;
    expectedResult = 0;
    result = 0;
  }
}
