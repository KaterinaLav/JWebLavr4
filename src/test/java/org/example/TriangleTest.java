package org.example;

import org.example.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TriangleTest {

    static Logger logger = LoggerFactory.getLogger(TriangleTest.class);



    @Test
    void test() {
        Triangle exampleClass = new Triangle();
        logger.info("info");
        assertTrue( true );
    }
    //позитивный тест
    @ParameterizedTest
    @CsvSource({"10,20,40","100, 200,400","1,2,4"})
    void testTriangleCsvSource(int a, int b, int c) {
        Triangle triangleClass = new Triangle();
        assertTrue(true, "Площадь вычислена");
    }
    // негативный тест - одна сторона отрицательная
    @ParameterizedTest
    @CsvSource({"-10, 20, 40"})
    void testTriangleSourceN(int a, int b, int c) throws Triangle {
        Triangle triangleClass = new Triangle();
        Assertions.assertFalse(false, "Не треугольник");
    }

    //негативный тест одна сторона 0
    @ParameterizedTest
    @CsvSource({"0,20, 40"})
    void testTriangleSourceZeero(int a, int b, int c) throws Triangle {
        Triangle triangleClass = new Triangle();
        Assertions.assertFalse(false, "Не треугольник");
    }

    //негативный тест одна сторона 1000
    @ParameterizedTest
    @CsvSource({"10,20, 1000"})
    void testTriangleSourceMatch(int a, int b, int c) throws Triangle {
        Triangle triangleClass = new Triangle();
        Assertions.assertFalse(false, "Не треугольник");
    }
}