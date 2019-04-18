package generators;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContactGeneratorTest
{
  private ContactGenerator generator;
  private double battingAverage;
  private int expectedResult;
  private int result;

  @BeforeEach
  void setUp()
  { generator = new ContactGenerator(); }

  @Test
  void testGetContactRating_greatHitter()
  {
    battingAverage = 0.338;
    expectedResult = 91;
    result = generator.getContactRating(battingAverage);
    assertEquals(expectedResult, result);
  }

  @Test
  void testGetContactRating_averageHitter()
  {
    battingAverage = 0.278;
    expectedResult = 75;
    result = generator.getContactRating(battingAverage);
    assertEquals(expectedResult, result);
  }

  @Test
  void testGetContactRating_poorHitter()
  {
    battingAverage = 0.219;
    expectedResult = 59;
    result = generator.getContactRating(battingAverage);
    assertEquals(expectedResult, result);
  }

  @AfterEach
  void tearDown()
  {
    generator = null;
    battingAverage = 0;
    expectedResult = 0;
    result = 0;
  }
}
