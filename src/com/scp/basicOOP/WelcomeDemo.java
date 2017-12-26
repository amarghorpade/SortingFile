package com.scp.basicOOP;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PushbackReader;
import java.util.ArrayList;
import java.util.List;

public class WelcomeDemo {
	public static void main(String[] args) throws Exception {

		File file = new File("F:\\software\\java\\workspace-sts-3.9.0.RELEASE\\Basics\\raw_data.txt");
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		String line = null;
		List<GetData> list = new ArrayList();
		GetData gdata = null;
		while ((line = bufferedReader.readLine()) != null) {
			String[] rawdata = line.split(",");
			// System.out.println("length of-- "+rawdata.length);
			gdata = new GetData();
			gdata.setName(rawdata[0]);
			gdata.setAge(Integer.parseInt(rawdata[1]));
			gdata.setCity(rawdata[2]);
			list.add(gdata);
		}
		System.out.println("List-- \n" + list);
		bufferedReader.close();
	}
}
