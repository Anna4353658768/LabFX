package com.example.labfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ProductController {
    @FXML
    private TableView<Product> productTable;
    @FXML
    private TableColumn<Product, String> nameColumn;
    @FXML
    private TableColumn<Product, String> manufacturerColumn;
    @FXML
    private Label nameLabel;
    @FXML
    private Label sizeLabel;
    @FXML
    private Label weightLabel;
    @FXML
    private Label manufacturerCodeLabel;
    @FXML
    private Label countryLabel;
    @FXML
    private Label contactPersonLabel;
    @FXML
    private Label phoneLabel;


    private MainApp mainApp;

    public ProductController() {
    }


    @FXML
    private void initialize() {
        nameColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        manufacturerColumn.setCellValueFactory(cellData -> cellData.getValue().getМanufacturer().nameProperty());
    }


    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
        productTable.setItems(mainApp.getPersonData());
    }


}