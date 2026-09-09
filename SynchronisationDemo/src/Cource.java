public class Cource {

    private  String name;
    private int availableSeats;

    public Cource(String name, int availableSeats) {
        this.name = name;
        this.availableSeats = availableSeats;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }


}
