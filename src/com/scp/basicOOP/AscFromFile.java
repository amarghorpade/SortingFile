package com.scp.basicOOP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class AscFromFile {
	public static void main(String[] args) throws Exception {
		File file = new File("F:\\software\\java\\workspace-sts-3.9.0.RELEASE\\SortingFromFile\\raw_data.txt");
		BufferedReader bfr = new BufferedReader(new FileReader(file));
		String line = null;
		List<GetData> list = new ArrayList();
		GetData gdata = null;
		while ((line = bfr.readLine()) != null) {
			String[] rawdata = line.split(",");
			gdata = new GetData();
			gdata.setName(rawdata[0]);
			gdata.setAge(Integer.parseInt(rawdata[1]));
			gdata.setCity(rawdata[2]);
			list.add(gdata);
		}
		System.out.println("List before sort-- ");
		Iterator<GetData> iterator1 = list.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}

		bfr.close();

		Collections.sort(list, new SortById());
		System.out.println("List after sort---");
		Iterator<GetData> iterator2 = list.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}

		List<String> strings = new ArrayList<>(list.size());
		for (Object object : list) {
			strings.add(Objects.toString(object, null));
		}
		System.out.println("\n");
		System.out.println("list --- " + strings);

		FileWriter fWriter = new FileWriter("F:\\software\\java\\workspace-sts-3.9.0.RELEASE\\SortingFromFile\\sorted_data.txt");
		BufferedWriter bWriter = new BufferedWriter(fWriter);
		System.out.println("\n");
		for (String sdata : strings) {
			bWriter.append(sdata);
			bWriter.append("\n");
		}
		System.out.println("Writing Success...!!");
		bWriter.close();
		fWriter.close();
	}
}