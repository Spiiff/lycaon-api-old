package com.example.lycaonbck;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class JunitMavenTest {

    @Test
    public void Test() {

        String[] expected = {"happy","days","summer","spring"};
        String[] actual = {"happy","days","summer","spring"};

        assertArrayEquals("Expected and Actual Arrays are not equal",expected,actual);

    }
}
