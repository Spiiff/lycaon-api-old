package com.example.lycaonbck;

import org.junit.Test;
import org.junit.Assert;

public class JunitTest {

    @Test
    public void Test() {

        String str1 = "Happy";
        String str2 = new String("Happy");
        Assert.assertEquals("String1 and String 2 are equal",str1, str2);

    }
}
