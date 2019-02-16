/*
Autores:    Mario Perdomo 18029
            Josue Sagastume 18173

Fecha: 11 de febrero de 2019
Proposito: Esta clase es la interfaz de List, y es generica
porque no se sabe con que tipo de dato se trabajara. La clase
StackArrayList hereda sus metodos de esta interfaz.
 */
public DoublyLinkedList<E> extends AbstractList<E> implements List<E>{
    protected int count;
    protected DoublyLinkedNode<E> head;
    protected DoublyLinkedNode<E> tail;

    public DoublyLinkedList(){
            // post: constructs an empty list
            head=null;
            tail=null;
            count=0;
            }


    public void addFirst(E value){
            // pre: value is not null
            // post: adds element to head of list

            // construct a new element, making it head
            head=new DoublyLinkedNode<E>(value,head,null);
            // fix tail, if necessary
            if(tail==null)tail=head;
            count++;
            }


    public void addLast(E value){
            // pre: value is not null
            // post: adds new value to tail of list
            // construct new element
            tail=new DoublyLinkedNode<E>(value,null,tail);
            // fix up head
            if(head==null)head=tail;
            count++;
            }


    public E removeLast(){
            // pre: list is not empty
            // post: removes value from tail of list
            DoublyLinkedNode<E> temp=tail;
            tail=tail.previous();
            if(tail==null){
            head=null;
            }else{
            tail.setNext(null);}
            count--;
            return temp.value();
            }
}