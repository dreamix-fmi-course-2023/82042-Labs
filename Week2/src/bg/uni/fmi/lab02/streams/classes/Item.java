package bg.uni.fmi.lab02.streams.classes;

import java.math.BigDecimal;

public class Item {
    private String description;
    private BigDecimal price;

    public String getDescription() {
        return this.description;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setDescription(String newDescription) {
        if(newDescription != null){
            this.description =newDescription;
        } else {
            throw new RuntimeException("Description should be not empty");
        }
    }

    public void setPrice(BigDecimal newPrice) {
        BigDecimal zero = new BigDecimal("0");
        if (newPrice.compareTo(zero) == 1 ) {
            this.price = newPrice;
        } else {
            throw new RuntimeException("Price should be positive");
        }
    }

    public Item (String newDescription, BigDecimal newPrice){
        setDescription(newDescription);
        setPrice(newPrice);
    }

    @Override
    public String toString() {
        return "Description: " + this.getDescription() + " Price: " + this.getPrice();
    }
}
