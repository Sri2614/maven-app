package com.balaji.maven.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class JenkinsCalcTest {

	@Test
	public void multest() {
		JenkinsCalc myCalc = new JenkinsCalc();
		assertEquals(10,myCalc.mulNumbers(5,5));
	}
	
	@Test
	public void divtest() {
		JenkinsCalc myCalc = new JenkinsCalc();
		assertEquals(5,myCalc.divNumbers(10,5));
	}

}
