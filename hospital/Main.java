import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Doctor doctor1 = new Doctor("aras", 100, true);
        Doctor doctor2 = new Doctor("cem", 200, false);
        Nurse nurse1 = new Nurse("sarper", 100);
        Nurse nurse2 = new Nurse("yonca", 300);

        List<Doctor> doctors = new ArrayList<>();
        doctors.add(doctor1);
        doctors.add(doctor2);

        List<Nurse> nurses = new ArrayList<>();
        nurses.add(nurse1);
        nurses.add(nurse2);

        Patient patient1 = new Patient("gonca");
        Patient patient2 = new Patient("kardelen");

        patient1.setExaminations();
        patient1.setExaminations();
        patient1.setExaminations();
        patient1.setExaminations();

        patient2.setExaminations();
        patient2.setExaminations();

        List<Patient> patients = new ArrayList<>();
        patients.add(patient1);
        patients.add(patient2);

        List<Doctor> surgeryDoctors = new ArrayList<>();
        if(doctor1.isSurgeon())
            surgeryDoctors.add(doctor1);
        else
            throw new IllegalArgumentException("Bu doktor ameliyat yapamaz");

        List<Nurse> surgeryNurses = new ArrayList<>();
        surgeryNurses.add(nurse1);
        surgeryNurses.add(nurse2);

        Surgery surgery3 = new Surgery(surgeryDoctors, surgeryNurses, 10, 22);
        Surgery surgery1 = new Surgery(surgeryDoctors, surgeryNurses, 10, 21);
        Surgery surgery2 = new Surgery(surgeryDoctors, surgeryNurses, 10, 20);


        List<Surgery> surgeries = new ArrayList<>();
        surgeries.add(surgery1);
        surgeries.add(surgery2);
        surgeries.add(surgery3);

        Hospital hospital = new Hospital(doctors, nurses, patients, surgeries);

        double highestSurgeryCost = hospital.getHighestSurgeryCost();
        System.out.println("high surg cost: " + highestSurgeryCost);

        String maxExaminedPatient = hospital.getMostExaminedPatient();
        System.out.println("most examed pat: " + maxExaminedPatient);
    }
}
