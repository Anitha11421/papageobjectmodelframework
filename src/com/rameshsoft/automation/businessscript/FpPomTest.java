package com.rameshsoft.automation.businessscript;

import java.io.IOException;

import org.testng.annotations.Test;

import com.automation.Utilities.PojoReader;
import com.automation.base.ActionEngine;
import com.automation.customisedExceptions.FrameworkException;

public class FpPomTest extends ActionEngine {
	
	
	@Test
	public void fpPomTest() throws FrameworkException, IOException {
		enterUrl(PojoReader.getConfObj().getValue("fp_url"));

	}

	
}
