package generators;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StealingGeneratorTest
{
  private StealingGenerator generator;
  private int stolenBases;
  private int stolenBasePercentage;
  private int expectedResult;
  private int result;

  @BeforeEach
  void setUp()
  { generator = new StealingGenerator(); }

  @Test
  void testGetStealingRating_highStolenBases_highStolenBasePercentage()
  {
    stolenBases = 71;
    stolenBasePercentage = 93;
    expectedResult = 116;
    result = generator.getStealingRating(stolenBases, stolenBasePercentage);
    assertEquals(expectedResult, result);
  }

  @Test
  void testGetStealingRating_highStolenBases_averageStolenBasePercentage()
  {
    stolenBases = 71;
    stolenBasePercentage = 75;
    expectedResult = 93;
    result = generator.getStealingRating(stolenBases, stolenBasePercentage);
    assertEquals(expectedResult, result);
  }

  @Test
  void testGetStealingRating_highStolenBases_lowStolenBasePercentage()
  {
    stolenBases = 71;
    stolenBasePercentage = 51;
    expectedResult = 63;
    result = generator.getStealingRating(stolenBases, stolenBasePercentage);
    assertEquals(expectedResult, result);
  }

  @Test
  void testGetStealingRating_averageStolenBases_highStolenBasePercentage()
  {
    stolenBases = 22;
    stolenBasePercentage = 88;
    expectedResult = 82;
    result = generator.getStealingRating(stolenBases, stolenBasePercentage);
    assertEquals(expectedResult, result);
  }

  @Test
  void testGetStealingRating_averageStolenBases_averageStolenBasePercentage()
  {
    stolenBases = 22;
    stolenBasePercentage = 71;
    expectedResult = 66;
    result = generator.getStealingRating(stolenBases, stolenBasePercentage);
    assertEquals(expectedResult, result);
  }

  @Test
  void testGetStealingRating_averageStolenBases_lowStolenBasePercentage()
  {
    stolenBases = 22;
    stolenBasePercentage = 51;
    expectedResult = 47;
    result = generator.getStealingRating(stolenBases, stolenBasePercentage);
    assertEquals(expectedResult, result);
  }

  @Test
  void testGetStealingRating_lowStolenBases_highStolenBasePercentage()
  {
    stolenBases = 5;
    stolenBasePercentage = 83;
    expectedResult = 67;
    result = generator.getStealingRating(stolenBases, stolenBasePercentage);
    assertEquals(expectedResult, result);
  }

  @Test
  void testGetStealingRating_lowStolenBases_averageStolenBasePercentage()
  {
    stolenBases = 5;
    stolenBasePercentage = 62;
    expectedResult = 50;
    result = generator.getStealingRating(stolenBases, stolenBasePercentage);
    assertEquals(expectedResult, result);
  }

  @Test
  void testGetStealingRating_lowStolenBases_lowStolenBasePercentage()
  {
    stolenBases = 5;
    stolenBasePercentage = 41;
    expectedResult = 33;
    result = generator.getStealingRating(stolenBases, stolenBasePercentage);
    assertEquals(expectedResult, result);
  }

  @AfterEach
  void tearDown()
  {
    stolenBases = 0;
    stolenBasePercentage = 0;
    expectedResult = 0;
    result = 0;
  }
}
