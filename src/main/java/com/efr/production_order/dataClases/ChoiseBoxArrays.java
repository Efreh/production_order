package com.efr.production_order.dataClases;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ChoiseBoxArrays {
    private static ObservableList<String> workingShiftList = FXCollections.observableArrayList("1","2");
    private static ObservableList<String> sectorList = FXCollections.observableArrayList("110","111","112","113");
    private static ObservableList<String> workCenterList = FXCollections.observableArrayList("BERARDI","KALTENBACH","NEW_KALTENBACH","GALAXY","104");
    private static ObservableList<String> jobTitleList = FXCollections.observableArrayList("Оператор","Оператор СПУ","Сверловщик","Слесарь МСР","Резчик","Гибщик");
    private static ObservableList<String> typeOfProcessingList = FXCollections.observableArrayList("Сверловка","Разметка","Зачистка");

    public static ObservableList<String> getWorkingShiftList() {
        return workingShiftList;
    }

    public static ObservableList<String> getSectorList() {
        return sectorList;
    }

    public static ObservableList<String> getWorkCenterList() {
        return workCenterList;
    }

    public static ObservableList<String> getJobTitleList() {
        return jobTitleList;
    }

    public static ObservableList<String> getTypeOfProcessingList() {
        return typeOfProcessingList;
    }
}
