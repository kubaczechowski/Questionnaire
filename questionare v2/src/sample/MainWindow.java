package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class MainWindow {

    /* public void clickButton(ActionEvent actionEvent) throws IOException {
         Parent part = FXMLLoader.load(getClass().getResource("QuestionWindow.fxml"));
         Stage stage = new Stage();
         Scene scene = new Scene(part);
         stage.setScene(scene);
         stage.show();
     }

     */
    public TextField name;

    public ListView listNames;

    /**
     this method gets the score back from the second controller
     * @param score
     */
    public void sendBackScore(int score) {
        listNames.getItems().add(name.getText() + " has score: " + score  );
    }

    public void clickButton(ActionEvent actionEvent)  {
        try {
            FXMLLoader loader = new  FXMLLoader(getClass().getResource("QuestionWindow.fxml"));
            Parent root = loader.load();
            QuestionWindow questionWindow = loader.getController();
            //below I'll add some code
            questionWindow.setParentController(this);
            questionWindow.setLabelText(name.getText());
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Questionnaire");
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

