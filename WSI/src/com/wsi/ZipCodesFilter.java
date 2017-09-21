package com.wsi;

import java.util.ArrayList;
import java.util.Collections;

public class ZipCodesFilter {

	public static ArrayList<ZipCodeInterval> filterZipCodes(ArrayList<ZipCodeInterval> zipCodes) {

		if (zipCodes.size() == 0 || zipCodes.size() == 1) {

			return zipCodes;

		}

		ZipCodeIntervalComparator c = new ZipCodeIntervalComparator();

		Collections.sort(zipCodes, c);

		ZipCodeInterval firstZipCodeInterval = zipCodes.get(0);
		int start = firstZipCodeInterval.getStart();
		int end = firstZipCodeInterval.getEnd();

		ArrayList<ZipCodeInterval> filteredZipCodes = new ArrayList<ZipCodeInterval>();

		for (int i = 1; i < zipCodes.size(); i++) {

			ZipCodeInterval currInterval = zipCodes.get(i);

			if (currInterval.getStart() <= end) {
				end = Math.max(currInterval.getEnd(), end);

			} else {
				filteredZipCodes.add(new ZipCodeInterval(start, end));
				start = currInterval.getStart();
				end = currInterval.getEnd();
			}

		}

		filteredZipCodes.add(new ZipCodeInterval(start, end));

		return filteredZipCodes;

	}
}
