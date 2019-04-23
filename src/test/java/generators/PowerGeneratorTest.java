package generators;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PowerGeneratorTest
{
  private PowerGenerator generator;
  private int homeruns;
  private int atbats;
  private int expectedResult;
  private int result;

  @BeforeEach
  void setUp()
  { generator = new PowerGenerator(); }

  @Test
  void testGetPowerRating_greatHitter()
  {
    homeruns = 40;
    atbats = 462;
    expectedResult = 98;
    result = generator.getPowerRating(homeruns, atbats);
    assertEquals(expectedResult, result);
  }

  @Test
  void testGetPowerRating_averageHitter()
  {
    homeruns = 18;
    atbats = 325;
    expectedResult = 73;
    result = generator.getPowerRating(homeruns, atbats);
    assertEquals(expectedResult, result);
  }

  @Test
  void testGetPowerRating_poorHitter()
  {
    homeruns = 6;
    atbats = 409;
    expectedResult = 41;
    result = generator.getPowerRating(homeruns, atbats);
    assertEquals(expectedResult, result);
  }

  @AfterEach
  void tearDown()
  {
    generator = null;
    homeruns = 0;
    atbats = 0;
    expectedResult = 0;
    result = 0;
  }
}
