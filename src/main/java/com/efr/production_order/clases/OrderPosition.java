package com.efr.production_order.clases;

public class OrderPosition {
    private static int itemNumber = 1;
    private String orderNumber;
    private String orderPosition;
    private int numberOfDetails;
    private int thicknessOfDetail;
    private int numberOfHoles;
    private String typeOfProcessing1;
    private String typeOfProcessing2;
    private String typeOfProcessing3;
    private String typeOfProcessing4;
    private double installationTime;

    public OrderPosition(String orderNumber, String orderPosition, int numberOfDetails, int thicknessOfDetail,
                         int numberOfHoles, String typeOfProcessing1, String typeOfProcessing2, String typeOfProcessing3, String typeOfProcessing4,
                         double installationTime) {
        this.orderNumber = orderNumber;
        this.orderPosition = orderPosition;
        this.numberOfDetails = numberOfDetails;
        this.thicknessOfDetail = thicknessOfDetail;
        this.numberOfHoles = numberOfHoles;
        this.typeOfProcessing1 = typeOfProcessing1;
        this.typeOfProcessing2 = typeOfProcessing2;
        this.typeOfProcessing3 = typeOfProcessing3;
        this.typeOfProcessing4 = typeOfProcessing4;
        this.installationTime = installationTime;
        itemNumber++;
    }

    @Override
    public String toString() {
        return "OrderPosition{" +
                "orderNumber='" + orderNumber + '\'' +
                ", orderPosition='" + orderPosition + '\'' +
                ", numberOfDetails=" + numberOfDetails +
                ", thicknessOfDetail=" + thicknessOfDetail +
                ", numberOfHoles=" + numberOfHoles +
                ", typeOfProcessing1='" + typeOfProcessing1 + '\'' +
                ", typeOfProcessing2='" + typeOfProcessing2 + '\'' +
                ", typeOfProcessing3='" + typeOfProcessing3 + '\'' +
                ", typeOfProcessing4='" + typeOfProcessing4 + '\'' +
                ", installationTime=" + installationTime +
                '}';
    }
}
