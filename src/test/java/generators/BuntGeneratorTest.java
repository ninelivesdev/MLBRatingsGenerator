package generators;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BuntGeneratorTest
{
  private BuntGenerator generator;
  private int bunts;
  private double buntPct;
  private int expectedResult;
  private int result;

  @BeforeEach
  void setUp()
  { generator = new BuntGenerator(); }

  @Test
  void testGetBuntRating_highBunts_highPercentage()
  {
    bunts = 15;
    buntPct = 72.0;
    expectedResult = 96;
    result = generator.getBuntRating(bunts, buntPct);
    assertEquals(expectedResult, result);
  }

  @Test
  void testGetBuntRating_highBunts_averagePercentage()
  {
    bunts = 15;
    buntPct = 44.3;
    expectedResult = 59;
    result = generator.getBuntRating(bunts, buntPct);
    assertEquals(expectedResult, result);
  }

  @Test
  void testGetBuntRating_highBunts_lowPercentage()
  {
    bunts = 15;
    buntPct = 15.0;
    expectedResult = 20;
    result = generator.getBuntRating(bunts, buntPct);
    assertEquals(expectedResult, result);
  }

  @Test
  void testGetBuntRating_averageBunts_highPercentage()
  {
    bunts = 7;
    buntPct = 80.0;
    expectedResult = 74;
    result = generator.getBuntRating(bunts, buntPct);
    assertEquals(expectedResult, result);
  }

  @Test
  void testGetBuntRating_averageBunts_averagePercentage()
  {
    bunts = 7;
    buntPct = 44.5;
    expectedResult = 41;
    result = generator.getBuntRating(bunts, buntPct);
    assertEquals(expectedResult, result);
  }

  @Test
  void testGetBuntRating_averageBunts_lowPercentage()
  {
    bunts = 7;
    buntPct = 15.3;
    expectedResult = 14;
    result = generator.getBuntRating(bunts, buntPct);
    assertEquals(expectedResult, result);
  }


  @Test
  void testGetBuntRating_lowBunts_highPercentage()
  {
    bunts = 3;
    buntPct = 100;
    expectedResult = 66;
    result = generator.getBuntRating(bunts, buntPct);
    assertEquals(expectedResult, result);
  }

  @Test
  void testGetBuntRating_lowBunts_averagePercentage()
  {
    bunts = 3;
    buntPct = 50;
    expectedResult = 33;
    result = generator.getBuntRating(bunts, buntPct);
    assertEquals(expectedResult, result);
  }

  @Test
  void testGetBuntRating_lowBunts_lowPercentage()
  {
    bunts = 3;
    buntPct = 25;
    expectedResult = 16;
    result = generator.getBuntRating(bunts, buntPct);
    assertEquals(expectedResult, result);
  }

  @AfterEach
  void tearDown()
  {
    generator = null;
    bunts = 0;
    buntPct = 0;
    expectedResult = 0;
    result = 0;
  }
}
