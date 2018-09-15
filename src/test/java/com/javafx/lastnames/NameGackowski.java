package com.javafx.lastnames;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.javafx.lastnames.model.Connection;
import com.javafx.lastnames.model.Lastname;
import com.javafx.lastnames.model.PatternVariety;


public class NameGackowski {

		@Test
		public void test() {

			PatternVariety patternVariety = new PatternVariety();
	        String[] suffixes = patternVariety.findPattern("Gackowski", "M");
	        Connection connection = new Connection();
	        Lastname lastname = connection.connect("Gackowski", suffixes, "M");

	        assertEquals("Mianownik", "Gackowski", lastname.getNominative().trim());
	        assertEquals("Dopełniacz", "Gackowskiego", lastname.getGenitive().trim());
	        assertEquals("Celownik", "Gackowskiemu", lastname.getDative().trim());
	        assertEquals("Biernik" , "Gackowskiego", lastname.getAccusative().trim());
	        assertEquals("Narzędnik" , "z Gackowskim", lastname.getInstrumental().trim());
	        assertEquals("Miejscownik" , "o Gackowskim", lastname.getLocative().trim());
	        assertEquals("Wołacz" , "Gackowski", lastname.getVocative().trim());


		}

		@Test
		public void test2() {

			PatternVariety patternVariety = new PatternVariety();
	        String[] suffixes = patternVariety.findPattern("Gackowski", "K");
	        Connection connection = new Connection();
	        Lastname lastname = connection.connect("Gackowski", suffixes, "K");



	        assertEquals("Mianownik", "Gackowska", lastname.getNominative().trim());
	        assertEquals("Dopełniacz", "Gackowskiej", lastname.getGenitive().trim());
	        assertEquals("Celownik", "Gackowskiej", lastname.getDative().trim());
	        assertEquals("Biernik" , "Gackowską", lastname.getAccusative().trim());
	        assertEquals("Narzędnik" , "z Gackowską", lastname.getInstrumental().trim());
	        assertEquals("Miejscownik" , "o Gackowskiej", lastname.getLocative().trim());
	        assertEquals("Wołacz" , "Gackowska", lastname.getVocative().trim());


		}

		@Test
		public void test3() {

			PatternVariety patternVariety = new PatternVariety();
	        String[] suffixes = patternVariety.findPattern("Gackowski", "P");
	        Connection connection = new Connection();
	        Lastname lastname = connection.connect("Gackowski", suffixes, "P");



	        assertEquals("Mianownik", "Gackowscy", lastname.getNominative().trim());
	        assertEquals("Dopełniacz", "Gackowskich", lastname.getGenitive().trim());
	        assertEquals("Celownik", "Gackowskim", lastname.getDative().trim());
	        assertEquals("Biernik" , "Gackowskich", lastname.getAccusative().trim());
	        assertEquals("Narzędnik" , "z Gackowskimi", lastname.getInstrumental().trim());
	        assertEquals("Miejscownik" , "o Gackowskich", lastname.getLocative().trim());
	        assertEquals("Wołacz" , "Gackowscy", lastname.getVocative().trim());


		}


}
