package org.d3ifcool.ima03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.io.*;

public class TestJurnal02 {

    @Test
    public void testHelloWorld() {
        InputStream originalIn = System.in;
        System.setIn(new ByteArrayInputStream("Implementasi Algoritma\n6".getBytes()));

        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        Jurnal02.main(null);

        // assertion
        assertEquals("Aku suka kuliah Implementasi Algoritma.\nKuliah 6 jam per minggu rasanya kurang.\nTambahin dong jadi 12 jam per minggu :)\n", bos.toString());

        // undo the binding in System
        System.setOut(originalOut);
        System.setIn(originalIn);
    }
}
