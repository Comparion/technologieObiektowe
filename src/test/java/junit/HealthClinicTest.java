package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import healthclinic.HealthClinic;

public class HealthClinicTest {

    @Test
    public void analyzeHealthByVitalSigns_pulseNull_throwsIllegalArgumentException() {

        //given
        Integer systolicBloodPressure = 80;
        Integer diastolicBloodPressure = 80;
        Integer pulse = null;
        HealthClinic clinic = new HealthClinic();

        //when

        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> clinic.analyzeHealthByVitalSigns(systolicBloodPressure, diastolicBloodPressure, pulse));
    }

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
        Assertions.assertTrue(result);
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
        Assertions.assertFalse(result);
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
        Assertions.assertThrows(IllegalArgumentException.class, () -> clinic.analyzeHealthByVitalSigns(systolicBloodPressure, diastolicBloodPressure, pulse));
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
        Assertions.assertFalse(result);
    }
}
