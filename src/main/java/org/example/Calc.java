package org.example;

import org.springframework.stereotype.Service;

@Service
public class Calc {

    public long add(long num1, long num2) {
        return num1+num2;
    }



}