package es.upm.miw.iwvg.test;

import static org.junit.Assert.*;

import org.junit.Test;

import es.upm.miw.iwvg.clase.C21;

public class C21Test {

    @Test
    public void testM1() {
      C21 c21= new C21();
      assertEquals("m1",c21.m1());
    }

    @Test
    public void testM2() {
        C21 c21= new C21();
        assertEquals("m2",c21.m2());
    }

}
