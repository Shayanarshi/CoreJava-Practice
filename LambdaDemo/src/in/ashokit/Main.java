package in.ashokit;

public class Main {
    public static void main(String[] args) {
        FormatPrinter fp = new FormatPrinter("Java8","Lambda");
        fp.print((s1,s2)-> s1.toUpperCase().concat(s2.toUpperCase()));
    }
}
