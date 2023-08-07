package com.efr.production_order.clases;

import javafx.scene.control.DatePicker;

import java.time.LocalDateTime;

// Блок инициализации даты наряда
// По умолчанию стоит дата создания наряда + если время в интервале с 00.00 до 08.00,
// этот интервал относится к дате до полуночи
public class DateInit {
    private LocalDateTime localDateTime = LocalDateTime.now();
    public void dateStarter(DatePicker datePicker){
        if (localDateTime.getHour()>=00 && localDateTime.getHour()<8){
            datePicker.setValue(localDateTime.toLocalDate().minusDays(1));
        } else {
            datePicker.setValue(localDateTime.toLocalDate());
        }
        datePicker.setOnAction(actionEvent -> {
            System.out.println(datePicker.getValue());
        });
    }
}
