package healthclinic;

import java.util.ArrayList;
import java.util.List;

public class HealthClinic {

    public List<HealthClinicResult> analyzeHealthByVitalSignsList(List<VitalSignsDetails> vitalSignsDetails) {

        List<HealthClinicResult> results = new ArrayList<>();
        vitalSignsDetails.forEach(details -> {
            boolean analyzeResult = analyzeSingle(details);
            results.add(new HealthClinicResult(details.getId(),analyzeResult));
        });

        return results;
    }

    private boolean analyzeSingle(VitalSignsDetails vitalSignsDetails) {
        Integer systolicBloodPressure = vitalSignsDetails.getSystolicBloodPressure();
        Integer diastolicBloodPressure = vitalSignsDetails.getDiastolicBloodPressure();
        Integer pulse = vitalSignsDetails.getPulse();
        return analyzeHealthByVitalSigns(systolicBloodPressure, diastolicBloodPressure, pulse);
    }

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
