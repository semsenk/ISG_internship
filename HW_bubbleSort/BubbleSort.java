package HW_bubbleSort;

public class BubbleSort {

    static void bubbleSort(int arr[]) {
        int arrLen = arr.length;
        int temp = 0;
        for(int i=0; i < arrLen; i++) {
            for(int j=1; j < arrLen; j++) {
                if(arr[j-1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }

    public static void main(String[] args) {

        int arr[] ={3,60,35,2,45,320,5};

        System.out.println("Array before Bubble Sort");

        for(int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();

        bubbleSort(arr); //sorting array elements using bubble sort

        System.out.println("Array after Bubble Sort");

        for(int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}