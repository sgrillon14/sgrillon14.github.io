package com.sgrillon.javasample;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadFile {

	public static void main(String[] args) {

		String contentTxt = "";
		String fileName = "file.txt";

		// Read a text file with java
		try {
			InputStream ips = new FileInputStream(fileName);
			InputStreamReader ipsr = new InputStreamReader(ips);
			BufferedReader br = new BufferedReader(ipsr);
			String line;
			while ((line = br.readLine()) != null) {
				contentTxt += line + "\n";
			}
			br.close();
		} catch (Exception e) {
			System.err.println(e.toString());
		}
		System.out.println(contentTxt);

	}
}
