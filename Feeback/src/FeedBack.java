public class FeedBack {

    public static void processFeedback(String[] feedbacks){

        for(String feedback:feedbacks){

            try{
                String parts[]=feedback.split(":",2);
                String name=parts[0].toUpperCase();
                String message=parts[1];

                message=message.trim();
                message=message.replaceAll("\\s+"," ");
                message=message.replaceAll("(?i)bad","needs improvement"); // case 1
                if(message.length()<10){
                    throw new InvalidFeedbackException("Feedback too short");
                }
                StringBuilder sb=new StringBuilder();
                sb.append(name)
                  .append(" : ")
                  .append(message)
                  .append(" [Reviewed]");
                System.out.println(sb);
            }catch(InvalidFeedbackException ex){
                System.out.println("Invalid Feedback for "+feedback.split(":",2)[0]);

            }

        }

    }

}