package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;

public class Controller {
    @FXML private TextField nameTxtbox;
    @FXML private TextField telTxtbox;
    @FXML private TextField relTxtbox;
    @FXML private ListView peopleList;
    @FXML private AnchorPane mainPanel;
    @FXML private AnchorPane nextPanel;

    ArrayList<Person> people = new ArrayList<Person>();

    public void updateExistingBtn(ActionEvent actionEvent) {

    }

    public void addNewPersonBtn(ActionEvent actionEvent) {

        people.add(new Person(nameTxtbox.getText(), Integer.parseInt(telTxtbox.getText()), relTxtbox.getText()));
        peopleList.getItems().clear();
        people.forEach((n)->peopleList.getItems().add(n.getName()));
    }


    public void clickedPeopleList(MouseEvent mouseEvent) {
        int pIndex = peopleList.getSelectionModel().getSelectedIndex();
        nameTxtbox.setText(people.get(pIndex).getName());
        telTxtbox.setText(Integer.toString(people.get(pIndex).getTelephone()));
        relTxtbox.setText(people.get(pIndex).getRelationship());

    }

    public void nextWindowBtn(ActionEvent actionEvent) {
        mainPanel.setVisible(false);
        nextPanel.setVisible(true);
    }
}
