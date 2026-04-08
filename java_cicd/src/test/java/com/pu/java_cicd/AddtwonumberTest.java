package com.pu.java_cicd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

	public class AddtwonumberTest {
	    @Test
	    void testAdd()
	 {
	        Addtwonumber calc = new Addtwonumber();
	        int result = calc.add(2, 3);
	        assertEquals(5, result, "Addition should return 5");
	    }
	    @Test
	    void testSubtract() 
	{
	    	Addtwonumber calc = new Addtwonumber();
	        int result = calc.subtract(2, 3);
	        assertEquals(-1, result, "Subtraction should return -1");
	    }
	}

