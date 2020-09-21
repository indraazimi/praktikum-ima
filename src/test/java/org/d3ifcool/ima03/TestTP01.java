package org.d3ifcool.ima03;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTP01 {

    @Test
    public void testHelloWorld() {
        InputStream originalIn = System.in;
        System.setIn(new ByteArrayInputStream("10000 30".getBytes()));

        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        TP01.main(null);

        // assertion
        assertEquals("300000\n", bos.toString());

        // undo the binding in System
        System.setOut(originalOut);
        System.setIn(originalIn);
    }
}
