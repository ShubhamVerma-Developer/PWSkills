import java.util.ArrayList;
public class ArrayList1 {
    public static void main(String[] args) {
      

       ArrayList<Integer> l1 = new ArrayList<Integer>();
       
       //add new element 
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        //printing the arraylist directly 
        System.out.println(l1);   

        l1.add(1,100);
        System.out.println(l1);            
            
        //modify element at index i
        l1.set(1,10);
        System.out.println(l1);

        //remove an element at index i
        l1.remove(1);
        System.out.println(l1);

        //removing if an element exist
        System.out.println(l1.remove(Integer.valueOf(7)));
        
        System.out.println(l1);

        //checking if an element exists 
        boolean ans = l1.contains(5);
        System.out.println(ans);


        //if you don't specify class, you can put anything inside 
        ArrayList l = new ArrayList();
        l.add("pgres");
        l.add(1);
        l.add(true);
        System.out.println(l);





    }
}
