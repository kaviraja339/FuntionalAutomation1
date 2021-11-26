package com.automationpractice.testcases;

import java.io.IOException;
import java.util.HashMap;

import com.automationpractice.utilities.CommonUtil;

public class Dataprovidertest {
	
	
	
	
	public static void sample() throws IOException {
		
		HashMap<String, String[]> map = CommonUtil.readdata();
		System.out.println(map.get("Username")[0]);
		
	}
	
	public static void main(String[] args) throws IOException {
		sample();
	}

}
