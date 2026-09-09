import java.util.ArrayList;
import java.util.Scanner;
public class Doctor extends Employee{
    private String specialization;
    private double consultationFee;
    private ArrayList<Patient> patients = new ArrayList<>(); // has a relation

    private Scanner sc = new Scanner(System.in);

            // gtrs and strs


    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }


// methods

    public  void acceptDoctorDetails()throws InvalidHospitalDataException{
        super.acceptEmployeeDetails();

        System.out.print("Please Enter Your Specialization: ");
        specialization = sc.nextLine();

        System.out.print("Please Enter Consultation Fee: ");
        consultationFee = sc.nextDouble();
        sc.nextLine();

        if (consultationFee <= 0) {
            throw new InvalidHospitalDataException(
                    "Consultation fee must be greater than zero.");
        }

    }


    public void addPatient(Patient patient){
        patients.add(patient);
    }

    public void displayPatients() {

        if (patients.isEmpty()) {
            System.out.println("No Patients Assigned.");
            return;
        }

        System.out.println("-----Patient Details------");

        for (Patient p : patients) {
            p.displayPatientDetails();
            System.out.println();
        }
    }


    public void displayDoctorDetails() {

        super.displayEmployeeDetails();

        System.out.println("----Doctor Details---");
        System.out.println("Specialization   : " + getSpecialization());
        System.out.println("Consultation Fee : " + getConsultationFee());
        displayPatients();
    }


}
