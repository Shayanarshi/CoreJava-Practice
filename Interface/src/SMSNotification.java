public  class SMSNotification implements Notification{
     @Override
        public void send(String input,String text){
         System.out.println("The SMS is sent to "+input+ " with the text: "+text);

     }


}
