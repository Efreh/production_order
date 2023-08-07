package com.efr.production_order;

import java.net.URL;
import java.util.ResourceBundle;
import com.efr.production_order.clases.DateInit;
import com.efr.production_order.clases.Order;
import com.efr.production_order.clases.OrderPosition;
import com.efr.production_order.dataClases.ChoiseBoxArrays;
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
    private ChoiceBox<String> first_type_of_processing_choiceBox;

    @FXML
    private TableColumn<?, ?> fourth_type_of_processing_column;

    @FXML
    private ChoiceBox<String> fourth_type_of_processing_choiceBox;

    @FXML
    private ChoiceBox<String> job_title_choiceBox;

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
    private ChoiceBox<String> second_type_of_processing_choiceBox;

    @FXML
    private ChoiceBox<String> sector_choiceBox;

    @FXML
    private Label sector_label;

    @FXML
    private TableColumn<?, ?> third_type_of_processing_column;

    @FXML
    private ChoiceBox<String> third_type_of_processing_choiceBox;

    @FXML
    private TableColumn<?, ?> type_of_processing_column;

    @FXML
    private Label type_of_processing_label;

    @FXML
    private ChoiceBox<String> work_center_choiceBox;

    @FXML
    private Label work_center_label;
    @FXML
    private ChoiceBox<Integer> working_shift_choiceBox;

    @FXML
    private Label working_shift_label;

    // Start Getters and Setters
    public int getConstruction_installation_time_textField() {
        return Integer.parseInt(construction_installation_time_textField.getText());
    }

    public void setConstruction_installation_time_textField(int construction_installation_time_textField) {
        this.construction_installation_time_textField.setText(construction_installation_time_textField==0 ? null : Integer.toString(construction_installation_time_textField));
    }

    public int getDetail_amount_textField() {
        return Integer.parseInt(detail_amount_textField.getText());
    }

    public void setDetail_amount_textField(int detail_amount_textField) {
        this.detail_amount_textField.setText(detail_amount_textField==0 ? null : Integer.toString(detail_amount_textField));
    }

    public int getDetail_hole_amount_textField() {
        return Integer.parseInt(detail_hole_amount_textField.getText());
    }

    public void setDetail_hole_amount_textField(int detail_hole_amount_textField) {
        this.detail_hole_amount_textField.setText(detail_hole_amount_textField==0 ? null : Integer.toString(detail_hole_amount_textField));
    }

    public int getDetail_thickness_textField() {
        return Integer.parseInt(detail_thickness_textField.getText());
    }

    public void setDetail_thickness_textField(int detail_thickness_textField) {
        this.detail_thickness_textField.setText(detail_thickness_textField==0 ? null : Integer.toString(detail_thickness_textField));
    }

    public String getFirst_type_of_processing_choiceBox() {
        return first_type_of_processing_choiceBox.getValue();
    }

    public void setFirst_type_of_processing_choiceBox(String first_type_of_processing_choiceBox) {
        this.first_type_of_processing_choiceBox.setValue(first_type_of_processing_choiceBox);
    }

    public String getFourth_type_of_processing_choiceBox() {
        return fourth_type_of_processing_choiceBox.getValue();
    }

    public void setFourth_type_of_processing_choiceBox(String fourth_type_of_processing_choiceBox) {
        this.fourth_type_of_processing_choiceBox.setValue(fourth_type_of_processing_choiceBox);
    }

    public String getOrder_item_pos_textField() {
        return order_item_pos_textField.getText();
    }

    public void setOrder_item_pos_textField(String order_item_pos_textField) {
        this.order_item_pos_textField.setText(order_item_pos_textField);
    }

    public String getOrder_number_textField() {
        return order_number_textField.getText();
    }

    public void setOrder_number_textField(String order_number_textField) {
        this.order_number_textField.setText(order_number_textField);
    }

    public String getOrder_position_textField() {
        return order_position_textField.getText();
    }

    public void setOrder_position_textField(String order_position_textField) {
        this.order_position_textField.setText(order_position_textField);
    }

    public String getSecond_type_of_processing_choiceBox() {
        return second_type_of_processing_choiceBox.getValue();
    }

    public void setSecond_type_of_processing_choiceBox(String second_type_of_processing_choiceBox) {
        this.second_type_of_processing_choiceBox.setValue(second_type_of_processing_choiceBox);
    }

    public String getThird_type_of_processing_choiceBox() {
        return third_type_of_processing_choiceBox.getValue();
    }

    public void setThird_type_of_processing_choiceBox(String third_type_of_processing_choiceBox) {
        this.third_type_of_processing_choiceBox.setValue(third_type_of_processing_choiceBox);
    }
    // End Getters and Setters

    @FXML
    void initialize() {
        order_item_pos_textField.setText(Integer.toString(OrderPosition.getItemNumber()));

        //Установка текущей даты наряда
        DateInit dateInit = new DateInit();
        dateInit.dateStarter(date_picker);

        //Заполнение выпадающих списков значениями из листов класса ChoiseBoxArrays
        working_shift_choiceBox.setItems(ChoiseBoxArrays.workingShiftList);
        sector_choiceBox.setItems(ChoiseBoxArrays.sectorList);
        work_center_choiceBox.setItems(ChoiseBoxArrays.workCenterList);
        job_title_choiceBox.setItems(ChoiseBoxArrays.jobTitleList);

        first_type_of_processing_choiceBox.setItems(ChoiseBoxArrays.typeOfProcessingList);
        second_type_of_processing_choiceBox.setItems(ChoiseBoxArrays.typeOfProcessingList);
        third_type_of_processing_choiceBox.setItems(ChoiseBoxArrays.typeOfProcessingList);
        fourth_type_of_processing_choiceBox.setItems(ChoiseBoxArrays.typeOfProcessingList);

        // Добавление пункта позиции в наряд
        add_position_button.setOnAction(actionEvent -> {
            OrderPosition orderPosition = new OrderPosition(this);
            Order.addOrderPosition(orderPosition);
            orderPosition.clearOrederPositionFields();
            order_item_pos_textField.setText(Integer.toString(OrderPosition.getItemNumber()));
        });

        createAndSave_order_button.setOnAction(actionEvent -> {
            Order order = new Order(date_picker.getValue(),first_last_name_textField.getText(),working_shift_choiceBox.getValue(),
                    sector_choiceBox.getValue(),work_center_choiceBox.getValue(),job_title_choiceBox.getValue());
        });

    }
}
