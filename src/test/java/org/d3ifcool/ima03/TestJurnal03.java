package org.d3ifcool.ima03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.io.*;

public class TestJurnal03 {

    @Test
    public void testHelloWorld() {
        InputStream originalIn = System.in;
        System.setIn(new ByteArrayInputStream("87 81 76".getBytes()));

        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        Jurnal03.main(null);

        // assertion
        assertEquals("80.5\n", bos.toString());

        // undo the binding in System
        System.setOut(originalOut);
        System.setIn(originalIn);
    }
}
