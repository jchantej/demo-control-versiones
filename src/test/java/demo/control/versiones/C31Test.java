package demo.control.versiones;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C31Test {
    private C31 c31;

    @Before
    public void before() {
        c31 = new C31();
    }

    @Test
    public void testC11m1() {
        assertEquals("C31.m1" ,c31.m1());
    }
    
    @Test
    public void testC11m2() {
        assertEquals("C31.m2" ,c31.m2());
    }


}
