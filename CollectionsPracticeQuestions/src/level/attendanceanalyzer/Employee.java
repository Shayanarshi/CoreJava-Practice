package level.attendanceanalyzer;

public class Employee {
    private int employeeId;
    private String employeeName;
    private  String department;
    private int [] attendance;


     public int getEmployeeId() {
          return employeeId;
     }

     public void setEmployeeId(int employeeId) {
          this.employeeId = employeeId;
     }

     public String getEmployeeName() {
          return employeeName;
     }

     public void setEmployeeName(String employeeName) {
          this.employeeName = employeeName;
     }

     public String getDepartment() {
          return department;
     }

     public void setDepartment(String department) {
          this.department = department;
     }

     public int[] getAttendance() {
          return attendance;
     }

     public void setAttendance(int[] attendance) {
          this.attendance = attendance;
     }
}
