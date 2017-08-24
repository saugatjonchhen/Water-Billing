package com.bill.calculator;

import java.text.SimpleDateFormat;
import java.util.Date;

public class YearMonth_Name_extractor {
    public String YearMonth_Name_extractor(Date date){
        SimpleDateFormat year = new SimpleDateFormat("yyyy");
        SimpleDateFormat month = new SimpleDateFormat("MMM");
//        System.out.println(month.format(date)+year.format(date));
        return (month.format(date)+year.format(date));
    }
}
