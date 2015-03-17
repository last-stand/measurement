import com.measure.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by jaiprak on 3/13/2015.
 */

public class UnitComparatorTest {
    @Test
    public void test_1_foot_should_be_equal_to_12_inches(){
        Length foot = new Length(LengthUnit.FOOT,1);
        Length inch = new Length(LengthUnit.INCH,12);
        assertTrue(foot.compare(inch));
        assertTrue(inch.compare(foot));
    }

    @Test
    public void test_1p5_foot_should_be_equal_to_18_inches(){
        Length foot = new Length(LengthUnit.FOOT,1.5);
        Length inch = new Length(LengthUnit.INCH,18);
        assertTrue(foot.compare(inch));
        assertTrue(inch.compare(foot));
    }

    @Test
    public void test_27_inches_should_be_equal_to_2p25_feet(){
        Length foot = new Length(LengthUnit.FOOT,2.25);
        Length inch = new Length(LengthUnit.INCH,27);
        assertTrue(foot.compare(inch));
        assertTrue(inch.compare(foot));
    }

    @Test
    public void test_1_foot_should_be_equal_to_30p48_cms(){
        Length foot = new Length(LengthUnit.FOOT,1);
        Length cms = new Length(LengthUnit.CM,30.48);
        assertTrue(foot.compare(cms));
        assertTrue(cms.compare(foot));
    }

    @Test
    public void test_1_foot_plus_1_foot_should_be_equal_to_2_feet(){
        Length foot1 = new Length(LengthUnit.FOOT,1);
        Length foot2 = new Length(LengthUnit.FOOT,2);
        assertEquals(foot1.add(foot2),36,0.0);
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Test
    public void test_1_gallon_should_be_equal_to_3p78_litre(){
        Volume gallon = new Volume(VolumeUnit.GALLON,1);
        Volume litres = new Volume(VolumeUnit.LITRE,3.78);
        assertTrue(gallon.compare(litres));
        assertTrue(litres.compare(gallon));
    }

    @Test
    public void test_4_gallon_should_be_equal_to_15p1416_litre(){
        Volume gallon = new Volume(VolumeUnit.GALLON,4);
        Volume litres = new Volume(VolumeUnit.LITRE,15.1416);
        assertTrue(gallon.compare(litres));
        assertTrue(litres.compare(gallon));
    }

    @Test
    public void test_1_CUBIC_METER_should_be_equal_to_1000_litre(){
        Volume cubic_meter = new Volume(VolumeUnit.CUBIC_METER,1);
        Volume litres = new Volume(VolumeUnit.LITRE,1000);
        assertTrue(cubic_meter.compare(litres));
        assertTrue(litres.compare(cubic_meter));
    }

    @Test
    public void test_1_CUBIC_METER_should_be_equal_to_264p172_litre(){
        Volume cubic_meter = new Volume(VolumeUnit.CUBIC_METER,1);
        Volume gallon = new Volume(VolumeUnit.GALLON,264.172);
        assertTrue(cubic_meter.compare(gallon));
        assertTrue(gallon.compare(cubic_meter));
    }
}