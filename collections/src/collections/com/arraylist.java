package collections.com;
import java.util.*;
public class arraylist {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int[] arr={1,3,4,5,6,7,9};

        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<7;i++){
            ls.add(arr[i]);
        }
        ls.add(7,40);//add the value at the index of 7
        System.out.println(ls);// print the entire list
        System.out.println(ls.get(1));//return the value at the index of 1
       // System.out.print(ls.add(8,40));
        System.out.println(ls.contains(90));//return as ture or false if the value exists in the list
        System.out.println(ls.set(2,50));//set the value at the index of 2 as 50 and return the old value at index 2
        System.out.println(ls.size());//return the size of arraylist
        System.out.println(ls.remove(5));//remove the element in index of 5
        System.out.println(ls.indexOf(40)); //first index of 40
        ls.add(30);
        ls.add(40);
        System.out.println(ls.lastIndexOf(40));// return the lastindex  of 40

    }
}
