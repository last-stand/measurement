package com.measure;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jaiprak on 3/16/2015.
 */
public class Length extends ScalarQuantity<LengthUnit>{
    private static Map<LengthUnit,Double> inch_conversionFactor = new HashMap<LengthUnit,Double>();
    static {
        inch_conversionFactor.put(LengthUnit.FOOT, 12d);
        inch_conversionFactor.put(LengthUnit.INCH, 1d);
        inch_conversionFactor.put(LengthUnit.CM, 0.394d);
    }

    public Length(LengthUnit unit, double value) {
        super(unit,value);
        conversionFactor = inch_conversionFactor;
        baseUnit = LengthUnit.INCH;
    }
}
