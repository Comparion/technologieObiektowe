package junit;

import org.junit.Test;
import org.junit.Assert;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
import healthclinic.HealthClinic;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.Arguments;
//import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class HealthClinicTestJUnit {

//    @Test
//    public void analyzeHealthByVitalSigns_allValuesOk_resultTrue() {
//
//        //given
//        Integer systolicBloodPressure = 80;
//        Integer diastolicBloodPressure = 80;
//        Integer pulse = 80;
//        HealthClinic clinic = new HealthClinic();
//
//        //when
//        boolean result = clinic.analyzeHealthByVitalSigns(systolicBloodPressure, diastolicBloodPressure, pulse);
//
//        //then
//        Assertions.assertTrue(result);
//    }
//
//    @Test
//    public void analyzeHealthByVitalSigns_pulseNotOk_resultFalse() {
//
//        //given
//        Integer systolicBloodPressure = 80;
//        Integer diastolicBloodPressure = 80;
//        Integer pulse = 10;
//        HealthClinic clinic = new HealthClinic();
//
//        //when
//        boolean result = clinic.analyzeHealthByVitalSigns(systolicBloodPressure, diastolicBloodPressure, pulse);
//
//        //then
//        Assertions.assertFalse(result);
//    }
//
//    @Test
//    public void analyzeHealthByVitalSigns_allValuesAreMin_resultFalse() {
//
//        //given
//        Integer systolicBloodPressure = 60;
//        Integer diastolicBloodPressure = 70;
//        Integer pulse = 40;
//        HealthClinic clinic = new HealthClinic();
//
//        //when
//        boolean result = clinic.analyzeHealthByVitalSigns(systolicBloodPressure, diastolicBloodPressure, pulse);
//
//        //then
//        Assertions.assertFalse(result);
//    }
//
//    private static Stream<Arguments> data(){
//        return Stream.of(
//                Arguments.of(80,80,80, true),
//                Arguments.of(80,80,10, false),
//                Arguments.of(60,70,40, false));
//    }
//
//    @ParameterizedTest
//    @MethodSource("data")
//    public void analyzeHealthByVitalSigns_withDataFromMethod_resultFromData(Integer systolicBloodPressure, Integer diastolicBloodPressure, Integer pulse, boolean expectedResult){
//
//        //given
//        HealthClinic clinic = new HealthClinic();
//
//        //when
//        boolean result = clinic.analyzeHealthByVitalSigns(systolicBloodPressure, diastolicBloodPressure, pulse);
//
//        //then
//        Assertions.assertEquals(expectedResult, result);
//    }
//
//    @Test
//    public void analyzeHealthByVitalSigns_pulseNull_throwsIllegalArgumentException() {
//
//        //given
//        Integer systolicBloodPressure = 80;
//        Integer diastolicBloodPressure = 80;
//        Integer pulse = null;
//        HealthClinic clinic = new HealthClinic();
//
//        //when
//
//        //then
//        Assertions.assertThrows(IllegalArgumentException.class, () -> clinic.analyzeHealthByVitalSigns(systolicBloodPressure, diastolicBloodPressure, pulse));
//    }
//
//    @Test
//    public void analyzeHealthByVitalSigns_pulseThanZero_throwsIllegalArgumentException() {
//
//        //given
//        Integer systolicBloodPressure = 80;
//        Integer diastolicBloodPressure = 80;
//        Integer pulse = -5;
//        HealthClinic clinic = new HealthClinic();
//        //when
//
//        //then
//        Assertions.assertThrows(IllegalArgumentException.class, () -> clinic.analyzeHealthByVitalSigns(systolicBloodPressure, diastolicBloodPressure, pulse));
//    }

    @Test
    public void longHealthClinicTest_1s() throws InterruptedException {
        Thread.sleep(1000);
    }

    @Test
    public void longHealthClinicTest_2s() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test
    public void longHealthClinicTest_5s() throws InterruptedException {
        Thread.sleep(5000);
    }

    @Test
    public void longHealthClinicTest_10s() throws InterruptedException {
        Thread.sleep(10000);
    }
}
