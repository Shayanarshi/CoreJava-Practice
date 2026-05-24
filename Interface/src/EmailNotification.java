public  class EmailNotification implements  Notification {

    @Override
    public void  send(String input,String text){

        System.out.println("Email is sent to " +input +" With tne text: "+text);


    }
}