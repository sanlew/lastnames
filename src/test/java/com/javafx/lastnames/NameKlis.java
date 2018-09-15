package com.javafx.lastnames;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.javafx.lastnames.model.Connection;
import com.javafx.lastnames.model.Lastname;
import com.javafx.lastnames.model.PatternVariety;

public class NameKlis {

	@Test
	public void test() {

		PatternVariety patternVariety = new PatternVariety();
        String[] suffixes = patternVariety.findPattern("Kliś", "M");
        Connection connection = new Connection();
        Lastname lastname = connection.connect("Kliś", suffixes, "M");

        assertEquals("Mianownik", "Kliś", lastname.getNominative().trim());
        assertEquals("Dopełniacz", "Klisia", lastname.getGenitive().trim());
        assertEquals("Celownik", "Klisiowi", lastname.getDative().trim());
        assertEquals("Biernik" , "Klisia", lastname.getAccusative().trim());
        assertEquals("Narzędnik" , "z Klisiem", lastname.getInstrumental().trim());
        assertEquals("Miejscownik" , "o Klisiu", lastname.getLocative().trim());
        assertEquals("Wołacz" , "Klisiu", lastname.getVocative().trim());


	}

	@Test
	public void test2() {

		PatternVariety patternVariety = new PatternVariety();
        String[] suffixes = patternVariety.findPattern("Kliś", "K");
        Connection connection = new Connection();
        Lastname lastname = connection.connect("Kliś", suffixes, "K");



        assertEquals("Mianownik", "Kliś", lastname.getNominative().trim());
        assertEquals("Dopełniacz", "Kliś", lastname.getGenitive().trim());
        assertEquals("Celownik", "Kliś", lastname.getDative().trim());
        assertEquals("Biernik" , "Kliś", lastname.getAccusative().trim());
        assertEquals("Narzędnik" , "z Kliś", lastname.getInstrumental().trim());
        assertEquals("Miejscownik" , "o Kliś", lastname.getLocative().trim());
        assertEquals("Wołacz" , "Kliś", lastname.getVocative().trim());


	}

	@Test
	public void test3() {

		PatternVariety patternVariety = new PatternVariety();
        String[] suffixes = patternVariety.findPattern("Kliś", "P");
        Connection connection = new Connection();
        Lastname lastname = connection.connect("Kliś", suffixes, "P");



        assertEquals("Mianownik", "Klisiowie", lastname.getNominative().trim());
        assertEquals("Dopełniacz", "Klisiów", lastname.getGenitive().trim());
        assertEquals("Celownik", "Klisiom", lastname.getDative().trim());
        assertEquals("Biernik" , "Klisiów", lastname.getAccusative().trim());
        assertEquals("Narzędnik" , "z Klisiami", lastname.getInstrumental().trim());
        assertEquals("Miejscownik" , "o Klisiach", lastname.getLocative().trim());
        assertEquals("Wołacz" , "Klisiowie", lastname.getVocative().trim());


	}

}
