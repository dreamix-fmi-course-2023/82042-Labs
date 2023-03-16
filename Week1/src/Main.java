public class Main {

    public static int factorial(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact*i;
        }
        return fact;
    }

    public static int firstOccurrence(int[] arr, int number){
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                index = i;
                break;
            }
        }
        return index;
    }

    public static int nthOdd(int[] arr, int position){
        int nthOddNumber = -1;
        int currOddsCount = 1;
        int index = 0;
        while(currOddsCount < position){
            index++;
            if(arr[index] % 2 != 0) {
                currOddsCount++;
            }
        }
        nthOddNumber = arr[index];
        if(position > arr.length){
            nthOddNumber = -1;
        }
        return nthOddNumber;
    }

    //abba
    public static boolean isPalindrome(String word){
        int wordLen = word.length();

        for (int i = 0, j = wordLen - 1; i < wordLen / 2; i++, j--) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
        }
        return true;
    }
    public static void stars(int n){
        String stars = "";
        for (int i = 1; i <= n; i++) {
            stars = stars + " * ";
            System.out.println(stars);
        }
    }


    public static void main(String[] args) {
        int[] arr = {2,4,3,8,9};
        int[] arr2 = {5,3,8,1,9};

        System.out.println(factorial(5));
        System.out.println(firstOccurrence(arr, 10));
        System.out.println(nthOdd(arr2,1));
        System.out.println(isPalindrome("abccba"));
        stars(5);
    }
}