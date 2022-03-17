public class Q1<E> {
       // A method that rotate elements of the queue based array.
    public E[] data;
    private int sz = 0;
    public int f = 0;
    private static int capacity = 100;
    Q1(int c){
        data = (E[]) new Object[c];
    }
    Q1(){
        this(capacity);
    }
    public  int size(){return sz;}
    public boolean isEmpty(){return sz==0;}
    public void enqueue (E e) throws IllegalStateException{
        if(sz == data.length) throw new IllegalStateException("Queue is full");
        int avail = (f+sz) % data.length;
        data[avail] = e;
        sz++;
    }
    public E dequeue(){
        if (isEmpty())
              return null;
        E deleted = data[f];
        data[f] = null;
        f = (f+1)% data.length;
        sz--;
        return deleted;
    }
    public E first(){
        if (isEmpty())
            return null;
        return data[f];
    }
    //The answer of Q1 rotate method starts here...

    public void rotate(){
        E tepm = data[0];
        for (int i = 0; i <data.length-1; i++) {
            data[i] = data[i+1];
            data[data.length-1] = tepm;
        }
    }

    void print(){
        if (sz==0)
            System.out.println("Queue is Empty");
        else
        {
            System.out.print("[ ");
            for (int i = 0; i < data.length; i++) {
            if (data[i]!= null)
                System.out.print(data[i]+" ");
            }
            System.out.println("]");
        }
    }









}
