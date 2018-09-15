package com.javafx.lastnames;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.javafx.lastnames.model.Connection;
import com.javafx.lastnames.model.Lastname;
import com.javafx.lastnames.model.PatternVariety;

public class NameGrobelny {

	@Test
	public void test() {

		PatternVariety patternVariety = new PatternVariety();
        String[] suffixes = patternVariety.findPattern("Grobelny", "M");
        Connection connection = new Connection();
        Lastname lastname = connection.connect("Grobelny", suffixes, "M");

        assertEquals("Mianownik", "Grobelny", lastname.getNominative().trim());
        assertEquals("Dopełniacz", "Grobelnego", lastname.getGenitive().trim());
        assertEquals("Celownik", "Grobelnemu", lastname.getDative().trim());
        assertEquals("Biernik" , "Grobelnego", lastname.getAccusative().trim());
        assertEquals("Narzędnik" , "z Grobelnym", lastname.getInstrumental().trim());
        assertEquals("Miejscownik" , "o Grobelnym", lastname.getLocative().trim());
        assertEquals("Wołacz" , "Grobelny", lastname.getVocative().trim());


	}

	@Test
	public void test2() {

		PatternVariety patternVariety = new PatternVariety();
        String[] suffixes = patternVariety.findPattern("Grobelny", "K");
        Connection connection = new Connection();
        Lastname lastname = connection.connect("Grobelny", suffixes, "K");



        assertEquals("Mianownik", "Grobelna", lastname.getNominative().trim());
        assertEquals("Dopełniacz", "Grobelnej", lastname.getGenitive().trim());
        assertEquals("Celownik", "Grobelnej", lastname.getDative().trim());
        assertEquals("Biernik" , "Grobelną", lastname.getAccusative().trim());
        assertEquals("Narzędnik" , "z Grobelną", lastname.getInstrumental().trim());
        assertEquals("Miejscownik" , "o Grobelnej", lastname.getLocative().trim());
        assertEquals("Wołacz" , "Grobelna", lastname.getVocative().trim());


	}

	@Test
	public void test3() {

		PatternVariety patternVariety = new PatternVariety();
        String[] suffixes = patternVariety.findPattern("Grobelny", "P");
        Connection connection = new Connection();
        Lastname lastname = connection.connect("Grobelny", suffixes, "P");



        assertEquals("Mianownik", "Grobelni", lastname.getNominative().trim());
        assertEquals("Dopełniacz", "Grobelnych", lastname.getGenitive().trim());
        assertEquals("Celownik", "Grobelnym", lastname.getDative().trim());
        assertEquals("Biernik" , "Grobelnych", lastname.getAccusative().trim());
        assertEquals("Narzędnik" , "z Grobelnymi", lastname.getInstrumental().trim());
        assertEquals("Miejscownik" , "o Grobelnych", lastname.getLocative().trim());
        assertEquals("Wołacz" , "Grobelni", lastname.getVocative().trim());


	}



}
