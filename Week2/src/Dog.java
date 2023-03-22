import java.util.Comparator;

public class Dog implements Comparable<Dog>{
    private String breed;
    private double weight;

    public String getBreed(){
        return breed;
    }

    public double getWeight(){
        return weight;
    }

    public void setBreed(String breed) {
        if(breed == null){
            this.breed = "NA";
        } else {
            this.breed = breed;
        }
    }

    public void setWeight(double weight){
        if(weight > 0){
            this.weight = weight;
        } else {
            throw new RuntimeException("Dog weight should be positive");
        }
    }

    public  Dog (String breed, double weight){
        setBreed(breed);
        setWeight(weight);
    }

    @Override
    public String toString() {
        return "Breed: " + this.getBreed() + " Weight: " + this.getWeight();
    }

    @Override
    public int compareTo(Dog other) {
        return (int) (this.getWeight() - other.getWeight());
    }
}

class SortByWeight implements Comparator<Dog> {
    public int compare(Dog d1, Dog d2){
        return (int) (d1.getWeight() - d2.getWeight());
    }
}
