package com.project;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * FinalTest
 */
public class FinalTest extends Application{
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn0;
    Button btnAddition;
    Button btnDiff;
    Button btnSeparate;
    Button btnMultiply;
    Button btnSum;
    Button btnClear;
    Button btnPoint;
    GridPane grid;
    Label result;
    VBox vbox;
    @Override
    public void start(Stage stage) throws Exception {
        grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(0);
        grid.setVgap(0);
        grid.setStyle("");
        grid.setPadding(new Insets(25,25,25,25));

        result = new Label();
        result.setMinSize(200, 50);
        result.setAlignment(Pos.CENTER);
        result.setBorder(new Border(new BorderStroke(Color.YELLOW, BorderStrokeStyle.SOLID, null, new BorderWidths(5))));

        vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);

        orientation();
        setSize();
        setToScreen();

        Scene scene = new Scene(vbox,300,600);
        scene.getStylesheets().add(getClass().getResource("Style.css").toExternalForm());
        
        stage.setTitle("Calculator 1.0");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
    
    private void orientation(){
        btn1 = new Button("1");
        btn2 = new Button("2");
        btn3 = new Button("3");
        btn4 = new Button("4");
        btn5 = new Button("5");
        btn6 = new Button("6");
        btn7 = new Button("7");
        btn8 = new Button("8");
        btn9 = new Button("9");
        btn0 = new Button("0");
        btnAddition = new Button("+");
        btnAddition.setId("purple");
        btnDiff = new Button("-");
        btnDiff.setId("purple");
        btnSeparate = new Button("/");
        btnSeparate.setId("purple");
        btnMultiply = new Button("x");
        btnMultiply.setId("purple");
        btnSum = new Button("=");
        btnSum.setId("sum");
        btnClear = new Button("C");
        btnClear.setId("clear");
        btnPoint = new Button(".");
    }

    private void setToScreen(){
        grid.add(btn0,0,4);
        grid.add(btnPoint,1,4);
        grid.add(btnSum,2,4);
        grid.add(btnAddition,3,4);
        grid.add(btn1,0,3);
        grid.add(btn2,1,3);
        grid.add(btn3,2,3);
        grid.add(btnDiff,3,3);
        grid.add(btn4,0,2);
        grid.add(btn5,1,2);
        grid.add(btn6,2,2);
        grid.add(btnMultiply,3,2);
        grid.add(btn7,0,1);
        grid.add(btn8,1,1);
        grid.add(btn9,2,1);
        grid.add(btnSeparate,3,1);
        grid.add(btnClear,3,0);
        vbox.getChildren().add(result);
        vbox.getChildren().add(grid);
    }
    private void setSize(){
        btn0.setMinSize(50, 50);
        btn1.setMinSize(50, 50);
        btn2.setMinSize(50, 50);
        btn3.setMinSize(50, 50);
        btn4.setMinSize(50, 50);
        btn5.setMinSize(50, 50);
        btn6.setMinSize(50, 50);
        btn7.setMinSize(50, 50);
        btn8.setMinSize(50, 50);
        btn9.setMinSize(50, 50);
        btnAddition.setMinSize(50, 50);
        btnDiff.setMinSize(50, 50);
        btnMultiply.setMinSize(50, 50);
        btnSeparate.setMinSize(50, 50);
        btnPoint.setMinSize(50, 50);
        btnClear.setMinSize(50, 50);
        btnSum.setMinSize(50, 50);

    }
}