package com.ecagiral;

import org.junit.Test;
import com.ecagiral.Util;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class UtilItTest{

	@Test
	public void testOtherJob(){
		System.out.println("!!!testing UtilTest.test()!!!");
		int result = Util.doOtherJob();
		assertEquals(3,result);
	}

}