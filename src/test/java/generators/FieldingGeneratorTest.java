package generators;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FieldingGeneratorTest
{
  private FieldingGenerator generator;
  private double fieldingPct;
  private int expectedResult;
  private int result;

  @BeforeEach
  void setUp()
  { generator = new FieldingGenerator(); }

  @Test
  void testGetFieldingRating_greatFielder()
  {
    fieldingPct = 0.997;
    expectedResult = 96;
    result = generator.getFieldingRating(fieldingPct);
    assertEquals(expectedResult, result);
  }

  @Test
  void testGetFieldingRating_averageFielder()
  {
    fieldingPct = 0.951;
    expectedResult = 50;
    result = generator.getFieldingRating(fieldingPct);
    assertEquals(expectedResult, result);
  }

  @Test
  void testGetFieldingRating_poorFielder()
  {
    fieldingPct = 0.926;
    expectedResult = 26;
    result = generator.getFieldingRating(fieldingPct);
    assertEquals(expectedResult, result);
  }

  @AfterEach
  void tearDown()
  {
    generator = null;
    fieldingPct = 0;
    expectedResult = 0;
    result = 0;
  }
}