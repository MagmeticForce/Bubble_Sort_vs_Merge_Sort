import java.util.ArrayList;

public class Merge_Sort extends Sort {
    //1-argument definition of "bubble_sort". Now you can just specify an array whenever you call bubble_sort
    public void merge_sort (ArrayList<Integer> array_argument) {
        //goes to the 3-argument definition of "bubble_sort"
        merge_sort (array_argument, 0, array_argument.size());
    }

    //3-argument definition of bubble_sort
    public void merge_sort (ArrayList<Integer> array_list_argument, int start_argument, int end_argument) {
        if (end_argument - start_argument <= 1) {return;} //Terminating coondition. If 1 element is left, you're done
        int middle = (start_argument + end_argument) / 2; //determine the middle of the array
        merge_sort (array_list_argument, start_argument, middle); //sort the left half of array
        merge_sort (array_list_argument, middle, end_argument); //sort the right half of array
        merge (array_list_argument, start_argument, middle, end_argument);

        //Terminating condition. Ends the recursive loop if the first index is the last index
        if (end_argument - start_argument <= 1) {return;}
        
        //move the biggest number to the end
        for (int a = start_argument; a < end_argument - 1; a++) {//"- 1" because if you focus on the last index, there is no index to the right of it
            if (array_list_argument.get(a) > array_list_argument.get(a+1)) {
                swap (array_list_argument, a, a+1);
            }
        }
    }

    public void merge (ArrayList<Integer>array_list_argument, int start_argument, int middle_argument, int end_argument) {
        int i = start_argument, j = middle_argument, k = 0;
        ArrayList<Integer> merged_array_list = new ArrayList<>();
        while (i < middle_argument && j < end_argument) {
            if (array_list_argument.get(i) <= array_list_argument.get(j)) {
                merged_array_list.add (k, array_list_argument.get(i));
                //merged_array_list.remove(k+1);
                k++;
                i++;
            }
            else {
                merged_array_list.add (k, array_list_argument.get(j));
                //merged_array_list.remove(k+1);
                k++;
                j++;
            }
        }

        while (i < middle_argument) {
            merged_array_list.add (k, array_list_argument.get(i));
            //merged_array_list.remove(k+1);
            k++;
            i++;   
        }
        while (j < end_argument) {
            merged_array_list.add (k, array_list_argument.get(j));
            //merged_array_list.remove(k+1);
            k++;
            j++;
        }

        //ovewrite original array
        for (i = start_argument; i < end_argument; i++) {
            array_list_argument.add (i, merged_array_list.get(i-start_argument));
            array_list_argument.remove(i+1);
        }

    }
}
