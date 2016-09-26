package es.upm.miw.iwvg.test;

import static org.junit.Assert.*;

import org.junit.Test;

import es.upm.miw.iwvg.clase.C22;


public class C22Test {

    @Test
    public void testMA() {
        C22 c22= new C22();
        assertEquals("mA",c22.mA());
    }

}
