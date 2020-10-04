package com.example.service.producer;

import com.example.service.TestMath;

public class TestMathImpl implements TestMath {

    @Override
    public double pow(double base, double exponent) {
        return Math.pow(base,exponent);
    }

}
