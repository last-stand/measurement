package com.measure;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jaiprak on 3/16/2015.
 */
public class Volume extends ScalarQuantity<VolumeUnit>{
    private static Map<VolumeUnit,Double> litre_conversionFactor = new HashMap<VolumeUnit, Double>();
    static {
        litre_conversionFactor.put(VolumeUnit.GALLON, 3.78541d);
        litre_conversionFactor.put(VolumeUnit.LITRE, 1d);
        litre_conversionFactor.put(VolumeUnit.CUBIC_METER, 1000d);
    }

    public Volume(VolumeUnit unit, double value) {
        super(unit,value);
        conversionFactor = litre_conversionFactor;
        baseUnit = VolumeUnit.LITRE;
    }
}