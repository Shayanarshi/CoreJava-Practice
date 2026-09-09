class Inventory {
    private int[] stock;
    Inventory(int[] stock) {
        this.stock = stock;
    }
    void sell(int index) {
        synchronized (this) {
            if (stock[index] > 0) {
                stock[index]--;
                System.out.println(
                        Thread.currentThread().getName()
                                + " sold item " + index
                );
            }
        }
    }
}
class BillCounter extends  Thread {
    Inventory inventory;
    int index ;
    public  BillCounter(Inventory inventory , int index){
        this.inventory= inventory;
        this.index = index;
    }

    @Override
    public void run() {
        inventory.sell(index);
    }
}
class  Demo{
    public static void main(String[] args) {
        int [] stock  = {1,2,3};
        Inventory inventory = new Inventory(stock);
        BillCounter b1 = new BillCounter(inventory,0);
        BillCounter b2 = new BillCounter(inventory,0);

        b1.start();
        b2.start();


    }
}
