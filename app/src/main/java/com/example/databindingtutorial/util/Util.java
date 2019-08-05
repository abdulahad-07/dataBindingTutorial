package com.example.databindingtutorial.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Util {
    
    public static String convertIntToString(int value) {
        return "(" + String.valueOf(value) + ")";
    }
    
    public static float getFloat(BigDecimal value) {
        return value.floatValue();
    }
    
    public static String getValue(BigDecimal value) {
        DecimalFormat df = new DecimalFormat("###,###,###.00");
        return String.valueOf(df.format(value));
    }
    
    public static String getQuantityString(int value) {
        return "Qty: " + String.valueOf(value);
    }
}
