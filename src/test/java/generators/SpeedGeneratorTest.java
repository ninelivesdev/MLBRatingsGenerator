package generators;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpeedGeneratorTest
{
  private SpeedGenerator generator;
  private double sprintSpeed;
  private int expectedResult;
  private int result;

  @BeforeEach
  void setUp()
  { generator = new SpeedGenerator(); }

  @Test
  void testGetSpeedRating_fastPlayer()
  {
    sprintSpeed = 29.5;
    expectedResult = 88;
    result = generator.getSpeedRating(sprintSpeed);
    assertEquals(expectedResult, result);
  }

  @Test
  void testGetSpeedRating_averagePlayer()
  {
    sprintSpeed = 27.9;
    expectedResult = 69;
    result = generator.getSpeedRating(sprintSpeed);
    assertEquals(expectedResult, result);
  }

  @Test
  void testGetSpeedRating_slowPlayer()
  {
    sprintSpeed = 23.2;
    expectedResult = 11;
    result = generator.getSpeedRating(sprintSpeed);
    assertEquals(expectedResult, result);
  }

  @AfterEach
  void tearDown()
  {
    generator = null;
    sprintSpeed = 0;
    expectedResult = 0;
    result = 0;
  }
}
