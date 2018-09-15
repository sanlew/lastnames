package com.javafx.lastnames;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.javafx.lastnames.model.Connection;
import com.javafx.lastnames.model.Lastname;

public class BaseNameKleszcz {

	@Test
	public void test() {

		 String[] suffixes = {"","","","","","","","",""};
	        Connection connection = new Connection();
        Lastname lastname = connection.connect("Kleszcz", suffixes, "M");

        assertEquals("Mianownik", "Kleszcz", lastname.getNominative().trim());
        assertEquals("Dopełniacz", "Kleszcza", lastname.getGenitive().trim());
        assertEquals("Celownik", "Kleszczowi", lastname.getDative().trim());
        assertEquals("Biernik" , "Kleszcza", lastname.getAccusative().trim());
        assertEquals("Narzędnik" , "z Kleszczem", lastname.getInstrumental().trim());
        assertEquals("Miejscownik" , "o Kleszczu", lastname.getLocative().trim());
        assertEquals("Wołacz" , "Kleszczu", lastname.getVocative().trim());


	}

	@Test
	public void test2() {

		 String[] suffixes = {"","","","","","","","",""};
	        Connection connection = new Connection();
        Lastname lastname = connection.connect("Kleszcz", suffixes, "K");



        assertEquals("Mianownik", "Kleszcz", lastname.getNominative().trim());
        assertEquals("Dopełniacz", "Kleszcz", lastname.getGenitive().trim());
        assertEquals("Celownik", "Kleszcz", lastname.getDative().trim());
        assertEquals("Biernik" , "Kleszcz", lastname.getAccusative().trim());
        assertEquals("Narzędnik" , "z Kleszcz", lastname.getInstrumental().trim());
        assertEquals("Miejscownik" , "o Kleszcz", lastname.getLocative().trim());
        assertEquals("Wołacz" , "Kleszcz", lastname.getVocative().trim());


	}

	@Test
	public void test3() {

		 String[] suffixes = {"","","","","","","","",""};
	        Connection connection = new Connection();
        Lastname lastname = connection.connect("Kleszcz", suffixes, "P");



        assertEquals("Mianownik", "Kleszczowie", lastname.getNominative().trim());
        assertEquals("Dopełniacz", "Kleszczów", lastname.getGenitive().trim());
        assertEquals("Celownik", "Kleszczom", lastname.getDative().trim());
        assertEquals("Biernik" , "Kleszczów", lastname.getAccusative().trim());
        assertEquals("Narzędnik" , "z Kleszczami", lastname.getInstrumental().trim());
        assertEquals("Miejscownik" , "o Kleszczach", lastname.getLocative().trim());
        assertEquals("Wołacz" , "Kleszczowie", lastname.getVocative().trim());


	}


}
