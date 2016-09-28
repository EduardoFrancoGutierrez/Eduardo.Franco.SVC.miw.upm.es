package es.upm.miw.iwvg.test;

import static org.junit.Assert.*;

import org.junit.Test;

import es.upm.miw.iwvg.clase.C52;

public class C52Test {

    @Test
    public void testMA() {
        C52 c52 = new C52 ();
        assertEquals("mA", c52.mA());
    }

}
