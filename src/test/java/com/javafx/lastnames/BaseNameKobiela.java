package com.javafx.lastnames;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.javafx.lastnames.model.Connection;
import com.javafx.lastnames.model.Lastname;


public class BaseNameKobiela {

	@Test
	public void test() {
		 String[] suffixes = {"","","","","","","","",""};
	        Connection connection = new Connection();
        Lastname lastname = connection.connect("Kobiela", suffixes, "M");

        assertEquals("Mianownik", "Kobiela", lastname.getNominative().trim());
        assertEquals("Dopełniacz", "Kobieli", lastname.getGenitive().trim());
        assertEquals("Celownik", "Kobieli", lastname.getDative().trim());
        assertEquals("Biernik" , "Kobielę", lastname.getAccusative().trim());
        assertEquals("Narzędnik" , "z Kobielą", lastname.getInstrumental().trim());
        assertEquals("Miejscownik" , "o Kobieli", lastname.getLocative().trim());
        assertEquals("Wołacz" , "Kobielo", lastname.getVocative().trim());


	}

	@Test
	public void test2() {

		 String[] suffixes = {"","","","","","","","",""};
	        Connection connection = new Connection();
        Lastname lastname = connection.connect("Kobiela", suffixes, "K");



        assertEquals("Mianownik", "Kobiela", lastname.getNominative().trim());
        assertEquals("Dopełniacz", "Kobieli", lastname.getGenitive().trim());
        assertEquals("Celownik", "Kobieli", lastname.getDative().trim());
        assertEquals("Biernik" , "Kobielę", lastname.getAccusative().trim());
        assertEquals("Narzędnik" , "z Kobielą", lastname.getInstrumental().trim());
        assertEquals("Miejscownik" , "o Kobieli", lastname.getLocative().trim());
        assertEquals("Wołacz" , "Kobielo", lastname.getVocative().trim());


	}

	@Test
	public void test3() {

		 String[] suffixes = {"","","","","","","","",""};
	        Connection connection = new Connection();
        Lastname lastname = connection.connect("Kobiela", suffixes, "P");



        assertEquals("Mianownik", "Kobielowie", lastname.getNominative().trim());
        assertEquals("Dopełniacz", "Kobielów", lastname.getGenitive().trim());
        assertEquals("Celownik", "Kobielom", lastname.getDative().trim());
        assertEquals("Biernik" , "Kobielów", lastname.getAccusative().trim());
        assertEquals("Narzędnik" , "z Kobielami", lastname.getInstrumental().trim());
        assertEquals("Miejscownik" , "o Kobielach", lastname.getLocative().trim());
        assertEquals("Wołacz" , "Kobielowie", lastname.getVocative().trim());


	}


}
