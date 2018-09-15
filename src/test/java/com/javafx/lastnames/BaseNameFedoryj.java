package com.javafx.lastnames;

import static org.junit.Assert.*;

import org.junit.Test;

import com.javafx.lastnames.model.Connection;
import com.javafx.lastnames.model.Lastname;

public class BaseNameFedoryj {

		@Test
		public void test() {

	        String[] suffixes = {"","","","","","","","",""};
	        Connection connection = new Connection();
	        Lastname lastname = connection.connect("Fedoryj", suffixes, "M");

	        assertEquals("Mianownik", "Fedoryj", lastname.getNominative().trim());
	        assertEquals("Dopełniacz", "Fedoryja", lastname.getGenitive().trim());
	        assertEquals("Celownik", "Fedoryjowi", lastname.getDative().trim());
	        assertEquals("Biernik" , "Fedoryja", lastname.getAccusative().trim());
	        assertEquals("Narzędnik" , "z Fedoryjem", lastname.getInstrumental().trim());
	        assertEquals("Miejscownik" , "o Fedoryju", lastname.getLocative().trim());
	        assertEquals("Wołacz" , "Fedoryju", lastname.getVocative().trim());


		}

		@Test
		public void test2() {

			   String[] suffixes = {"","","","","","","","",""};
		     Connection connection = new Connection();
	        Lastname lastname = connection.connect("Fedoryj", suffixes, "K");



	        assertEquals("Mianownik", "Fedoryj", lastname.getNominative().trim());
	        assertEquals("Dopełniacz", "Fedoryj", lastname.getGenitive().trim());
	        assertEquals("Celownik", "Fedoryj", lastname.getDative().trim());
	        assertEquals("Biernik" , "Fedoryj", lastname.getAccusative().trim());
	        assertEquals("Narzędnik" , "z Fedoryj", lastname.getInstrumental().trim());
	        assertEquals("Miejscownik" , "o Fedoryj", lastname.getLocative().trim());
	        assertEquals("Wołacz" , "Fedoryj", lastname.getVocative().trim());


		}

		@Test
		public void test3() {
			   String[] suffixes = {"","","","","","","","",""};
		        Connection connection = new Connection();
	        Lastname lastname = connection.connect("Fedoryj", suffixes, "P");



	        assertEquals("Mianownik", "Fedoryjowie", lastname.getNominative().trim());
	        assertEquals("Dopełniacz", "Fedoryjów", lastname.getGenitive().trim());
	        assertEquals("Celownik", "Fedoryjom", lastname.getDative().trim());
	        assertEquals("Biernik" , "Fedoryjów", lastname.getAccusative().trim());
	        assertEquals("Narzędnik" , "z Fedoryjami", lastname.getInstrumental().trim());
	        assertEquals("Miejscownik" , "o Fedoryjach", lastname.getLocative().trim());
	        assertEquals("Wołacz" , "Fedoryjowie", lastname.getVocative().trim());


		}


}
