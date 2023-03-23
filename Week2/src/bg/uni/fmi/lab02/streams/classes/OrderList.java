package bg.uni.fmi.lab02.streams.classes;

import bg.uni.fmi.lab02.streams.vo.OrderLineStatus;

public class OrderList {
    private Item product;
    private OrderLineStatus status;
    boolean specialOffer;
    int count;

    public Item getProduct() {
        return this.product;
    }

    public OrderLineStatus getStatus() {
        return this.status;
    }

    public boolean isSpecialOffer() {
        return this.specialOffer;
    }

    public int getCount() {
        return this.count;
    }

    public void setProduct(Item newProduct) {
        this.product = newProduct;
    }

    public void setStatus(OrderLineStatus newStatus) {
        this.status = newStatus;
    }

    public void setSpecialOffer(boolean newSpecialOffer) {
        this.specialOffer = newSpecialOffer;
    }

    public void setCount(int newCount) {
        if(newCount > 0){
            this.count = newCount;
        } else {
            throw new RuntimeException("Count should be non negative");
        }
    }

    public OrderList(Item newProduct, OrderLineStatus newStatus, boolean newSpecialOffer, int newCount) {
        setProduct(newProduct);
        setStatus(newStatus);
        setSpecialOffer(newSpecialOffer);
        setCount(newCount);
    }

    @Override
    public String toString() {
        return "OrderList: " +
                "\nProduct: " + this.getProduct() +
                "\nStatus: " + this.getStatus() +
                "\nSpecial offer: " + this.isSpecialOffer() +
                "\nCount: " + this.getCount();
    }
}
