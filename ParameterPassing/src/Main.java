class A{
    void m1(StringBuffer sb  ){
        sb.append("world");
    }
}

public class Main{
    public static void main(String[] args) {
       StringBuffer sb =  new StringBuffer("hello");
       A a = new A();
       a.m1(sb) ;
        System.out.println(sb);
    }
}