import java.util.ArrayList;

public class MyMain {

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) { 
        int count = 0;

        // every num in list
        for (int i = 0; i < list.size(); i++) { 
            if (list.get(i) % 2 == 1 || list.get(i) % 2 == -1) { 
                count += 1;
            }
        }
        return count;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) { 

        // every num in list1
        for (int i = 0; i < list1.size(); i++) { 
            int first_num = list1.get(i);

            // every num in list2
            for (int j = 0; j < list2.size(); j++) { 

                // if any num in list2 equals to i
                if (list2.get(j) == first_num) { 
                    return true;
                }
            }
        }
        return false;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    public static ArrayList<Integer> convertToArrayList(int[] arr) { 

        // Create a new ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            list.add(num);
        }

        return list;
    }


    public static void main(String[] args) {
        // Create some arraylists and arrays
        ArrayList<Integer> lst1 = new ArrayList<Integer>();
        lst1.add(1);
        lst1.add(4);
        lst1.add(5);

        ArrayList<Integer> lst2 = new ArrayList<Integer>();
        lst2.add(69);
        lst2.add(24);

        ArrayList<Integer> lst3 = new ArrayList<Integer>();
        lst3.add(11);
        lst3.add(4);

        int[] arr1 = {12, 24, 9};

        // Check our methods
        System.out.println(countOdd(lst1));
        System.out.println(checkDuplicates(lst1, lst2));
        System.out.println(checkDuplicates(lst1, lst3));
        System.out.println(convertToArrayList(arr1));

    }
}
