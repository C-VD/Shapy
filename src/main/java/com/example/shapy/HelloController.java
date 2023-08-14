package com.example.shapy;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.io.File;
import java.util.Scanner;

public class HelloController {
    public TextArea fileName;
    public Label out;
    @FXML
    private Label welcomeText;

    @FXML
    protected void Open() {
        Scanner sc;
        try {
            sc = new Scanner(new File("pom.xml"));
        }
        catch (Exception e) {
            return;
         }
        welcomeText.setText(sc.nextLine());

    }

    public void readText(){

    }
}