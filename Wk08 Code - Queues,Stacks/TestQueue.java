
public class TestQueue {
 
  public static void main(String[] args){
   Queue<String> myQueue = new Queue<String>();
   myQueue.enqueue("Test");
   myQueue.enqueue("Blah");
   myQueue.enqueue("Ama");
   System.out.println(myQueue.dequeue());
   System.out.println(myQueue.dequeue());
   System.out.println(myQueue.dequeue());
   
   // if you want to see what happens when we try to dequeue an
   // empty queue, uncomment the code below
   //System.out.println(myQueue.dequeue());
  }
}