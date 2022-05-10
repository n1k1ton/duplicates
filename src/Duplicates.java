import java.util.Arrays;

public class Duplicates {
    public  static  boolean hasDuplicates(int[] array){
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if (array[i] == array[j] && i != j){
                    return true;
                }
            }
        }
        return  false;
    }

    public static void main(String[] args) {
        int[] array = {1,5,3,6,2,9,33,21};
        System.out.println(hasDuplicates(array));  // false
        array[5] = 1;
        System.out.println(hasDuplicates(array)); // true
    }
}