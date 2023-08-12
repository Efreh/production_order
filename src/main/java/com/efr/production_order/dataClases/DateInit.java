package com.efr.production_order.dataClases;

import java.time.LocalDate;
import java.time.LocalDateTime;

// Блок инициализации даты наряда
// По умолчанию стоит дата создания наряда + если время в интервале с 00.00 до 08.00,
// этот интервал относится к дате до полуночи
public class DateInit {
    private static LocalDateTime localDateTime = LocalDateTime.now();
    public static LocalDate dateStarter(){
        if (localDateTime.getHour()>=00 && localDateTime.getHour()<8){
            return localDateTime.toLocalDate().minusDays(1);
        } else {
            return localDateTime.toLocalDate();
        }
    }
}
