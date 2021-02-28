package com.company;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NumberTranslatorTest {

    @Test
  public void test_cases() {
    NumberTranslator numberTest = new NumberTranslator();

    String actual_result = numberTest.translateNumber(1);
    String expected_result = "One";
    assertEquals(expected_result, actual_result);
    String actual_result1 = numberTest.translateNumber(2);
    String expected_result1 = "Two";
    assertEquals(expected_result1, actual_result1);
    String actual_result2 = numberTest.translateNumber(3);
    String expected_result2 = "Three";
    assertEquals(expected_result2, actual_result2);
    String actual_result3 = numberTest.translateNumber(4);
    String expected_result3 = "Four";
    assertEquals(expected_result3, actual_result3);
    String actual_result4 = numberTest.translateNumber(5);
    String expected_result4 = "Five";
    assertEquals(expected_result4, actual_result4);
  }
}