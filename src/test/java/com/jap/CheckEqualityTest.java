package com.jap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckEqualityTest {

    CheckEquality checkEquality;
    @Before
    public void setUp() {
        checkEquality = new CheckEquality();
    }

    @After
    public void tearDown()  {
        checkEquality = null;
    }

    @Test
    public void checkEqualityOfStringWithNewKeywordSuccess() {
        String str1 = new String("Johny");
        String str2 = new String("Johny");
        boolean flag = checkEquality.checkEqualityOfStringWithNewKeyword(str1,str2);
        assertTrue(flag);

    }

    @Test
    public void checkEqualityOfStringWithoutNewKeywordSuccess() {
        String str3 = "Bob";
        String str4 = "Bob";
        boolean flag = checkEquality.checkEqualityOfStringWithoutNewKeyword(str3,str4);
        assertTrue(flag);
    }

    @Test
    public void checkEqualityWithoutNewKeywordSuccess() {
        String str3 = "Tim";
        String str4 = "Tim";
        boolean flag = checkEquality.checkEqualityWithoutNewKeyword(str3,str4);
        assertTrue(flag);


    }

    @Test
    public void checkEqualityWithNewKeywordSuccess() {
        String str1 = new String("Tony");
        String str2 = new String("Tony");
        boolean flag = checkEquality.checkEqualityWithNewKeyword(str1,str2);
        assertFalse(flag);
    }

}