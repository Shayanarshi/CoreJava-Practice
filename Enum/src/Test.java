public class Test {
    public static void main(String[] args) {
        Signal[] signals = Signal.values();
        for (Signal s : signals) {
            System.out.println(s.getValue());
        }
    }
}