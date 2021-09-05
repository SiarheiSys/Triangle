package org.example;

import org.junit.jupiter.api.*;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;


public class TriangleTest {
    private static Logger logger = LoggerFactory.getLogger(TriangleTest.class);
    private SquareFunction triangle;

    @BeforeEach
    public void setUp () {
        triangle = new SquareFunction(10, 12, 13);
    }

    @DisplayName("Проверка вычисления полупериметра")
    @Test
    public void halfOfPerimetrTest(){
        Assertions.assertEquals(17.5, triangle.halfOfPerimetr(), 0);
    }

    @DisplayName("Проверка вычисления площади")
    @Test
    public void SquareOfTriangleTest() {
        Assertions.assertEquals(57, triangle.SquareOfTriangle(),0.01);
    }
}
