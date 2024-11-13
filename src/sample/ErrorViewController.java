package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class ErrorViewController {
  @FXML
  private Label ErrorMassageLabel;

  @FXML
  private Button CloseButton;

  @FXML
  void HandleCloseButtonClicked(ActionEvent event) {
    Stage currentStage = (Stage) this.CloseButton.getScene().getWindow();
    currentStage.close();

  }

  public void setErrorMassageLabel(String errorMassage) {
    this.ErrorMassageLabel.setText(errorMassage);
  }

}
