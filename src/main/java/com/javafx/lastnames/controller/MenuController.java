package com.javafx.lastnames.controller;

import com.javafx.lastnames.Main;
import com.javafx.lastnames.model.Connection;
import com.javafx.lastnames.model.Lastname;
import com.javafx.lastnames.model.PatternVariety;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class MenuController {


	@FXML
    private Label nom;
    @FXML
    private Label gen;
    @FXML
    private Label dat;
    @FXML
    private Label acc;
    @FXML
    private Label ins;
    @FXML
    private Label loc;
    @FXML
    private Label voc;
    @FXML
    private TextField lastname;
    @FXML
    private Button ok;
    @FXML
    private RadioButton woman;
    @FXML
    private RadioButton man;
    @FXML
    private RadioButton plural;


    private Main main;

    @FXML
    private void handleOk() {

    	String type = "";
        String lastn = lastname.getText().trim();
        String name = (String) lastn.toUpperCase().subSequence(0, 1)
        		+ (String) lastn.toLowerCase().subSequence(1, lastn.length());
        if(woman.isSelected())
        	type = "K";
        if(man.isSelected())
        	type = "M";
        if(plural.isSelected())
        	type = "P";
        String suffixes [];
        Lastname lastname;

        PatternVariety patternVariety = new PatternVariety();
        suffixes = patternVariety.findPattern(name, type);
        Connection connection = new Connection();
        lastname = connection.connect(name, suffixes, type);
        fillLabels(lastname);
    }

    private void fillLabels(Lastname lastname) {

            nom.setText(lastname.getNominative());
            gen.setText(lastname.getGenitive());
            dat.setText(lastname.getDative());
            acc.setText(lastname.getAccusative());
            ins.setText(lastname.getInstrumental());
            loc.setText(lastname.getLocative());
            voc.setText(lastname.getVocative());

    }

    @FXML
    private void handleMan() {
    	RadioButton women = new RadioButton();
    	women.setSelected(false);
    	RadioButton lmn = new RadioButton();
    	lmn.setSelected(false);

    }

    @FXML
    private void handleWoman() {
    	RadioButton men = new RadioButton();
    	men.setSelected(false);
    	RadioButton lmn = new RadioButton();
    	lmn.setSelected(false);

    }

    @FXML
    private void handleLmn() {
    	RadioButton women = new RadioButton();
    	women.setSelected(false);
    	RadioButton man = new RadioButton();
    	man.setSelected(false);

    }
    public void setMain(Main main) {
        this.main = main;
    }
}
