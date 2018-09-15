package com.javafx.lastnames;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.javafx.lastnames.model.Connection;
import com.javafx.lastnames.model.Lastname;
import com.javafx.lastnames.model.PatternVariety;

public class NameKaczorek {


	@Test
	public void test() {

		PatternVariety patternVariety = new PatternVariety();
        String[] suffixes = patternVariety.findPattern("Kaczorek", "M");
        Connection connection = new Connection();
        Lastname lastname = connection.connect("Kaczorek", suffixes, "M");

        assertEquals("Mianownik", "Kaczorek", lastname.getNominative().trim());
        assertEquals("Dopełniacz", "Kaczorka", lastname.getGenitive().trim());
        assertEquals("Celownik", "Kaczorkowi", lastname.getDative().trim());
        assertEquals("Biernik" , "Kaczorka", lastname.getAccusative().trim());
        assertEquals("Narzędnik" , "z Kaczorkiem", lastname.getInstrumental().trim());
        assertEquals("Miejscownik" , "o Kaczorku", lastname.getLocative().trim());
        assertEquals("Wołacz" , "Kaczorku", lastname.getVocative().trim());


	}

	@Test
	public void test2() {

		PatternVariety patternVariety = new PatternVariety();
        String[] suffixes = patternVariety.findPattern("Kaczorek", "K");
        Connection connection = new Connection();
        Lastname lastname = connection.connect("Kaczorek", suffixes, "K");



        assertEquals("Mianownik", "Kaczorek", lastname.getNominative().trim());
        assertEquals("Dopełniacz", "Kaczorek", lastname.getGenitive().trim());
        assertEquals("Celownik", "Kaczorek", lastname.getDative().trim());
        assertEquals("Biernik" , "Kaczorek", lastname.getAccusative().trim());
        assertEquals("Narzędnik" , "z Kaczorek", lastname.getInstrumental().trim());
        assertEquals("Miejscownik" , "o Kaczorek", lastname.getLocative().trim());
        assertEquals("Wołacz" , "Kaczorek", lastname.getVocative().trim());


	}

	@Test
	public void test3() {

		PatternVariety patternVariety = new PatternVariety();
        String[] suffixes = patternVariety.findPattern("Kaczorek", "P");
        Connection connection = new Connection();
        Lastname lastname = connection.connect("Kaczorek", suffixes, "P");



        assertEquals("Mianownik", "Kaczorkowie", lastname.getNominative().trim());
        assertEquals("Dopełniacz", "Kaczorków", lastname.getGenitive().trim());
        assertEquals("Celownik", "Kaczorkom", lastname.getDative().trim());
        assertEquals("Biernik" , "Kaczorków", lastname.getAccusative().trim());
        assertEquals("Narzędnik" , "z Kaczorkami", lastname.getInstrumental().trim());
        assertEquals("Miejscownik" , "o Kaczorkach", lastname.getLocative().trim());
        assertEquals("Wołacz" , "Kaczorkowie", lastname.getVocative().trim());


	}
}
