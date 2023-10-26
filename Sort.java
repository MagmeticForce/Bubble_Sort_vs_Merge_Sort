import java.util.ArrayList;
import java.util.Random;

public class Sort {
    public ArrayList<Integer> create_a_random_array_list (int length_argument) {
        ArrayList<Integer> random_array_list = new ArrayList<>();
        Random random_object = new Random(length_argument);

        //give each array index a random number between 0 and 100
        for (int a = 0; a < length_argument; a++) {
            random_array_list.add(a, random_object.nextInt(0, 100));
        }

        return random_array_list;
    }
    
    public static void swap (ArrayList<Integer> array_list_argument, int index_argument1, int index_argument2) {
        int temp = array_list_argument.get(index_argument1); //stores value at index_argument1 into "temp"
        //System.out.println("Temp is: " + temp);
        array_list_argument.add(index_argument1, array_list_argument.get(index_argument2)); //puts value at index_argument2 into index_argument1
        //System.out.println("Index 0 is: " + array_list_argument.get(index_argument1));
        array_list_argument.add(index_argument2, temp); //puts "temp" value into index_argument2
        //System.out.println("Index 1 is: " + array_list_argument.get(index_argument2));
        
        //remove the old, unswapped values
        if (index_argument1 <= index_argument2) {
            array_list_argument.remove(index_argument2 + 1);
            array_list_argument.remove(index_argument2 + 1);
        }
        else {
            array_list_argument.remove(index_argument1 + 1);
            array_list_argument.remove(index_argument1 + 1);
        }

    }

    public static boolean is_sorted (ArrayList<Integer> array_argument) {
        for (int a = 0; a < array_argument.size() - 1; a++) { //"- 1" because last index does not have an index to the rigth of it
            if (array_argument.get(a) > array_argument.get(a+1)) {
                return false;
            }
        }
        return true;
    }
}
