public class OrderFulfillmentSystem {
    private Product[] inventory;

    // constructor

    public OrderFulfillmentSystem(Product[] inventory){
        this.inventory=inventory;
    }

    public void processOrderPayload(String rawOrder){

        String[] orders=rawOrder.split(",");
        double totalBill=0;

        System.out.println("--- Processing Order ---");

        for(String order:orders){
            String[] data=order.split(":");

            String productId=data[0];
            int quantity=Integer.parseInt(data[1]);
            boolean found=false;

            for(Product product:inventory){

                if(product.getProductId().equals(productId)){
                    found=true;

                    if(product.reduceStock(quantity)){
                        double cost=product.getPrice()*quantity;
                        totalBill+=cost;

                        System.out.println("- "+product.getName()+" x "+quantity+": $"+cost);
                    }else{
                        System.out.println("- "+product.getName()+" : Stock Insufficient");
                    }

                    break;
                }
            }

            if(!found){
                System.out.println("Product ID "+productId+" not found.");
            }
        }

        System.out.println("------------------------");
        System.out.println("Order Successful! Total Bill: $"+totalBill);

        for(Product product:inventory){
            System.out.println("Remaining Stock for "+product.getProductId()+": "+product.getStockQuantity());
        }
    }
}