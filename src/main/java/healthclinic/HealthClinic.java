package healthclinic;

public class HealthClinic {

    public boolean analyzeHealthByVitalSigns(Integer systolicBloodPressure, Integer diastolicBloodPressure, Integer pulse) {

        boolean systolicBloodPressureNull = null == systolicBloodPressure;
        boolean diastolicBloodPressureNull = null == diastolicBloodPressure;
        boolean pulseNull = null == pulse;

        if (systolicBloodPressureNull || diastolicBloodPressureNull || pulseNull) {

            throw new IllegalArgumentException("Vital signs can not be null");
        }
        boolean isSystolicBloodPressureCorrect = isCorrect(systolicBloodPressure, VitalSigns.SYSTOLIC_BLOOD_PRESSURE);
        boolean isDiastolicBloodPressureCorrect = isCorrect(diastolicBloodPressure, VitalSigns.DIASTOLIC_BLOOD_PRESSURE);
        boolean isPulseCorrect = isCorrect(pulse, VitalSigns.PULSE);
        if (isSystolicBloodPressureCorrect && isDiastolicBloodPressureCorrect && isPulseCorrect) {
            return true;
        }
        return false;
    }

    private boolean isCorrect(Integer value, VitalSigns vitalSigns) {

        if (value < 0) {

            throw new IllegalArgumentException("Incorrect value");
        }
        Integer maxValue = vitalSigns.getMaxValue();
        Integer minValue = vitalSigns.getMinValue();
        if (value > minValue && value < maxValue) {

            return true;
        }
        return false;
    }
}
