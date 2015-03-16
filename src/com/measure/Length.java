package com.measure;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jaiprak on 3/16/2015.
 */
public class Length implements CompareUnit{
    private double value;
    private Unit unit;
    private static final double PRECISION = 0.2;
    public Length(Unit unit, double value) {
        this.value = value;
        this.unit = unit;
    }
    private static final Map<Unit,Double> conversionFactor = new HashMap<Unit,Double>();
    static {
        conversionFactor.put(Unit.FOOT, 12d);
        conversionFactor.put(Unit.INCH, 1d);
        conversionFactor.put(Unit.CM, 0.394d);
    }

    public double getConvertedValue(){
        return value*conversionFactor.get(unit);
    }

    public boolean compare(Object o) {
        if (this == o) return true;
        if (!(o instanceof Length)) return false;
        Length length = (Length) o;
        double abs = Math.abs(getConvertedValue() - length.getConvertedValue());
        return abs <= PRECISION;
    }
}
