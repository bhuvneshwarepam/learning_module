package main.java.Day3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Task1_SumOfLinkedLists {

    /*
    Given 2 numbers as list, add the numbers and store the result in a new list.
        Input is:   2->3->5->7->NULL
                    8->2->7->NULL
        Output:     3->1->8->4->NULL
     */
    
    List<Integer> sumOfLists(List<Integer> fList, List<Integer> sList) {
        List<Integer> sumList= new LinkedList<>();
        int fSize= fList.size();
        int sSize= sList.size();
        int carry=0;

        while(fSize>0 || sSize>0) {
            int sum = carry;
            if (fSize>0) {
                sum = sum + fList.get(--fSize);
            }
            if(sSize>0) {
                sum = sum + sList.get(--sSize);
            }
            carry = getCarryAndAppendToList(sumList, sum);
        }
        Collections.reverse(sumList);
        return sumList;
    }

    int getCarryAndAppendToList(List<Integer> sumList, int sum) {
        int carry;
        carry=sum/10;
        sumList.add(sum%10);
        return carry;
    }

    void printList(List<Integer> list) {
        for (Integer e: list) {
            System.out.print(e + " ");
        }
    }

    public static void main(String[] args) {
        Task1_SumOfLinkedLists linkedList = new Task1_SumOfLinkedLists();

        List<Integer> fList = new LinkedList<>();
        fList.add(2);
        fList.add(3);
        fList.add(5);
        fList.add(7);
        System.out.print("\n First List : ");
        linkedList.printList(fList);

        List<Integer> sList = new LinkedList<>();
        sList.add(8);
        sList.add(2);
        sList.add(7);
        System.out.print("\n Second List : ");
        linkedList.printList(sList);

        List<Integer> sumList = linkedList.sumOfLists(fList, sList);
        System.out.print("\n Output List : ");
        linkedList.printList(sumList);
    }
}
