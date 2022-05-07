package healthclinic;

public enum VitalSigns {

    PULSE(40,250),
    SYSTOLIC_BLOOD_PRESSURE(60,300),
    DIASTOLIC_BLOOD_PRESSURE(70,120);

    private Integer minValue;
    private Integer maxValue;

    VitalSigns(Integer minValue, Integer maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public Integer getMinValue() {
        return minValue;
    }

    public Integer getMaxValue() {
        return maxValue;
    }
}
