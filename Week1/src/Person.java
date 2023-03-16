public class Person {
    private String name;
    private int age;

    String getName() {return this.name;}
    int getAge(){return this.age;}

    void setName(String newName){
        if(newName == "") {
            this.name = "No name";
        } else {
            this.name = newName;
        }
    }

    void setAge(int newAge){
        this.age = newAge;
    }
    Person(){
        setName("No name");
        setAge(-1);
    }

    Person(String newName){
        setName(newName);
        setAge(-1);
    }

    Person(String newName, int newAge){
        setName(newName);
        setAge(newAge);
    }

    @Override
    public String toString() {
        String result = "Hello, I am ";
        if(this.name == "No name"){
            result += "John Doe.";
        }
        if(this.name != "No name"){
            result += this.getName() + ".";
        }
        if(this.age != -1) {
            result += "I am " + getAge() + " years old.";
        }
        return result;
    }

    public static void main(String[] args) {
        Person i = new Person("", -1);
        System.out.println(i);
    }
    
}
