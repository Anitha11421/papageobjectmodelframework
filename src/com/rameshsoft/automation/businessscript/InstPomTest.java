package com.rameshsoft.automation.businessscript;

import java.io.IOException;

import org.testng.annotations.Test;

import com.automation.Utilities.PojoReader;
import com.automation.base.ActionEngine;
import com.automation.customisedExceptions.FrameworkException;

public class InstPomTest extends ActionEngine{
	@Test
	private void instPomTest() throws FrameworkException, IOException {
		enterUrl(PojoReader.getConfObj().getValue("inst_url"));

	}

	
}
