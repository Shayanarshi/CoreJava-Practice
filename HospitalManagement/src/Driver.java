import javax.print.Doc;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Hospital hospital = new Hospital(); // for using Hospital Class craeting object

        // try catch
        try{
            System.out.println("Please Enter Number of Doctors: ");
            int dn = sc.nextInt();
            sc.nextLine();

            // for doctor number handling
            for (int i =1; i<=dn;i++){
                System.out.println("Doctors Details: ");
                Doctor doctor = new Doctor();
                doctor.acceptDoctorDetails();

                System.out.println("Please Enter the Number of Patient: ");
                int pn = sc.nextInt();
                sc.nextLine();

                for(int j =1; j<=pn;j++){
                    System.out.println("Patient: " + j);
                    Patient patient = new Patient();
                    patient.acceptPatientDetails();
                    doctor.addPatient(patient);
                }
                hospital.addDoctor(doctor);
            }

            System.out.println();
            hospital.displayDoctors();

            System.out.print("\nEnter Doctor Employee Id to Search : ");
            String empId = sc.nextLine();

            hospital.searchDoctor(empId);

        }
        catch (InvalidHospitalDataException e ){
            System.out.println("InvalidHospitalDataException:");
            System.out.println(e.getMessage());
        }
    }
}
