package generators;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VisionGeneratorTest
{
  private VisionGenerator generator;
  private int plateAppearances;
  private int strikeouts;
  private int expectedResult;
  private int result;

  @BeforeEach
  void setUp()
  { generator = new VisionGenerator(); }

  @Test
  void testGetVisionRating_greatVision()
  {
    plateAppearances = 600;
    strikeouts = 44;
    expectedResult = 106;
    result = generator.getVisionRating(plateAppearances, strikeouts);
    assertEquals(expectedResult, result);
  }

  @Test
  void testGetVisionRating_averageVision()
  {
    plateAppearances = 621;
    strikeouts = 77;
    expectedResult = 50;
    result = generator.getVisionRating(plateAppearances, strikeouts);
    assertEquals(expectedResult, result);
  }

  @Test
  void testGetVisionRating_poorVision()
  {
    plateAppearances = 705;
    strikeouts = 211;
    expectedResult = 3;
    result = generator.getVisionRating(plateAppearances, strikeouts);
    assertEquals(expectedResult, result);
  }

  @AfterEach
  void tearDown()
  {
    generator = null;
    plateAppearances = 0;
    strikeouts = 0;
    expectedResult = 0;
    result = 0;
  }
}
