package com.measure;

import java.util.Map;

/**
 * Created by jaiprak on 3/17/2015.
 */
public class ScalarQuantity<U> {
    private double value;
    private U unit;
    public U baseUnit;
    private static final double PRECISION = 0.01;
    public Map<U,Double> conversionFactor;
    public ScalarQuantity(U unit, double value) {
        this.value = value;
        this.unit = unit;
    }

    public double getConvertedValue(){
        return value*conversionFactor.get(unit);
    }

    public boolean compare(Object o){
        if (this == o) return true;
        if (!(o instanceof ScalarQuantity)) return false;
        ScalarQuantity quantity = (ScalarQuantity) o;
        double abs = Math.abs(getConvertedValue() - quantity.getConvertedValue());
        return abs <= PRECISION;
    }
}
