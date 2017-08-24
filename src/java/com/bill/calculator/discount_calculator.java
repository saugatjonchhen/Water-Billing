package com.bill.calculator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class discount_calculator {
    public Double calculate_disc(Double amt,Date bill_date){
        dayscalculator daycalcu = new dayscalculator();
        int days = daycalcu.dayscalc(bill_date);
        if(days<=7)
            amt = amt*0.03;
        else //if((days>=8)&&(days<=22))
            amt = 0.0;
        return amt;
    }
}
