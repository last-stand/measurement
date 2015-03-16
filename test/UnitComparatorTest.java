import com.measure.CompareUnit;
import com.measure.Length;
import com.measure.Unit;
import com.measure.Volume;
import org.junit.Test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by jaiprak on 3/13/2015.
 */
/*
* 1gallon = 3.78 litres*/

public class UnitComparatorTest {
    @Test
    public void test_1_foot_should_be_equal_to_12_inches(){
        CompareUnit<Length> foot = new Length(Unit.FOOT,1);
        CompareUnit<Length> inch = new Length(Unit.INCH,12);
        assertTrue(foot.compare((Length) inch));
        assertTrue(inch.compare((Length)foot));
    }

    @Test
    public void test_1p5_foot_should_be_equal_to_18_inches(){
        CompareUnit<Length> foot = new Length(Unit.FOOT,1.5);
        CompareUnit<Length> inch = new Length(Unit.INCH,18);
        assertTrue(foot.compare((Length) inch));
        assertTrue(inch.compare((Length) foot));
    }

    @Test
    public void test_27_inches_should_be_equal_to_2p25_feet(){
        CompareUnit<Length> foot = new Length(Unit.FOOT,2.25);
        CompareUnit<Length> inch = new Length(Unit.INCH,27);
        assertTrue(foot.compare((Length) inch));
        assertTrue(inch.compare((Length) foot));
    }

    @Test
    public void test_1_foot_should_be_equal_to_30_cms(){
        CompareUnit<Length> foot = new Length(Unit.FOOT,1);
        CompareUnit<Length> cms = new Length(Unit.CM,30);
        assertTrue(foot.compare((Length) cms));
        assertTrue(cms.compare((Length) foot));
    }

    @Test
    public void test_1_gallon_should_be_equal_to_3p78_litre(){
        CompareUnit<Volume> gallon = new Volume(Unit.GALLON,1);
        CompareUnit<Volume> litres = new Volume(Unit.LITRE,3.78);
        assertTrue(gallon.compare((Volume) litres));
        assertTrue(litres.compare((Volume) gallon));
    }

    @Test
    public void test_4_gallon_should_be_equal_to_15p1416_litre(){
        CompareUnit<Volume> gallon = new Volume(Unit.GALLON,4);
        CompareUnit<Volume> litres = new Volume(Unit.LITRE,15.1416);
        assertTrue(gallon.compare((Volume) litres));
        assertTrue(litres.compare((Volume) gallon));
    }

    @Test
    public void test_1_CUBIC_METER_should_be_equal_to_1000_litre(){
        CompareUnit<Volume> cubic_meter = new Volume(Unit.CUBIC_METER,1);
        CompareUnit<Volume> litres = new Volume(Unit.LITRE,1000);
        assertTrue(cubic_meter.compare((Volume) litres));
        assertTrue(litres.compare((Volume) cubic_meter));
    }

    @Test
    public void test_1_CUBIC_METER_should_be_equal_to_264p172_litre(){
        CompareUnit<Volume> cubic_meter = new Volume(Unit.CUBIC_METER,1);
        CompareUnit<Volume> gallon = new Volume(Unit.GALLON,264.172);
        assertTrue(cubic_meter.compare((Volume) gallon));
        assertTrue(gallon.compare((Volume) cubic_meter));
    }
}