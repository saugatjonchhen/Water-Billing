package com.bill.calculator;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saroj
 */
public class unit_amt_calculator {

    public Double calculator(Double units) {
           Double final_amt = 0.0;
        if (units <= 5) {
            final_amt = 200.0;
        }else if ((units > 5) && (units <= 9)) {
            Double temp = units - 5;
            final_amt = 200 + temp * 40;
        }
        else if ((units > 9) && (units <= 13)) {
            Double temp = units - 9;
            final_amt = 360 + temp * 60;
        } else {
            Double temp = units - 13;
            final_amt = 600 + temp * 100;
        }
//        System.out.println(i+" "+final_amt);
        return final_amt;
    }
}
