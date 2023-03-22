public class Car {
    private String make;
    private String model;
    private int year;
    private double price;

    public void setMake(String newMake){
        if(newMake != null){
            this.make = newMake;
        } else {
            throw new RuntimeException("This make is null");
        }
    }

    public void setMode(String newModel){
        if(newModel != null){
            this.model = newModel;
        } else {
            throw new RuntimeException("This model is null");
        }
    }

    public void setYear(int newYear){
        if(newYear > 0 ){
            this.year = newYear;
        } else {
            throw new RuntimeException("You have entered an negative year");
        }
    }

    public void setPrice(double newPrice){
        if(newPrice > 0 ){
            this.price = newPrice;
        } else {
            throw new RuntimeException("The price should be positive");
        }
    }

    public String getModel() {
        return this.model;
    }

    public String getMake(){
        return this.make;
    }

    public int getYear(){
        return this.year;
    }

    public double getPrice(){
        return this.price;
    }
    Car(String newMake, String newModel, int newYear, double newPrice){
        setMake(newMake);
        setMode(newModel);
        setPrice(newPrice);
        setYear(newYear);
    }

    @Override
    public String toString() {
        return "Make: " + this.getMake() +
                " Model: " + this.getModel() +
                " Year: " + this.getYear() +
                " Price: " + this.getPrice();
    }
}
