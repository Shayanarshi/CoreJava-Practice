public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        try{
            for(int i = 0;i<s.marks.length;i++){
                if(s.marks[i]<0 || s.marks[i]>100){
                    System.out.println("Invalid marks entered");
                    return;
                }
            }
            System.out.println("Student Id: " + s.studentId);
            System.out.println("Student Name: " + s.studentName);
            System.out.println("Total Marks: " + s.calculateTotal());
            System.out.println("Average Marks: " + s.calculateAverage());
        }
        catch (Exception e ){
//            System.out.println(e.getMessage());  or better
            System.out.println("Error");
        }
    }
}
