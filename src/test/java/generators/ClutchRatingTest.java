package generators;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClutchRatingTest
{
  private ClutchGenerator generator;
  private double twoOutsRispAvg;
  private double lateAndCloseAvg;
  private int expectedResult;
  private int result;

  @BeforeEach
  void setUp()
  { generator = new ClutchGenerator(); }

  @Test
  void testGetClutchRating_clutchHitter()
  {
    twoOutsRispAvg = 0.295;
    lateAndCloseAvg = 0.282;
    expectedResult = 98;
    result = generator.getClutchRating(twoOutsRispAvg, lateAndCloseAvg);
    assertEquals(expectedResult, result);
  }

  @Test
  void testGetClutchRating_averageHitter()
  {
    twoOutsRispAvg = 0.230;
    lateAndCloseAvg = 0.221;
    expectedResult = 53;
    result = generator.getClutchRating(twoOutsRispAvg, lateAndCloseAvg);
    assertEquals(expectedResult, result);
  }

  @Test
  void testGetClutchRating_chokeHitter()
  {
    twoOutsRispAvg = 0.182;
    lateAndCloseAvg = 0.144;
    expectedResult = 9;
    result = generator.getClutchRating(twoOutsRispAvg, lateAndCloseAvg);
    assertEquals(expectedResult, result);
  }

  @AfterEach
  void tearDown()
  {
    generator = null;
    twoOutsRispAvg = 0;
    lateAndCloseAvg = 0;
    expectedResult = 0;
    result = 0;
  }
}
