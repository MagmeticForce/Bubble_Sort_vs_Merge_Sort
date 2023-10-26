import java.util.Arrays;
import java.util.Random;
import java.io.IOException;
import java.util.ArrayList;



public class Bubble_Sort_vs_Merge_Sort {

    public static void main (String[] args) throws Exception {
        ArrayList<Integer> array_list_to_sort = new ArrayList<>();
        Bubble_Sort bubble_sort_object = new Bubble_Sort();
        Merge_Sort merge_sort_object = new Merge_Sort();
        //array_list_to_sort = bubble_sort_object.create_a_random_array_list(5000);
        array_list_to_sort = merge_sort_object.create_a_random_array_list(5000);

        
        //bubble sort
        long start_time = System.currentTimeMillis();
        System.out.println("Sorting a list of 5000 numbers using bubble sort. Please wait...");
        bubble_sort_object.bubble_sort (array_list_to_sort);
        long end_time = System.currentTimeMillis();
        float total_time = (end_time - start_time) / 1000;
        System.out.println("Time it took to bubble sort a list of 5000 numbers: " + total_time + " seconds.");
        

        //merge sort
        ArrayList<Integer> array_list_to_sort_2 = new ArrayList<>();
        array_list_to_sort_2 = merge_sort_object.create_a_random_array_list(5000);
        //total_time = 0;
        start_time = System.currentTimeMillis();
        System.out.println("Sorting a list of 5000 numbers using merge sort. Please wait...");
        merge_sort_object.merge_sort (array_list_to_sort_2);
        end_time = System.currentTimeMillis();
        total_time = (end_time - start_time) / 1000;
        System.out.println("Time it took to merge sort a list of 5000 numbers: " + total_time + " seconds.");

    }
}

    
        /*
        System.out.println("Random unsorted list of numbers:");
        //print contents of random array
        for (int a = 0; a < array_list_to_sort.size(); a++) {
            System.out.println(array_list_to_sort.get(a));
        }
        
        merge_sort_object.merge_sort(array_list_to_sort);
        
        System.out.println("-----------------------------------------------------");
        System.out.println("Sorted list of numbers using bubble sort:");
        //print contents of random array
        for (int a = 0; a < array_list_to_sort.size(); a++) {
            System.out.println(array_list_to_sort.get(a));
        }
        */

    /*
    System.out.println("Random unsorted list of numbers:");
    //print contents of random array
    for (int a = 0; a < array_list_to_sort.size(); a++) {
        System.out.println(array_list_to_sort.get(a));
    }
    */

    /*
    System.out.println("-----------------------------------------------------");
    System.out.println("Sorted list of numbers using bubble sort:");
    //print contents of random array
    for (int a = 0; a < array_list_to_sort.size(); a++) {
        System.out.println(array_list_to_sort.get(a));
    }
    */