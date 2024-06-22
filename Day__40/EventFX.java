/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafx22;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;

import javafx.event.EventHandler;
import javafx.scene.Scene;

import javafx.scene.control.Button;

import javafx.scene.layout.*;
import javafx.stage.Stage;

public class EventFX extends Application implements EventHandler<ActionEvent>{
    
    
    Button b ;
    int count =0;
    
    
    public void start(Stage stage) throws Exception {
        
        
        
    b  = new Button("OK");
    b.setOnAction(this);
    b.setPrefSize(100, 30);
    FlowPane f1 =  new FlowPane(b);
    
    Scene sc = new Scene(f1,400,400);
       stage.setScene(sc);
       stage.show();
    }
    
    @Override
    public void handle(ActionEvent t) {
        
        count++;
        b.setText(" "+count);
        
        
    
    }
    
    
    
    
     public static void main(String[] args){
        
        launch(args);
    }

    

    

    
    
    
}
