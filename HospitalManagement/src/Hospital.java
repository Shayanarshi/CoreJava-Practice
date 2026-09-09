import java.util.ArrayList;

public class Hospital {

    private ArrayList<Doctor> doctors = new ArrayList<>(); // has a list<Doctor>



    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }



    public void displayDoctors() {

        if (doctors.isEmpty()) {
            System.out.println("No Doctors Available.");
            return;
        }

        System.out.println("\n========= Hospital Report =========");

        for (Doctor doctor : doctors) {
            doctor.displayDoctorDetails();
            System.out.println("----------------------------------");
        }
    }


    public void searchDoctor(String employeeId) {

        boolean found = false;

        for (Doctor doctor : doctors) {

            if (doctor.getEmployeeId().equals(employeeId)) {

                System.out.println("\nDoctor Found");
                System.out.println("------------");
                doctor.displayDoctorDetails();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Doctor not found.");
        }
    }



}
