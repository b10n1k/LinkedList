/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package myLinkedList;

/**
 *
 * @author j0ni
 */
public class Main {


    public static void main(String[] args){
        SingleLinkedList sll=new SingleLinkedList();
    sll.addForwd(2);
    sll.addForwd(3);
    sll.addForwd(4);
    //sll.addBacwd(1);
        System.out.println(sll.toString());
    }
}
