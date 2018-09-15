package com.javafx.lastnames;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.javafx.lastnames.model.Connection;
import com.javafx.lastnames.model.Lastname;
import com.javafx.lastnames.model.PatternVariety;

public class NameIskra {

	@Test
	public void test() {

		PatternVariety patternVariety = new PatternVariety();
        String[] suffixes = patternVariety.findPattern("Iskra", "M");
        Connection connection = new Connection();
        Lastname lastname = connection.connect("Iskra", suffixes, "M");

        assertEquals("Mianownik", "Iskra", lastname.getNominative().trim());
        assertEquals("Dopełniacz", "Iskry", lastname.getGenitive().trim());
        assertEquals("Celownik", "Iskrze", lastname.getDative().trim());
        assertEquals("Biernik" , "Iskrę", lastname.getAccusative().trim());
        assertEquals("Narzędnik" , "z Iskrą", lastname.getInstrumental().trim());
        assertEquals("Miejscownik" , "o Iskrze", lastname.getLocative().trim());
        assertEquals("Wołacz" , "Iskro", lastname.getVocative().trim());


	}

	@Test
	public void test2() {

		PatternVariety patternVariety = new PatternVariety();
        String[] suffixes = patternVariety.findPattern("Iskra", "K");
        Connection connection = new Connection();
        Lastname lastname = connection.connect("Iskra", suffixes, "K");



        assertEquals("Mianownik", "Iskra", lastname.getNominative().trim());
        assertEquals("Dopełniacz", "Iskry", lastname.getGenitive().trim());
        assertEquals("Celownik", "Iskrze", lastname.getDative().trim());
        assertEquals("Biernik" , "Iskrę", lastname.getAccusative().trim());
        assertEquals("Narzędnik" , "z Iskrą", lastname.getInstrumental().trim());
        assertEquals("Miejscownik" , "o Iskrze", lastname.getLocative().trim());
        assertEquals("Wołacz" , "Iskro", lastname.getVocative().trim());


	}

	@Test
	public void test3() {

		PatternVariety patternVariety = new PatternVariety();
        String[] suffixes = patternVariety.findPattern("Iskra", "P");
        Connection connection = new Connection();
        Lastname lastname = connection.connect("Iskra", suffixes, "P");



        assertEquals("Mianownik", "Iskrowie", lastname.getNominative().trim());
        assertEquals("Dopełniacz", "Iskrów", lastname.getGenitive().trim());
        assertEquals("Celownik", "Iskrom", lastname.getDative().trim());
        assertEquals("Biernik" , "Iskrów", lastname.getAccusative().trim());
        assertEquals("Narzędnik" , "z Iskrami", lastname.getInstrumental().trim());
        assertEquals("Miejscownik" , "o Iskrach", lastname.getLocative().trim());
        assertEquals("Wołacz" , "Iskrowie", lastname.getVocative().trim());


	}


}
