package com.kodewala.interf_day41.part01;

public class DataCleaner {
	public void clean(Object object) {
		if(object instanceof Cleanable) {
			System.out.println(" Allowed to perform the data cleaning.");
//			100 lines of codes (logic)
		} else {
			System.err.println(" Not allowed to perform cleaning activity.");
		}
	}
}
