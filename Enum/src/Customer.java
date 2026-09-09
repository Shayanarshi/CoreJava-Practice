public class Customer {
    private  enum Gender{
        MALE, FEMALE, OTHERS;
    }
    private int id;
    private String name;
    private Gender gender;


    public Customer(int id, String name, Gender gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public void showCustomerData(){
        System.out.println("id = " + id);
        System.out.println("name = " + name);
        System.out.println("Gender =  "+gender);
    }

    public static void main(String[] args) {
        Customer customer = new Customer(101, "Shayan",Gender.MALE);
        customer.showCustomerData();
    }
}
