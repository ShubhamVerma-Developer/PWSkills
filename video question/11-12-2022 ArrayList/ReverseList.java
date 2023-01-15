import java.util.*;
import java.util.Collections;
public class ReverseList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);

        System.out.println("original list : "+list);
        Collections.reverse(list);
        //reverseList(list);
        System.out.println("Reverse list : "+list);

        //sort the list into Asceding order
        Collections.sort(list);
        System.out.println("sorted list: "+ list);
        
       //sort the list into Descending order
       Collections.sort(list, Collections.reverseOrder());
       System.out.println("sort list into descending ordrer : "+list);


       ArrayList<String> l1 = new ArrayList<>();
       l1.add("Welcome");
       l1.add("To");
       l1.add("Physics");
       l1.add("wallah");
       System.out.println("Original List : "+l1);
       Collections.sort(l1);
       System.out.println("sorted list : "+l1);

        

    }


    static void reverseList(ArrayList<Integer> list){
        int i = 0, j = list.size()-1;

        while(i < j){
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }
    
}

