package org.d3ifcool.ima03;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTP02 {

    @Test
    public void testHelloWorld() {
        InputStream originalIn = System.in;
        System.setIn(new ByteArrayInputStream("Indra Azimi\n20".getBytes()));

        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        TP02.main(null);

        // assertion
        assertEquals("Halo, Indra Azimi.\nTernyata usiamu baru20tahun ya!\n", bos.toString());

        // undo the binding in System
        System.setOut(originalOut);
        System.setIn(originalIn);
    }
}
