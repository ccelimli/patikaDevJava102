public class OrderMatic implements Runnable{
    private int orderNo;
    private final Object LOCK = new Object();
    public OrderMatic(){
        this.orderNo=0;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        increaseOrder();
    }

    public synchronized void increaseOrder(){
        this.orderNo++;
        System.out.println(Thread.currentThread().getName()+" - Order No: "+this.orderNo);
    }
    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }
}
