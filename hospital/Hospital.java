//package hospitalOOP;
import java.util.List;

public class Hospital {
    private List<Doctor> doctors;
    private List<Nurse> nurses;
    private List<Patient> patients;
    private List<Surgery> surgeries;
    private static final int max_doctors = 20;
    private static final int max_nurses = 50;

    public Hospital(List<Doctor> doctors, List<Nurse> nurses, List<Patient> patients, List<Surgery> surgeries) {
        if (doctors.size() > max_doctors || nurses.size() > max_nurses){
            throw new IllegalArgumentException("Doktor veya hemşire sayısı fazla");
        }
        this.doctors = doctors;
        this.nurses = nurses;
        this.patients = patients;
        this.surgeries = surgeries;
    }

    public String getMostExaminedPatient(){
        int maxExaminations = 0;
        String mostExamined = null;

        for(Patient patient: patients){
            if(patient.getExaminations() > maxExaminations){
                maxExaminations = patient.getExaminations();
                mostExamined = patient.getName();
            }
        }
        return mostExamined;
    }

    public double getHighestSurgeryCost() {
        double maxCost = 0;
        for (Surgery surgery : surgeries) {
            double cost = surgery.getCost();
            if (maxCost < cost) {
                maxCost = cost;
            }
        }
        return maxCost;
    }
}
