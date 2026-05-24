public class valueOf {
    public static void main(String[] args) {
        int x =3;
        String s1 = String.valueOf(x);
        boolean flag = true;
        String s2 = String.valueOf(flag);
        System.out.println(s1+s2);

        System.out.println(String.valueOf(1.2)+ String.valueOf(1.3));// concatination

    }

}
