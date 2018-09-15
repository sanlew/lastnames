package com.javafx.lastnames;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.javafx.lastnames.model.Connection;
import com.javafx.lastnames.model.Lastname;
import com.javafx.lastnames.model.PatternVariety;


public class NameLato {
	@Test
	public void test() {

		PatternVariety patternVariety = new PatternVariety();
        String[] suffixes = patternVariety.findPattern("Lato", "M");
        Connection connection = new Connection();
        Lastname lastname = connection.connect("Lato", suffixes, "M");

        assertEquals("Mianownik", "Lato", lastname.getNominative().trim());
        assertEquals("Dopełniacz", "Laty", lastname.getGenitive().trim());
        assertEquals("Celownik", "Lacie", lastname.getDative().trim());
        assertEquals("Biernik" , "Latę", lastname.getAccusative().trim());
        assertEquals("Narzędnik" , "z Latą", lastname.getInstrumental().trim());
        assertEquals("Miejscownik" , "o Lacie", lastname.getLocative().trim());
        assertEquals("Wołacz" , "Lato", lastname.getVocative().trim());


	}

	@Test
	public void test2() {

		PatternVariety patternVariety = new PatternVariety();
        String[] suffixes = patternVariety.findPattern("Lato", "K");
        Connection connection = new Connection();
        Lastname lastname = connection.connect("Lato", suffixes, "K");



        assertEquals("Mianownik", "Lato", lastname.getNominative().trim());
        assertEquals("Dopełniacz", "Lato", lastname.getGenitive().trim());
        assertEquals("Celownik", "Lato", lastname.getDative().trim());
        assertEquals("Biernik" , "Lato", lastname.getAccusative().trim());
        assertEquals("Narzędnik" , "z Lato", lastname.getInstrumental().trim());
        assertEquals("Miejscownik" , "o Lato", lastname.getLocative().trim());
        assertEquals("Wołacz" , "Lato", lastname.getVocative().trim());


	}

	@Test
	public void test3() {

		PatternVariety patternVariety = new PatternVariety();
        String[] suffixes = patternVariety.findPattern("Lato", "P");
        Connection connection = new Connection();
        Lastname lastname = connection.connect("Lato", suffixes, "P");



        assertEquals("Mianownik", "Latowie", lastname.getNominative().trim());
        assertEquals("Dopełniacz", "Latów", lastname.getGenitive().trim());
        assertEquals("Celownik", "Latom", lastname.getDative().trim());
        assertEquals("Biernik" , "Latów", lastname.getAccusative().trim());
        assertEquals("Narzędnik" , "z Latami", lastname.getInstrumental().trim());
        assertEquals("Miejscownik" , "o Latach", lastname.getLocative().trim());
        assertEquals("Wołacz" , "Latowie", lastname.getVocative().trim());


	}

}
