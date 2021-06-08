package com.example.dodawanieio;

import static org.junit.Assert.*;

public class DodawanieIoApplicationTest {

    @org.junit.Test
    public void added() {
        DodawanieIoApplication dodawanieIoApplication= new DodawanieIoApplication();
        assertEquals(10,dodawanieIoApplication.added(5,5));
    }
}