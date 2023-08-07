package com.efr.production_order.clases;

import com.efr.production_order.CreateOrderWindowController;

public class OrderPosition {
    private static int itemNumber = 1;
    public static int getItemNumber(){
        return itemNumber;
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

    private CreateOrderWindowController windowController;

//================================================


    public OrderPosition(CreateOrderWindowController windowController){
        localItemNumber = itemNumber;
        orderNumber = windowController.getOrder_number_textField();
        orderPosition = windowController.getOrder_position_textField();
        amountOfDetails = windowController.getDetail_amount_textField();
        thicknessOfDetail = windowController.getDetail_thickness_textField();
        amountOfHoles = windowController.getDetail_hole_amount_textField();
        typeOfProcessing1 = windowController.getFirst_type_of_processing_choiceBox();
        typeOfProcessing2 = windowController.getSecond_type_of_processing_choiceBox();
        typeOfProcessing3 = windowController.getThird_type_of_processing_choiceBox();
        typeOfProcessing4 = windowController.getFourth_type_of_processing_choiceBox();
        installationTime = windowController.getConstruction_installation_time_textField();
        this.windowController = windowController;
        itemNumber++;
    }
    public void clearOrederPositionFields(){
        windowController.setOrder_number_textField(null);
        windowController.setOrder_position_textField(null);
        windowController.setDetail_amount_textField(0);
        windowController.setDetail_thickness_textField(0);
        windowController.setDetail_hole_amount_textField(0);
        windowController.setFirst_type_of_processing_choiceBox(null);
        windowController.setSecond_type_of_processing_choiceBox(null);
        windowController.setThird_type_of_processing_choiceBox(null);
        windowController.setFourth_type_of_processing_choiceBox(null);
        windowController.setConstruction_installation_time_textField(0);
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
                ", windowController=" + windowController +
                '}';
    }
}
