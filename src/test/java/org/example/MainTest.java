package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void divisibility() {
        int n = 1;
        List<String> list = Main.divisibility(n);
        List<String> expected = new ArrayList<>();
        expected.add("1");

        assertEquals(expected, list);
    }

    @Test
    void inverted() {
        String expected = "gaws";

        assertEquals(expected, Main.inverted("swag"));
    }


    @Test
    void discrimant() {

        List<String> list = Main.discrimant(1, -2,-3);
        List<String> expected = List.of(
                "3.0",
                "-1.0"
        );

        assertEquals(expected, list);
    }

    @Test
    void SumOfTheSeries() {

        double res = Main.SumOfTheSeries();
        double expected = 0.6101121094474383;

        assertEquals(expected, res);
    }


    @Test
    void palindrom() {

        boolean list1 = Main.palindrom("mam");
        boolean list2 = Main.palindrom("man");

        assertTrue(list1);
        assertFalse(list2);

    }
}