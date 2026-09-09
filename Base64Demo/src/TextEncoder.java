import java.util.Base64;

public class TextEncoder {


    public static String encode(String normalText){
        // create Encoder Instance
        Base64.Encoder encoder = Base64.getEncoder();
        // convert the normal text into bytes
        byte [] bytes = normalText.getBytes();
        String  encodedText = encoder.encodeToString(bytes);
        return encodedText;

    }


    public static String decode(String encodedText){
        // create Encoder Instance
        Base64.Decoder decoder = Base64.getDecoder();
        //decode the  encoded text into bytes
        byte [] bytes = decoder.decode(encodedText);
        // convert bytes into normal text
        String normalText = new String(bytes);

        return normalText;




    }

}
