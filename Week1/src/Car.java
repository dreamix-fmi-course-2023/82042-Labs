import java.time.Year;

public class Car {
    private String brand;
    private String model;
    private int horsePower;
    private int year;

    Car(String newBrand, String newModel, int newHorsePower, int newYear){
        this.brand = newBrand;
        this.horsePower = newHorsePower;
        this.model = newModel;
        this.year = newYear;
    }

    private String getBrand(){
        return this.brand;
    }

    private String getModel(){
        return this.model;
    }

    private int getHorsePower(){
        return this.horsePower;
    }

    private int getYear(){
        return this.year;
    }

    public int insuranceCategory(){
        int category = 0;
        int carAge = Year.now().getValue() - getYear();
        if(carAge < 8)
            category = 1;
        else if(carAge >= 8 && carAge <= 15)
            category = 2;
        else if(carAge >= 16 && carAge <=25 )
            category = 3;
        else if(carAge > 26)
            category = 4;

        return category;
    }

    public double insuranceValue(){
        int category = this.insuranceCategory();
        int value = 0;
        switch (category){
            case 1 : value = 150; break;
            case 2 : value = 200; break;
            case 3 : value = 300; break;
            case 4 : value = 500; break;
        }
        if(this.horsePower < 80)
            value += value * 0.2;
        if(this.horsePower > 140)
            value += value * 0.45;
        return value;
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + " " + getYear() + " " + getHorsePower() + " -> " + insuranceValue() + "\n";
    }
}
