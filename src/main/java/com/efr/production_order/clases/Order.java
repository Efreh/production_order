package com.efr.production_order.clases;

import java.time.LocalDate;
import java.util.ArrayList;

public class Order {
    private LocalDate dateOrder;
    private String name_lastName;
    private int workingShift;
    private String sector;
    private String workCenter;
    private String jobTitle;
    private static ArrayList<OrderPosition> orderPositionArrayList = new ArrayList<>();

    public Order(LocalDate dateOrder, String name_lastName, int workingShift, String sector, String workCenter, String jobTitle) {
        this.dateOrder = dateOrder;
        this.name_lastName = name_lastName;
        this.workingShift = workingShift;
        this.sector = sector;
        this.workCenter = workCenter;
        this.jobTitle = jobTitle;
        System.out.println("Order create");
        System.out.println(this.toString());
    }

    public static void addOrderPosition(OrderPosition orderPosition){
        orderPositionArrayList.add(orderPosition);
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