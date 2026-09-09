import java.util.Scanner;

public class Patient {
    private String patientId;
    private String patientName;
    private int age;
    private String disease;

    private Scanner sc = new Scanner(System.in);




    // g and s


    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

            // methods

    public void acceptPatientDetails() throws InvalidHospitalDataException{
        System.out.println("Please Enter Patient ID: ");
        patientId = sc.nextLine();

        System.out.print("Please Enter Patient Name: ");
        patientName = sc.nextLine();

        System.out.print("Please Enter Age: ");
        age = sc.nextInt();
        sc.nextLine();
        // for validation
        if(age <= 0){
            throw new InvalidHospitalDataException(
                    "Patient age must be greater than zero.");
        }

        System.out.print("Please Enter Disease: ");
        disease = sc.nextLine();




    }
    public void displayPatientDetails() {

        System.out.println("Patient Id  : " + patientId);
        System.out.println("Patient Name : " + patientName);
        System.out.println("Age          : " + age);
        System.out.println("Disease      : " + disease);
    }



}
