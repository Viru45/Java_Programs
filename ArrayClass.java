import java.util.Arrays;

public class ArrayClass {

    public static void main(String[] args) {
        
        int[] arr1 = {5,4,2,3,1};
        Arrays.sort(arr1);
        System.out.println("Sorted Array is "+Arrays.toString(arr1));

        int[] arr2 = {1,2,3,4,5};
        int index = Arrays.binarySearch(arr2,4);
        System.out.println("Index of searched element is "+index);

        int[] arr3 = {5,4,3,2,1};
        int[] copy = Arrays.copyOf(arr3, 3);
        System.out.println("Copy array: "+Arrays.toString(copy));

        int[] arr4 = new int[5];
        Arrays.fill(arr4,3);
        System.out.println("Fill Array: "+Arrays.toString(arr4));

        int[] arr5 = {1,2,3};
        int[] arr6 = {1,2,3};
        boolean isEqual = Arrays.equals(arr5,arr6);
        System.out.println(isEqual);

        int[] arr7 = {1,2,3,4,5};
        int[] arr8 = {5,7,3,1,2};
        System.out.println("Arrays.compare(arr7,arr8): "+Arrays.compare(arr7,arr8));
    }
    
}
