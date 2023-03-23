package collections;

import java.util.*;

public class Exercise {
    public static void print(ArrayList<String> list){
        for (String str : list) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    public static void printDogs(ArrayList<Dog> dogs){
        for (Dog dog: dogs){
            System.out.println(dog);
        }
    }
    public static void insertFirst(String newElement, ArrayList<String> list){
        list.add(0,newElement);
    }

    public static String retrieveElement(ArrayList<String> list, int index){
        String result = null;
        for (int i = 0; i < list.size(); i++) {
            if(i == index){
                result = list.get(i);
            }
        }
        return result;
    }

    public static void removeKth(ArrayList<String> list, int k){
        list.remove(k - 1);
    }

    public static int search(ArrayList<String> list, String element){
        int result = -1;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == element ){
                result = i + 1;
            }
        }
        return result;
    }

    public static void replace(ArrayList<String> list, String specified, int position){
        list.set(position - 1, specified);
    }

    public static int keyValuePairsCount(HashMap<String,Integer> map){
        return map.size();
    }


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e", "f"));

        print(list);

        insertFirst("n", list);
        print(list);

        System.out.println(retrieveElement(list,4));

        removeKth(list, 3);
        print(list);

        System.out.println(search(list, "d"));
        print(list);
        replace(list,"X", 2);
        print(list);

        ArrayList<Dog> dogs = new ArrayList<>();
        Dog dog1 = new Dog("Belgian Shepherd collections.Dog", 25.2);
        Dog dog2 = new Dog("Pincher", 5.3);
        Dog dog3 = new Dog("Bulgarian Shepherd collections.Dog", 50.0);

        dogs.add(dog3);
        dogs.add(dog2);
        dogs.add(dog1);

        printDogs(dogs);
        Collections.sort(dogs,new SortByWeight());
        System.out.println();
        printDogs(dogs);

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        System.out.println(keyValuePairsCount(map));
    }
}