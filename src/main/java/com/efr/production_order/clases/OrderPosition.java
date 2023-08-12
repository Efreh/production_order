package com.efr.production_order.clases;

import java.text.ParseException;

public class OrderPosition {
    private static int itemNumber = 1;

    public static int getItemNumber() {
        return itemNumber;
    }

    public static void setItemNumber(int itemNumber) {
        OrderPosition.itemNumber = itemNumber;
    }

    private int localItemNumber;
    private String orderNumber;

    private String orderPosition;
    private int amountOfDetails;
    private int thicknessOfDetail;
    private int amountOfHoles;
    private String typeOfProcessing1;
    private String typeOfProcessing2;
    private String typeOfProcessing3;
    private String typeOfProcessing4;
    private double installationTime;


//================================================


    public OrderPosition (String orderNumber, String orderPosition, String amountOfDetails,
                         String thicknessOfDetail, String amountOfHoles,
                         String typeOfProcessing1, String typeOfProcessing2, String typeOfProcessing3, String typeOfProcessing4,
                         String installationTime) {
        this.localItemNumber = itemNumber;
        this.orderNumber = orderNumber;
        this.orderPosition = orderPosition;
        this.amountOfDetails = Integer.parseInt(amountOfDetails);
        this.thicknessOfDetail = Integer.parseInt(thicknessOfDetail);
        this.amountOfHoles = Integer.parseInt(amountOfHoles);
        this.typeOfProcessing1 = typeOfProcessing1;
        this.typeOfProcessing2 = typeOfProcessing2;
        this.typeOfProcessing3 = typeOfProcessing3;
        this.typeOfProcessing4 = typeOfProcessing4;
        this.installationTime = Double.parseDouble(installationTime);

        itemNumber++;
    }

    @Override
    public String toString() {
        return "OrderPosition{" +
                "localItemNumber=" + localItemNumber +
                ", orderNumber='" + orderNumber + '\'' +
                ", orderPosition='" + orderPosition + '\'' +
                ", amountOfDetails=" + amountOfDetails +
                ", thicknessOfDetail=" + thicknessOfDetail +
                ", amountOfHoles=" + amountOfHoles +
                ", typeOfProcessing1='" + typeOfProcessing1 + '\'' +
                ", typeOfProcessing2='" + typeOfProcessing2 + '\'' +
                ", typeOfProcessing3='" + typeOfProcessing3 + '\'' +
                ", typeOfProcessing4='" + typeOfProcessing4 + '\'' +
                ", installationTime=" + installationTime +
                '}';
    }
}
