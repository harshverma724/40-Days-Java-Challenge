
package javafx22;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.paint.*;

public class PropertyDemo extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        
        
        Button b = new Button("Click _Me");
        b.setTextFill(Color.BLUE);
        b.setMnemonicParsing(true);
        Tooltip tp = new Tooltip("Click this Button to save this data.");
        b.setTooltip(tp);
        b.setStyle("-fx-border-color:yellow;");
        Alert a = new Alert(AlertType.INFORMATION,"Button Is Clicked.");
        b.setOnAction(e->a.show());
        
        FlowPane fp = new FlowPane(b);
        
        Scene sc = new Scene(fp ,400,400);
        stage.setScene(sc);
        stage.show();
        
    
    }
    
    public static void main(String[] args){
        
        launch(args);
    }
    
}
