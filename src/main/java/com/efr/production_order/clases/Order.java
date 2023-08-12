package com.efr.production_order.clases;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.time.LocalDate;

public class Order {
    private LocalDate dateOrder;
    private String name_lastName;
    private String workingShift;
    private String sector;
    private String workCenter;
    private String jobTitle;


    private ObservableList<OrderPosition> orderPositionArrayList = FXCollections.observableArrayList();
    public ObservableList<OrderPosition> getOrderPositionObservableList() {
        return orderPositionArrayList;
    }
    public void addInOrderPositionArrayList(OrderPosition orderPosition) {
        orderPositionArrayList.add(orderPosition);
    }


    public void createOrder(LocalDate dateOrder, String name_lastName, String workingShift, String sector, String workCenter, String jobTitle) {
        this.dateOrder = dateOrder;
        this.name_lastName = name_lastName;
        this.workingShift = workingShift;
        this.sector = sector;
        this.workCenter = workCenter;
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Order{" +
                "dateOrder=" + dateOrder +
                ", name_lastName='" + name_lastName + '\'' +
                ", workingShift=" + workingShift +
                ", sector='" + sector + '\'' +
                ", workCenter='" + workCenter + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", orderPositionArrayList=" + orderPositionArrayList +
                '}';
    }
}