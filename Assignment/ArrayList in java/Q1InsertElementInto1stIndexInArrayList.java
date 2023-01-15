/*Q1. Write a Java program to insert an element into given array list of size n at the first position.
Input1:
n = 5
list = {1,2,3,4,5}
x = 0
Output1:
0 1 2 3 4 5

Input2:
n = 1
list = {4}
x = 7
Output2":
7 4 */

import java.util.*;
public class Q1InsertElementInto1stIndexInArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter the size of the List : ");
        int n = sc.nextInt();
        System.out.println("Enter the "+n+" element");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.print("Enter the element which is insert into the first position : ");
        int x = sc.nextInt();
        //insert the new element in the first position 
        list.add(0, x);

        System.out.println(list);
    }
}
