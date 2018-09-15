package com.javafx.lastnames.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PatternVariety {

	private String name;
	private Boolean regexpMatch;


	public String []  findPattern(String name, String type ){

		String line;
	    String variety [] = null;
	    String pattern = "";
	    regexpMatch = false;


	    try {
	    InputStream is = getClass().getResourceAsStream("/declension");
	    InputStreamReader isr = new InputStreamReader(is);
	    BufferedReader br = new BufferedReader(isr);
	    StringBuffer sb = new StringBuffer();

			while ((line = br.readLine()) != null && !regexpMatch)
			{
				if(line.startsWith(type)){
			    	variety = line.split(",");
			    	pattern = variety[1];
			    	regexpMatch = checkRegexpMatch(pattern, name);
				}
				if(!regexpMatch)
					variety = null;

			}

	    br.close();
	    isr.close();
	    is.close();
	    } catch (IOException e) {
			e.printStackTrace();
		}


		return variety;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	private boolean checkRegexpMatch(String p, String n){
		Pattern pat = Pattern.compile(p);
		Matcher m = pat.matcher(n);
		return m.find();

	}
}
