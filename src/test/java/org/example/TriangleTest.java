package org.example;

import ch.qos.logback.classic.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;

public class TriangleTest {
    private static Logger logger = (Logger) LoggerFactory.getLogger(TriangleTest.class);
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
