package generators;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VisionGeneratorTest
{
  private VisionGenerator generator;
  private double bbPct;
  private int expectedResult;
  private int result;

  @BeforeEach
  void setUp()
  { generator = new VisionGenerator(); }

  @Test
  void testGetVisionRating_greatVision()
  {
    bbPct = 36.1;
    expectedResult = 97;
    result = generator.getVisionRating(bbPct);
    assertEquals(expectedResult, result);
  }

  @Test
  void testGetVisionRating_averageVision()
  {
    bbPct = 22.6;
    expectedResult = 52;
    result = generator.getVisionRating(bbPct);
    assertEquals(expectedResult, result);
  }

  @Test
  void testGetVisionRating_poorVision()
  {
    bbPct = 8.1;
    expectedResult = 3;
    result = generator.getVisionRating(bbPct);
    assertEquals(expectedResult, result);
  }

  @AfterEach
  void tearDown()
  {
    generator = null;
    bbPct = 0;
    expectedResult = 0;
    result = 0;
  }
}
