package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import healthclinic.HealthClinic;
import org.testng.asserts.Assertion;

public class HealthClinicTestNG {

    @Test
    public void analyzeHealthByVitalSigns_allValuesOk_resultTrue() {

        //given
        Integer systolicBloodPressure = 80;
        Integer diastolicBloodPressure = 80;
        Integer pulse = 80;
        HealthClinic clinic = new HealthClinic();

        //when
        boolean result = clinic.analyzeHealthByVitalSigns(systolicBloodPressure, diastolicBloodPressure, pulse);

        //then
        Assert.assertTrue(result);
    }

    @Test
    public void analyzeHealthByVitalSigns_pulseNotOk_resultFalse() {

        //given
        Integer systolicBloodPressure = 80;
        Integer diastolicBloodPressure = 80;
        Integer pulse = 10;
        HealthClinic clinic = new HealthClinic();

        //when
        boolean result = clinic.analyzeHealthByVitalSigns(systolicBloodPressure, diastolicBloodPressure, pulse);

        //then
        Assert.assertFalse(result);
    }

    @Test
    public void analyzeHealthByVitalSigns_allValuesAreMin_resultFalse() {

        //given
        Integer systolicBloodPressure = 60;
        Integer diastolicBloodPressure = 70;
        Integer pulse = 40;
        HealthClinic clinic = new HealthClinic();

        //when
        boolean result = clinic.analyzeHealthByVitalSigns(systolicBloodPressure, diastolicBloodPressure, pulse);

        //then
        Assert.assertFalse(result);
    }

    @DataProvider(name = "data")
    public Object[][] dataProviderMethod() {
        return new Object[][]{{80,80,80, true},
                {80,80,10, false},
                {60,70,40, false}
        };
    }

    @Test(dataProvider = "data")
    public void analyzeHealthByVitalSigns_withDataProvider_resultFromDataProvider(Integer systolicBloodPressure, Integer diastolicBloodPressure, Integer pulse, boolean expectedResult){

        //given
        HealthClinic clinic = new HealthClinic();

        //when
        boolean result = clinic.analyzeHealthByVitalSigns(systolicBloodPressure, diastolicBloodPressure, pulse);

        //then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void analyzeHealthByVitalSigns_pulseNull_throwsIllegalArgumentException() {

        //given
        Integer systolicBloodPressure = 80;
        Integer diastolicBloodPressure = 80;
        Integer pulse = null;
        HealthClinic clinic = new HealthClinic();

        //when

        //then
        Assert.assertThrows(IllegalArgumentException.class, () -> clinic.analyzeHealthByVitalSigns(systolicBloodPressure, diastolicBloodPressure, pulse));
    }

    @Test
    public void analyzeHealthByVitalSigns_pulseThanZero_throwsIllegalArgumentException() {

        //given
        Integer systolicBloodPressure = 80;
        Integer diastolicBloodPressure = 80;
        Integer pulse = -5;
        HealthClinic clinic = new HealthClinic();
        //when

        //then
        Assert.assertThrows(IllegalArgumentException.class, () -> clinic.analyzeHealthByVitalSigns(systolicBloodPressure, diastolicBloodPressure, pulse));
    }


}
