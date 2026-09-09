 class Student {
     int studentId = 101;
     String studentName = "Ravi";
    int [] marks  = {80,90,70};
    public int calculateTotal(){
        int total = 0;
        for(int  i =0 ; i<marks.length;i++){
            total += marks[i];
        }
        return total;
    }
    public double calculateAverage(){
        return calculateTotal()/3.0;

    }
}
