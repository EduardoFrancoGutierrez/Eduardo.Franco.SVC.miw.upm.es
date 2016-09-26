package es.upm.miw.iwvg.test;

import static org.junit.Assert.*;

import org.junit.Test;

import es.upm.miw.iwvg.clase.C32;

public class C32Test {

    @Test
    public void testMA() {
        C32 c32 = new C32();
        assertEquals("mA",c32.mA());
    }

}
