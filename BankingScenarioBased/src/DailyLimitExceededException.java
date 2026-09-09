public class DailyLimitExceededException extends  Exception {
    public  DailyLimitExceededException(){
        super("Daily withdrawal limit exceeded.");
    }
}
