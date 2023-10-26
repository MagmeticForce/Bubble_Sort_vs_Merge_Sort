import java.util.ArrayList;

public class Bubble_Sort extends Sort {
    //1-argument definition of "bubble_sort". Now you can just specify an array whenever you call bubble_sort
    public void bubble_sort (ArrayList<Integer> array_argument) {
        //goes to the 3-argument definition of "bubble_sort"
        bubble_sort (array_argument, 0, array_argument.size());
    }

    //3-argument definition of bubble_sort
    public void bubble_sort (ArrayList<Integer> array_list_argument, int start_argument, int end_argument) {
        
        //Terminating condition. Ends the recursive loop if the first index is the last index
        if (end_argument - start_argument <= 1) {return;}
        
        //move the biggest number to the end
        for (int a = start_argument; a < end_argument - 1; a++) {//"- 1" because if you focus on the last index, there is no index to the right of it
            if (array_list_argument.get(a) > array_list_argument.get(a+1)) {
                swap (array_list_argument, a, a+1);
            }
        }

        //Loop the instructions above, except on each iteration, make the last index 1 smaller than in the previous iteration
        bubble_sort(array_list_argument, start_argument, end_argument - 1);
    }
}
