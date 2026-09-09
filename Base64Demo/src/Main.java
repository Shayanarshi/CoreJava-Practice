public class Main {
    public static void main(String[] args) throws Exception{
       /*String encodedText = TextEncoder.encode("Hey Everyone");
        System.out.println(encodedText);

        String normalText = TextEncoder.decode(encodedText);
        System.out.println(normalText);
        */

        String encodeText = ImageEncoder.encode("C:\\Users\\arshi\\Downloads\\img1.jpeg");
        System.out.println(encodeText);

        String result = ImageEncoder.decode(encodeText);
        System.out.println(result);
    }
}
