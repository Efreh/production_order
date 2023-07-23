package com.efr.production_order;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class CreateOrderWindowController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button add_position_button;

    @FXML
    private TableColumn<?, ?> construction_installation_time_column;

    @FXML
    private Label construction_installation_time_label;

    @FXML
    private TextField construction_installation_time_textField;

    @FXML
    private Button createAndSave_order_button;

    @FXML
    private AnchorPane create_order_window;

    @FXML
    private DatePicker date_picker;

    @FXML
    private TableColumn<?, ?> detail_amount_column;

    @FXML
    private Label detail_amount_label;

    @FXML
    private TextField detail_amount_textField;

    @FXML
    private TableColumn<?, ?> detail_hole_amount_column;

    @FXML
    private Label detail_hole_amount_label;

    @FXML
    private TextField detail_hole_amount_textField;

    @FXML
    private TableColumn<?, ?> detail_thickness_column;

    @FXML
    private Label detail_thickness_label;

    @FXML
    private TextField detail_thickness_textField;

    @FXML
    private TextField first_last_name_textField;

    @FXML
    private TableColumn<?, ?> first_type_of_processing_column;

    @FXML
    private ChoiceBox<?> first_type_of_processing_textField;

    @FXML
    private TableColumn<?, ?> fourth_type_of_processing_column;

    @FXML
    private ChoiceBox<?> fourth_type_of_processing_textField;

    @FXML
    private ChoiceBox<?> job_title_choiceBox;

    @FXML
    private Label job_title_label;

    @FXML
    private Label order_item_pos_label;

    @FXML
    private TextField order_item_pos_textField;

    @FXML
    private TableColumn<?, ?> order_number_column;

    @FXML
    private Label order_number_label;

    @FXML
    private TextField order_number_textField;

    @FXML
    private TableColumn<?, ?> order_position_column;

    @FXML
    private Label order_position_label;

    @FXML
    private TextField order_position_textField;

    @FXML
    private TableView<?> order_table;

    @FXML
    private TableColumn<?, ?> position_number_column;

    @FXML
    private Button restart_position_button;

    @FXML
    private Button search_order_button;

    @FXML
    private TableColumn<?, ?> second_type_of_processing_column;

    @FXML
    private ChoiceBox<?> second_type_of_processing_textField;

    @FXML
    private ChoiceBox<?> sector_choiceBox;

    @FXML
    private Label sector_label;

    @FXML
    private TableColumn<?, ?> third_type_of_processing_column;

    @FXML
    private ChoiceBox<?> third_type_of_processing_textField;

    @FXML
    private TableColumn<?, ?> type_of_processing_column;

    @FXML
    private Label type_of_processing_label;

    @FXML
    private ChoiceBox<?> work_center_choiceBox;

    @FXML
    private Label work_center_label;

    @FXML
    private ChoiceBox<?> working_shift_choiceBox;

    @FXML
    private Label working_shift_label;

    @FXML
    void initialize() {

    }

}
