package com.javafx.lastnames;

import java.io.IOException;

import com.javafx.lastnames.controller.RootController;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application {


    private Stage primaryStage;
    private BorderPane root;

    public Main() {

    }

    public void initRoot() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("/view/Root.fxml"));
            root = (BorderPane) loader.load();

            Scene scene = new Scene(root);
            primaryStage.setScene(scene);

            RootController controller = loader.getController();
            controller.setMain(this);

            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

	@Override
	public void start(Stage primaryStage) {
		try {
			 this.primaryStage = primaryStage;
		     this.primaryStage.setTitle("Nazwiska");
		     initRoot();
		     initMenu();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private void initMenu() {

		try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("/view/Menu.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();

            root.setCenter(personOverview);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

	  public Stage getPrimaryStage() {
	        return primaryStage;
	    }

	public static void main(String[] args) { launch(args); }
}
