package com.javafx.lastnames;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.javafx.lastnames.model.Connection;
import com.javafx.lastnames.model.Lastname;
import com.javafx.lastnames.model.PatternVariety;

public class NameKobiela {

	@Test
	public void test() {

		PatternVariety patternVariety = new PatternVariety();
        String[] suffixes = patternVariety.findPattern("Kobiela", "M");
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

		PatternVariety patternVariety = new PatternVariety();
        String[] suffixes = patternVariety.findPattern("Kobiela", "K");
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

		PatternVariety patternVariety = new PatternVariety();
        String[] suffixes = patternVariety.findPattern("Kobiela", "P");
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
