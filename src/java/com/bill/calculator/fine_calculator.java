package com.bill.calculator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class fine_calculator {
    public Double calculate_fine(Double amt,Date bill_date){
        dayscalculator daycalcu = new dayscalculator();
        int days = daycalcu.dayscalc(bill_date);
        if(days<=22)
            amt = 0.0;
        else if((days>=23)&&(days<=30))
            amt = amt*.05;
        else if((days>=31)&&(days<=40))
            amt = amt*.1;
         else if(days>40)
            amt = amt*.25;
        return amt;
    }
}
