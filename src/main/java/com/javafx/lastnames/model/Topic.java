package com.javafx.lastnames.model;

public class Topic {
	
	private String topic;
	private char lastLetter;
	
	
	public String findTopic(String name, String type){
		
		lastLetter = name.charAt(name.length()-1);
		topic = name;
		char lastLettersM [] = {'a','ń','ć','ś','ź','o','t','ł', 'y', 'u'};
		String lastTwoLettersM [] ={"ek", "eł", "ga", "el", "ja", "ka", "ra", "to", 
				"ta", "ko", "ro", "ha", "ła", "go", "ór", "ół", "ób", "óg", "óz","ho","ło"};
		String lastTreeLettersM [] ={"iek", "ieł", "cha"};
		
		char lastLettersP [] = {'a','ń','ć','ś','ź','o','ł', 'y', 'u', 'i', 'e'};
		String lastTwoLettersP [] ={"ek", "eł", "el",  
				"ór", "ół", "ób", "óg", "óz", "ży","ki","ły", "ty", "dy"};
		String lastTreeLettersP [] ={"iek", "ieł"};
		
		
		
		
		
		if(type.contains("P")){
			

			for (char letter:lastLettersP){
				if(lastLetter == letter)
					topic = name.substring(0, name.length()-1);
				}
			
			
			for (String suffix : lastTwoLettersP){
				
				if(name.substring(name.length()-2, name.length()).contains(suffix)){
					topic = name.substring(0, name.length()-2);
				}
				}
			
			for (String suffix : lastTreeLettersP){
				if(name.substring(name.length()-3, name.length()).contains(suffix)){
					topic = name.substring(0, name.length()-3);
				}
				}
		
		}
		
		if(type.contains("M")){
			
			for (char letter:lastLettersM){
				if(lastLetter == letter)
					topic = name.substring(0, name.length()-1);
				}
			
			
			for (String suffix : lastTwoLettersM){
				
				if(name.substring(name.length()-2, name.length()).contains(suffix)){
					topic = name.substring(0, name.length()-2);
				}
				}
			
			for (String suffix : lastTreeLettersM){
				if(name.substring(name.length()-3, name.length()).contains(suffix)){
					topic = name.substring(0, name.length()-3);
				}
				}
			
		}
		
		if(type.contains("K")){
			
			if(name.substring(name.length()-1, name.length()).contains("a") ||
					name.substring(name.length()-1, name.length()).contains("i") ||
					name.substring(name.length()-1, name.length()).contains("y"))
				topic = name.substring(0, name.length()-1);
			
			if(name.substring(name.length()-2, name.length()).contains("ga")||
					name.substring(name.length()-2, name.length()).contains("ja")||
					name.substring(name.length()-2, name.length()).contains("ka") ||
					name.substring(name.length()-2, name.length()).contains("ra") ||
					name.substring(name.length()-2, name.length()).contains("ta") ||
					name.substring(name.length()-2, name.length()).contains("ha") ||
					name.substring(name.length()-2, name.length()).contains("ła"))
				topic = name.substring(0, name.length()-2);
			
			
			
			if(name.substring(name.length()-3, name.length()).contains("cha"))
				topic = name.substring(0, name.length()-3);
			
			
		}
		
		return topic;
		
	}

}
