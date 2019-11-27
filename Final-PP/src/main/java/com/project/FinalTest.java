package com.project;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FinalTest
 */
public class FinalTest extends Application  {
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;
    private Button btn00;
    private Button btn000;
    private Button btnPlus;
    private Button btnDiff;
    private Button btnMultiply;
    private Button btnSeparate;
    private Button btnPercentage;
    private Button btnSum;
    private TextField result;
    private VBox vbox;
    @Override
    public void start(Stage arg0) throws Exception {
        vbox = new VBox();
        vbox.setSpacing(10);
        vbox.setAlignment(Pos.CENTER);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(5);


        btn0 = new Button("0");
        btn00 = new Button("00");
        btn000 = new Button("000");
        btn1 = new Button("1");
        btn2 = new Button("2");
        btn3 = new Button("3");
        btn4 = new Button("4");
        btn5 = new Button("5");
        btn6 = new Button("6");
        btn7 = new Button("7");
        btn8 = new Button("8");
        btn9 = new Button("9");
        btnPlus = new Button("+");
        btnDiff = new Button("-");
        btnPercentage = new Button(".");
        btnMultiply = new Button("x");
        btnSeparate = new Button("/");
        btnSum = new Button("=");

        
        result = new TextField();
        result.setMaxWidth(160);

        btn0.setMinWidth(50);
        btn00.setMinWidth(50);
        btn000.setMinWidth(50);
        btn1.setMinWidth(50);
        btn2.setMinWidth(50);
        btn3.setMinWidth(50);
        btn4.setMinWidth(50);
        btn5.setMinWidth(50);
        btn6.setMinWidth(50);
        btn7.setMinWidth(50);
        btn8.setMinWidth(50);
        btn9.setMinWidth(50);
        btnMultiply.setMinWidth(50);
        btnSeparate.setMinWidth(50);
        btnSum.setMinWidth(50);
        btnPlus.setMinWidth(50);
        btnDiff.setMinWidth(50);
        btnPercentage.setMinWidth(50);

        grid.add(btnMultiply, 0, 5);
        grid.add(btnSeparate, 1, 5);
        grid.add(btnSum, 2, 5);
        grid.add(btnPlus, 0, 4);
        grid.add(btnDiff, 1, 4);
        grid.add(btnPercentage, 2, 4);
        grid.add(btn0,0,3);
        grid.add(btn00,1,3);
        grid.add(btn000,2,3);
        grid.add(btn1,0,2);
        grid.add(btn2,1,2);
        grid.add(btn3,2,2);
        grid.add(btn4,0,1);
        grid.add(btn5,1,1);
        grid.add(btn6,2,1);
        grid.add(btn7,0,0);
        grid.add(btn8,1,0);
        grid.add(btn9,2,0);

        vbox.getChildren().add(result);
        vbox.getChildren().add(grid);

        Scene scene = new Scene(vbox,400,400);
        arg0.setScene(scene);
        arg0.setTitle("Calculator");
        arg0.show();
        
    }
    public static void main(String[] args) {
        launch();
    }
}