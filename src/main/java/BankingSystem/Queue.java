package BankingSystem;
public class Queue
{
    int front, rear;
    int size, max,item;
    int[] array = new int[size];
    Queue()                                        //created constructor
    {
        max=0;
        rear = 0;
        front = 0;
        size = 0;
    }
    public boolean isFull(Queue queue)              //Method to checking queue is full or not
    {
        if(size==max)
        {
            return true;
        }
        return false;
    }
    public boolean isEmpty(Queue queue)             //Method to checking queue is empty or not
    {
        if(queue.size==0)
        {
            return true;
        }
        return false;
    }
    public void enqueue(int item)                   //Method to add the element at last in queue
    {
        if (isFull(this))
        {
            return;
        }
        else
        {
            array[rear] = item;
            rear = rear + 1;
            size++;
        }
    }
    public int dequeue()                            //Method to delete the element from front
    {
        if (isEmpty(this))
        {
            return 0;
        }
        else
        {
            item = array[front];
            front = front + 1;
            size--;
            return item;
        }
    }
    public void display()                           //Method to displaying queue
    {
        while (front != rear)
        {
            System.out.println(array[front]);
            front = front + 1;
        }
    }
}
