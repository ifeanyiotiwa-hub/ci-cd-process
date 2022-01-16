package dev.gxsoft;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GxsoftApplicationTest {

    @Test
    void should_multiplyTwoInts() {
        assertEquals(130, GxsoftApplication.multiplyTwoInts(13, 10));
    }
}