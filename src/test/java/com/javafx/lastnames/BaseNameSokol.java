package com.javafx.lastnames;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.javafx.lastnames.model.Connection;
import com.javafx.lastnames.model.Lastname;


public class BaseNameSokol {

	@Test
	public void test() {

		 String[] suffixes = {"","","","","","","","",""};
	        Connection connection = new Connection();
        Lastname lastname = connection.connect("Sokół", suffixes, "M");

        assertEquals("Mianownik", "Sokół", lastname.getNominative().trim());
        assertEquals("Dopełniacz", "Sokoła", lastname.getGenitive().trim());
        assertEquals("Celownik", "Sokołowi", lastname.getDative().trim());
        assertEquals("Biernik" , "Sokoła", lastname.getAccusative().trim());
        assertEquals("Narzędnik" , "z Sokołem", lastname.getInstrumental().trim());
        assertEquals("Miejscownik" , "o Sokole", lastname.getLocative().trim());
        assertEquals("Wołacz" , "Sokole", lastname.getVocative().trim());


	}

	@Test
	public void test2() {

		 String[] suffixes = {"","","","","","","","",""};
	        Connection connection = new Connection();
        Lastname lastname = connection.connect("Sokół", suffixes, "K");



        assertEquals("Mianownik", "Sokół", lastname.getNominative().trim());
        assertEquals("Dopełniacz", "Sokół", lastname.getGenitive().trim());
        assertEquals("Celownik", "Sokół", lastname.getDative().trim());
        assertEquals("Biernik" , "Sokół", lastname.getAccusative().trim());
        assertEquals("Narzędnik" , "z Sokół", lastname.getInstrumental().trim());
        assertEquals("Miejscownik" , "o Sokół", lastname.getLocative().trim());
        assertEquals("Wołacz" , "Sokół", lastname.getVocative().trim());


	}

	@Test
	public void test3() {

		 String[] suffixes = {"","","","","","","","",""};
	        Connection connection = new Connection();
        Lastname lastname = connection.connect("Sokół", suffixes, "P");



        assertEquals("Mianownik", "Sokołowie", lastname.getNominative().trim());
        assertEquals("Dopełniacz", "Sokołów", lastname.getGenitive().trim());
        assertEquals("Celownik", "Sokołom", lastname.getDative().trim());
        assertEquals("Biernik" , "Sokołów", lastname.getAccusative().trim());
        assertEquals("Narzędnik" , "z Sokołami", lastname.getInstrumental().trim());
        assertEquals("Miejscownik" , "o Sokołach", lastname.getLocative().trim());
        assertEquals("Wołacz" , "Sokołowie", lastname.getVocative().trim());


	}

}
