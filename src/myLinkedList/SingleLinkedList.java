/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package myLinkedList;

/**
 *
 * @author j0ni
 */
public class SingleLinkedList {

    private Node head;

    public SingleLinkedList(){
        head=null;
    }

    private Node createNode(int data){
        return new Node(data);
    }

    public void addForwd(int data){
        Node nd=createNode(data);
        Node tmp;
        if(nd==null)
            head=nd;
        else{
            tmp=head;
            while(tmp!=null){
                tmp=tmp.next;
                tmp=nd;

            }
        }
    }

    public void addBacwd(int data){
        Node nd=createNode(data);
        nd.next = head;
        head = nd;
    }

    public void rmForwd(){
        Node tmp=head;
        while(head.next!=null){
                head=head.next;
            }
        head=null;
        head=tmp;
    }

    public void rmBacwd(int data){
         Node tmp=head;
        if(head==null)
            return;
        else{
             head=tmp.next;
             tmp=null;
        }
    }

    public Node findNum(int data){
        Node d=head;
        while(d.next!=null){
            if(data==d.data)
                return d;
        }

        return head; //null
    }

    public void rmNum(int data){

        Node previousNode,index=head,nextNode;
        if(!isNull()){
            previousNode=head;
        while(index.next!=null){
            //Node last
            if(data==index.data){
                nextNode=index.next;
                previousNode.next=nextNode;
                index=null;
                }
            }

        }
        else
            System.out.println("is empty");
    }

    public void addSorted(){

    }

    public void print(){
        Node d=head;
        while(d.next!=null){
            System.out.println(d.data);

        }
    }

    public String toString(){
        String s="[";
        Node p=head;
        while(p!=null){
            s+=p.data+", ";
            p=p.next;
        }
        s+="]";
        return s;
    }

    private boolean isNull() {
        return head==null;
    }

}
