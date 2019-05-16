package generators;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DisciplineGeneratorTest
{
  private DisciplineGenerator generator;
  private double bbPct;
  private int expectedResult;
  private int result;

  @BeforeEach
  void setUp()
  { generator = new DisciplineGenerator(); }

  @Test
  void getDisciplineRating_greatVision()
  {
    bbPct = 18.7;
    expectedResult = 93;
    result = generator.getDisciplineRating(bbPct);
    assertEquals(expectedResult, result);
  }

  @Test
  void getDisciplineRating_averageVision()
  {
    bbPct = 9.8;
    expectedResult = 46;
    result = generator.getDisciplineRating(bbPct);
    assertEquals(expectedResult, result);
  }

  @Test
  void getDisciplineRating_poorVision()
  {
    bbPct = 2.3;
    expectedResult = 6;
    result = generator.getDisciplineRating(bbPct);
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
