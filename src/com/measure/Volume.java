package com.measure;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jaiprak on 3/16/2015.
 */
public class Volume implements CompareUnit{
    private double value;
    private Unit unit;
    private static final double PRECISION = 0.2;
    public Volume(Unit unit, double value) {
        this.value = value;
        this.unit = unit;
    }
    private static final Map<Unit,Double> conversionFactor = new HashMap<Unit,Double>();
    static {
        conversionFactor.put(Unit.GALLON, 3.78541d);
        conversionFactor.put(Unit.LITRE, 1d);
        conversionFactor.put(Unit.CUBIC_METER, 1000d);
    }

    public double getConvertedValue(){
        return value*conversionFactor.get(unit);
    }

    public boolean compare(Object o) {
        if (this == o) return true;
        if (!(o instanceof Volume)) return false;
        Volume volume = (Volume) o;
        double abs = Math.abs(getConvertedValue() - volume.getConvertedValue());
        return abs <= PRECISION;
    }
}