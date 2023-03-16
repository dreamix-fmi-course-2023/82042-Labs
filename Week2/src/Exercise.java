import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exercise {
    public static void print(ArrayList<String> list){
        for (String str : list) {
            System.out.print(str + " ");
        }
        System.out.println();
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
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e", "f"));



        print(list);

        insertFirst("n", list);

        print(list);

        System.out.println(retrieveElement(list,4));

        removeKth(list, 3);

        print(list);

        System.out.println(search(list, "d"));
    }
}