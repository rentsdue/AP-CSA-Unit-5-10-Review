import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Unit 9: Inheritance tests
        //Creating object classes and an arraylist of performers
        Musician pitbull= new Musician();
        Performer max= new Performer("MaximilianMus", 80);
        Performer powell= new Dancer(); //This shows that a parent class object can be created with a child class constructor (the reverse can't happen)
        Rapper kanye= new Rapper();
        ArrayList<Performer> performerList= new ArrayList<Performer>(); //Arraylist of performers
        performerList.add(pitbull);
        performerList.add(max);
        performerList.add(powell);
        performerList.add(kanye);

        //Creating variables
        // String nameP= pitbull.getName();
        // int ageP= pitbull.getAge();

        // //Testing methods
        // System.out.println(nameP + " " + ageP);
        // max.perform(); //Demonstrates polymorphism 
        // pitbull.perform();
        // powell.perform();
        // kanye.perform();

        //Unit 10: Recursion
        System.out.println(equation(7));
        int[] testArray= {69, 24, 55, 6690, 2094, 490};
        mergeSort(testArray, 0, 5);
        for (int num: testArray) {
            System.out.println(num);
        }
    }

    public static int equation(int a) {
        if (a <= 5) {
            return 12;
        }
        return equation(a-2)*equation(a-1);
    }

    public static void mergeSort(int[] array, int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            mergeSort(array, low, middle); // Sort left half
            mergeSort(array, middle + 1, high); // Sort right half
            merge(array, low, middle, high); // Merge them
        }
    }

    private static void merge(int[] array, int low, int middle, int high) {
        int[] helper = new int[array.length];
        // Copy both halves into a helper array
        for (int i = low; i <= high; i++) {
            helper[i] = array[i];
        }

        int helperLeft = low;
        int helperRight = middle + 1;
        int current = low;

        // Iterate through helper array. Compare the left and right
        // half, copying back the smaller element from the two halves
        // into the original array.
        while (helperLeft <= middle && helperRight <= high) {
            if (helper[helperLeft] <= helper[helperRight]) {
                array[current] = helper[helperLeft];
                helperLeft++;
            } else {
                array[current] = helper[helperRight];
                helperRight++;
            }
            current++;
        }

        // Copy the rest of the left side of the array into the target array
        int remaining = middle - helperLeft;
        for (int i = 0; i <= remaining; i++) {
            array[current + i] = helper[helperLeft + i];
        }
    }
}
