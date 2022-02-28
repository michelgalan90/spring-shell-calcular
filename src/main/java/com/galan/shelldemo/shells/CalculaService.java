package com.galan.shelldemo.shells;

import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class CalculaService {
    private Integer num1;

    private Integer num2;


    public Integer getNum1() {
        return num1;
    }

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    public Integer sumar(Integer num1, Integer num2) {
        return num1 + num2;
    }
}
