package com.store.domain;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        BigDecimal sum1 = new BigDecimal("2.0");
        BigDecimal sum2 = new BigDecimal("1.1");

        System.out.println(sum1.subtract(sum2));
    }
}
