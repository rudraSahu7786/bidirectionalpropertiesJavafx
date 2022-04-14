/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidirectional.binding;

import java.net.URL;
import java.text.NumberFormat;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

/**
 *
 * @author absasahu
 */
public class FXMLDocumentController implements Initializable {
    
  
    @FXML
    private TextField textField;
    
   private static final double init_value=50;
    @FXML
    private Label label;
    @FXML
    private Slider slider;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        slider.setValue(init_value);
        textField.setText(new Double(init_value).toString());
        textField.textProperty().bindBidirectional(slider.valueProperty(),NumberFormat.getNumberInstance() );
    }
    
}
