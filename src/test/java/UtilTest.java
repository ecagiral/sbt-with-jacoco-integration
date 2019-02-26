package com.ecagiral;

import org.junit.Test;
import com.ecagiral.Util;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class UtilTest{

	@Test
	public void testJob(){
		System.out.println("!!!testing UtilTest.test()!!!");
		int result = Util.doJob();
		assertEquals(2,result);
	}

	@Test
	public void testInit(){
		System.out.println("!!!testing UtilTest init!!!");
		Util util = new Util();
		assertNotNull(util);
	}

}