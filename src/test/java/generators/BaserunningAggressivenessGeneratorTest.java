package generators;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BaserunningAggressivenessGeneratorTest
{
  private BaserunningAggressivenessGenerator generator;
  private int basesTaken;
  private int expectedResult;
  private int result;

  @BeforeEach
  void setUp()
  { generator = new BaserunningAggressivenessGenerator(); }

  @Test
  void testGetBaserunningAggressivenessRating_aggresiveBaserunner()
  {
    basesTaken = 23;
    expectedResult = 92;
    result = generator.getBaserunningAggressivenessRating(basesTaken);
    assertEquals(expectedResult, result);
  }

  @Test
  void testGetBaserunningAggressivenessRating_averageBaserunner()
  {
    basesTaken = 11;
    expectedResult = 44;
    result = generator.getBaserunningAggressivenessRating(basesTaken);
    assertEquals(expectedResult, result);
  }

  @Test
  void testGetBaserunningAggressivenessRating_conservativeBaserunner()
  {
    basesTaken = 2;
    expectedResult = 8;
    result = generator.getBaserunningAggressivenessRating(basesTaken);
    assertEquals(expectedResult, result);
  }

  @AfterEach
  void tearDown()
  {
    generator = null;
    basesTaken = 0;
    expectedResult = 0;
    result = 0;
  }
}
