package in.ashokit;

public class FormatPrinter {
    private String str1,str2;

    // constructor
    public FormatPrinter(String str1,String str2){
        this.str1 = str1;
        this.str2 = str2;
    }
   // method having argument
    public void print(Formatter formatter){
        String result = formatter.format(str1,str2);
        System.out.println(result);
        }
    }
