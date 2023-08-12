package com.efr.production_order;

import java.net.URL;
import java.util.ResourceBundle;

import com.efr.production_order.clases.Order;
import com.efr.production_order.dataClases.DateInit;
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
    //Private variable block
    @FXML
    private ResourceBundle resources;

    @FXML
    private Label error_label;

    @FXML
    private URL location;

    @FXML
    private Button add_position_button;

    @FXML
    private TableColumn<String, String> construction_installation_time_column;

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
    private TableColumn<String, String> detail_amount_column;

    @FXML
    private Label detail_amount_label;

    @FXML
    private TextField detail_amount_textField;

    @FXML
    private TableColumn<String, String> detail_hole_amount_column;

    @FXML
    private Label detail_hole_amount_label;

    @FXML
    private TextField detail_hole_amount_textField;

    @FXML
    private TableColumn<String, String> detail_thickness_column;

    @FXML
    private Label detail_thickness_label;

    @FXML
    private TextField detail_thickness_textField;

    @FXML
    private TextField first_last_name_textField;

    @FXML
    private TableColumn<String, String> first_type_of_processing_column;

    @FXML
    private ChoiceBox<String> first_type_of_processing_choiceBox;

    @FXML
    private TableColumn<String, String> fourth_type_of_processing_column;

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
    private TableColumn<String, String> order_number_column;

    @FXML
    private Label order_number_label;

    @FXML
    private TextField order_number_textField;

    @FXML
    private TableColumn<String, String> order_position_column;

    @FXML
    private Label order_position_label;

    @FXML
    private TextField order_position_textField;

    @FXML
    private TableView<String> order_table;

    @FXML
    private TableColumn<String, String> position_number_column;

    @FXML
    private Button restart_position_button;

    @FXML
    private Button search_order_button;

    @FXML
    private TableColumn<String, String> second_type_of_processing_column;

    @FXML
    private ChoiceBox<String> second_type_of_processing_choiceBox;

    @FXML
    private ChoiceBox<String> sector_choiceBox;

    @FXML
    private Label sector_label;

    @FXML
    private TableColumn<String, String> third_type_of_processing_column;

    @FXML
    private ChoiceBox<String> third_type_of_processing_choiceBox;

    @FXML
    private TableColumn<String, String> type_of_processing_column;

    @FXML
    private Label type_of_processing_label;

    @FXML
    private ChoiceBox<String> work_center_choiceBox;

    @FXML
    private Label work_center_label;
    @FXML
    private ChoiceBox<String> working_shift_choiceBox;

    @FXML
    private Label working_shift_label;
    //Private variable block

    @FXML
    void initialize() {
        //Создание объектов наряда
        Order order = new Order();

        //-----------------------------------------------------------------//

        //Блок установки стартовых значений
        //Установка стартового номера позиции
        order_item_pos_textField.setText(Integer.toString(OrderPosition.getItemNumber()));

        //Установка текущей даты наряда в зависимости от времени суток
        date_picker.setValue(DateInit.dateStarter());

        //Заполнение выпадающих списков значениями из листов класса ChoiseBoxArrays
        working_shift_choiceBox.setItems(ChoiseBoxArrays.getWorkingShiftList());
        sector_choiceBox.setItems(ChoiseBoxArrays.getSectorList());
        work_center_choiceBox.setItems(ChoiseBoxArrays.getWorkCenterList());
        job_title_choiceBox.setItems(ChoiseBoxArrays.getJobTitleList());

        first_type_of_processing_choiceBox.setItems(ChoiseBoxArrays.getTypeOfProcessingList());
        second_type_of_processing_choiceBox.setItems(ChoiseBoxArrays.getTypeOfProcessingList());
        third_type_of_processing_choiceBox.setItems(ChoiseBoxArrays.getTypeOfProcessingList());
        fourth_type_of_processing_choiceBox.setItems(ChoiseBoxArrays.getTypeOfProcessingList());
        //Конец блока установки стартовых значений

        //-----------------------------------------------------------------//

        //Блок активности
        // Добавление пункта позиции в наряд
        add_position_button.setOnAction(actionEvent -> {
            error_label.setText("");
            try {
                OrderPosition orderPosition = new OrderPosition(order_number_textField.getText(), order_position_textField.getText(),
                        detail_amount_textField.getText(), detail_thickness_textField.getText(), detail_hole_amount_textField.getText(),
                        first_type_of_processing_choiceBox.getValue(), second_type_of_processing_choiceBox.getValue(), third_type_of_processing_choiceBox.getValue(),
                        fourth_type_of_processing_choiceBox.getValue(), construction_installation_time_textField.getText());
                order.addInOrderPositionArrayList(orderPosition);
            } catch (NumberFormatException e){
                error_label.setText("Введены неверные значения");
            }
        });

        createAndSave_order_button.setOnAction(actionEvent -> {
            order.createOrder(date_picker.getValue(),first_last_name_textField.getText(),working_shift_choiceBox.getValue(),
                    sector_choiceBox.getValue(),work_center_choiceBox.getValue(),job_title_choiceBox.getValue());
            System.out.println(order);
        });
        //Конец блока активности

        //-----------------------------------------------------------------//
    }
}
