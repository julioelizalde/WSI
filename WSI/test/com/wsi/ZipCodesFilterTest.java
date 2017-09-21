package com.wsi;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ZipCodesFilterTest {

	@Test
	public void test1() {
		//input for this test = [94133,94133] [94200,94299] [94600,94699]
		ArrayList<ZipCodeInterval> zipCodes = new ArrayList<>();
		zipCodes.add(new ZipCodeInterval(94133, 94133));
		zipCodes.add(new ZipCodeInterval(94200, 94299));
		zipCodes.add(new ZipCodeInterval(94600, 94699));
		
		//expected results for this test  = [94133,94133] [94200,94299] [94600,94699]
		ArrayList<ZipCodeInterval> expected = new ArrayList<>();
		expected.add(new ZipCodeInterval(94133, 94133));
		expected.add(new ZipCodeInterval(94200, 94299));
		expected.add(new ZipCodeInterval(94600, 94699));
		
	
		//method resutls 
		ArrayList<ZipCodeInterval> actual = ZipCodesFilter.filterZipCodes(zipCodes);
		
		assertEquals(expected, actual);
		
	}
	
	
	@Test
	public void test2() {
		//input for this test = [94133,94133] [94200,94299] [94226,94399]
		ArrayList<ZipCodeInterval> zipCodes = new ArrayList<>();
		zipCodes.add(new ZipCodeInterval(94133, 94133));
		zipCodes.add(new ZipCodeInterval(94200, 94299));
		zipCodes.add(new ZipCodeInterval(94226, 94399));
		
		//expected results for this test  = [94133,94133] [94200,94399]
		ArrayList<ZipCodeInterval> expected = new ArrayList<>();
		expected.add(new ZipCodeInterval(94133, 94133));
		expected.add(new ZipCodeInterval(94200, 94399));
		
	
		//method resutls 
		ArrayList<ZipCodeInterval> actual = ZipCodesFilter.filterZipCodes(zipCodes);
		
		assertEquals(expected, actual);
		
		
	}
	
	@Test
	public void test3() {
		//input for this test = [94133,94133] [94200,94299] [94226,94399]
		ArrayList<ZipCodeInterval> zipCodes = new ArrayList<>();
		;
		zipCodes.add(new ZipCodeInterval(94200, 94299));
		zipCodes.add(new ZipCodeInterval(94226, 94399));
		zipCodes.add(new ZipCodeInterval(94100, 94800));
		zipCodes.add(new ZipCodeInterval(94133, 94133));
		
		
		//expected results for this test  = [94100,94800]
		ArrayList<ZipCodeInterval> expected = new ArrayList<>();
		expected.add(new ZipCodeInterval(94100, 94800));
		
	
		//method resutls 
		ArrayList<ZipCodeInterval> actual = ZipCodesFilter.filterZipCodes(zipCodes);
		
		assertEquals(expected, actual);
		
		
	}
	

}
