package com.efr.production_order.dataClases;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ChoiseBoxArrays {
    public static ObservableList<Integer> workingShiftList = FXCollections.observableArrayList(1,2);
    public static ObservableList<String> sectorList = FXCollections.observableArrayList("110","111","112","113");
    public static ObservableList<String> workCenterList = FXCollections.observableArrayList("BERARDI","KALTENBACH","NEW_KALTENBACH","GALAXY","104");
    public static ObservableList<String> jobTitleList = FXCollections.observableArrayList("Оператор","Оператор СПУ","Сверловщик","Слесарь МСР","Резчик","Гибщик");
    public static ObservableList<String> typeOfProcessingList = FXCollections.observableArrayList("Сверловка","Разметка","Зачистка");
}
