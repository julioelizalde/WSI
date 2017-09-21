package com.wsi;

import java.util.Comparator;

public class ZipCodeIntervalComparator implements Comparator<ZipCodeInterval> {

	@Override
	public int compare(ZipCodeInterval o1, ZipCodeInterval o2) {

		return o1.getStart() - o2.getStart();

	}

}
