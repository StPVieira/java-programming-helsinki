
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {-1, 3, 1, 2};
        System.out.println("Smallest: " + smallest(array));
        System.out.println("Index of smallest: " + indexOfSmallest(array));
        System.out.println(indexOfSmallestFrom(array, 2));
        
        System.out.println(Arrays.toString(array));
        
        swap(array, 1, 0);
        System.out.println(Arrays.toString(array));
        
        swap(array, 0, 3);
        System.out.println(Arrays.toString(array));
        sort(array);
    }
    
    public static int smallest(int[] array){
        int smallest = array[0];
        for(int number: array){
            if(number < smallest){
                smallest = number;
            }
        }
        return smallest;
    }
    public static int indexOfSmallest(int[] array){
        int indexSmallest = 0;
        int smallest = array[0];
        
        for(int i = 0; i < array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];
                indexSmallest = i;
            }
        }
        return indexSmallest;
    }
    public static int indexOfSmallestFrom(int[] array, int startIndex){
        int indexSmallest = 0;
        int smallest = array[startIndex];
        
        for(int i = startIndex; i < array.length; i++){
            if(array[i] <= smallest){
                smallest = array[i];
                indexSmallest = i;
            }
        }
        return indexSmallest;
    }
    
    public static void swap(int[] array, int index1, int index2){
        int swapper = 0;
        swapper = array[index1];
        array[index1] = array[index2];
        array[index2] = swapper;
    }
    
    public static void sort(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(Arrays.toString(array));
            int currentSmallest = indexOfSmallestFrom(array, i);
            swap(array, i, currentSmallest);
        }
    }

}
