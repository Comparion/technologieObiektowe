package healthclinic;

public class HealthClinicResult {

    private long patientId;
    private boolean vitalSignsResult;

    public HealthClinicResult(long patientId, boolean vitalSignsResult) {
        this.patientId = patientId;
        this.vitalSignsResult = vitalSignsResult;
    }

    public long getPatientId() {
        return patientId;
    }

    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }

    public boolean isVitalSignsResult() {
        return vitalSignsResult;
    }

    public void setVitalSignsResult(boolean vitalSignsResult) {
        this.vitalSignsResult = vitalSignsResult;
    }
}

