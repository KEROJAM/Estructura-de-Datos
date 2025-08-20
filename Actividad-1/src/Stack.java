public class Stack<E> {
    public static final int CAPACITY = 1000;
    private E[] data;
    private int size=0;
    public Stack(){
        this.data = (E[])new Object[this.CAPACITY];
    }

    public boolean isEmpty(){
        return (this.size == 0);
    }

    public int size(){
        return (this.size);
    }

    public void push(E value){
        this.data[this.size] = value;
        this.size++;
    }

    public E pop() throws Exception{
        E result = null;
        if (this.isEmpty()){
            throw new Exception("La Pila esta Vacia");
        }
        this.size--;
        result = this.data[this.size];
        this.data[this.size] = null;
        return result;
    }

    public E peek() throws Exception{
        E result = null;
        if (this.isEmpty()){
            throw new Exception("La Pila esta vacia");
        }
        result = this.data[0];
        return result;
    }
}
