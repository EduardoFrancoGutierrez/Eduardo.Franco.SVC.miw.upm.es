package es.upm.miw.iwvg.test;

import static org.junit.Assert.*;

import org.junit.Test;

import es.upm.miw.iwvg.clase.C51;

public class C51Test {

    @Test
    public void testM1() {
        C51 c51= new C51();
        assertEquals("m1",c51.m1());
    }

    @Test
    public void testM2() {
        C51 c51= new C51();
        assertEquals("m2",c51.m2());
    }

}
