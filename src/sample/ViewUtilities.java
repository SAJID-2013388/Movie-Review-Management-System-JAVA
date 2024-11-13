package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewUtilities {
  public static void  showErrorMessageDialogueBox(String errorMessage,Stage parentStage)  {
    try{
    FXMLLoader fxmlLoader = new FXMLLoader(ViewUtilities.class.getResource("ErrorView.fxml"));
    Pane root = (Pane) fxmlLoader.load();
    ErrorViewController errorViewController = fxmlLoader.getController();
    errorViewController.setErrorMassageLabel(errorMessage);

    Scene errorViewScene= new Scene(root);
    Stage errorStage=new Stage();
    errorStage.setScene(errorViewScene);
    errorStage.initOwner(parentStage);
    errorStage.initModality(Modality.APPLICATION_MODAL);
    errorStage.setTitle(" Error ! ");
    errorStage.showAndWait();
    }catch (Exception exception){
      exception.printStackTrace();
    }

  }
}
