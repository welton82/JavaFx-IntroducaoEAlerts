package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class Controller {
    @FXML
    private Button btn;

    @FXML
    public void onBtnAction(){
        //System.out.println("Cliked!!");
          // Alerts.showAlerts("Alert Title", "Alert Header", "Hello", Alert.AlertType.ERROR);
        Alerts.showAlerts("Alert Title", null, "Hello", Alert.AlertType.ERROR);
    }

}
