package DrinkCounter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;

import java.io.File;

public class OpenFileController {

    @FXML
    public Button openFileButton;

    private DrinkCounter drinkCounter;

    public OpenFileController() {
        this.drinkCounter = new DrinkCounter();
    }

    public void openFileAction(ActionEvent event){
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("TXT Files", "*.TXT"));

        File selectedFile = fileChooser.showOpenDialog(null);

        if (selectedFile != null) {
            System.out.println(selectedFile.toString());
            drinkCounter.countDrinks(selectedFile);
        }
    }
}
