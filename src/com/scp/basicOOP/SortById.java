package com.scp.basicOOP;

import java.util.Comparator;

public class SortById implements Comparator<GetData> {
	@Override
	public int compare(GetData o1, GetData o2) {
		return o1.getAge() - o2.getAge();
	}

}
