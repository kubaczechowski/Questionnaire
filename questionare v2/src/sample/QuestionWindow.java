package sample;

import java.awt.*;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class QuestionWindow {
    public Label participantName;
    public int points= 0;
    public Label showscore;
    private MainWindow controller;

    public void setParentController(MainWindow controller)
    {
    this.controller = controller;
    }

    /**
     it sends the data back to the main window controller. we send the value of variable called points
     */
    public void SaveScoreButton(ActionEvent event) {
        controller.sendBackScore(points);
        // close this window
        // I use showscore. There is a dependency
       Stage stage = (Stage) showscore.getScene().getWindow();
       // typecasting
        stage.close();

        // of course we need to set the text first before we close down
        //the window
    }

    public void setLabelText(String text){
        participantName.setText("Name of participant: " + text);
    }

    public void calculateTheScore(ActionEvent event)
    {
        showscore.setText("Score: " + points);
    }
    
    public void addPoint(ActionEvent event)
    {
        points++;
        showscore.setText("Score: " + points);
    }

    public void substractPoint(ActionEvent event)
    {
        points--;
        showscore.setText("Score: " + points);
    }


}
