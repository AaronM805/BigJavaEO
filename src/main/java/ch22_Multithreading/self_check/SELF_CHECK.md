# Ch 22 Self Check Questions

1. What happens if you change the call to the `sleep` method in the `run` method to `Thread.sleep(1)`?
   
   **ANSWER**
   
   If you change the call to the `sleep` method in the `run` method to `Thread.sleep(1)`, the thread would only sleep for 1 millisecond. Since it is only 1 ms, the printouts would happen instantly.   

2. What would be the result of the program if the `main` method called
```java
r1.run();
r2.run();
```

  instead of starting threads?  

   the `r1` instance would execute it's code and it will exit the `run` method after it was done, and then the `r2` instance would execute. The methods would be called in sequence.   

3. Suppose a web browser uses multiple threads to load the images on a web page. Why should these threads be terminated when the user hits the “Back” button?

   The threads should be terminated when the user hits the "Back" button because the threads don't need to download the images for that specific page anymore.   

4. Consider the following runnable.
```java
public class MyRunnable implements Runnable {
    public void run() {
        try {
            System.out.println(1);
            Thread.sleep(1000);
            System.out.println(2);
        }
        catch (InterruptedException exception) {
            System.out.println(3);
        }
        System.out.println(4);
    }
}
```
Suppose a thread with this runnable is started and immediately interrupted:
```java
Thread t = new Thread(new MyRunnable());
t.start();
t.interrupt();
```
What output is produced?   

   1 -> 3 -> 4   

5. Give a scenario in which a race condition causes the bank balance to be –100 after one iteration of a `deposit` thread and a `withdraw` thread.

   A scenario where a race condition causes the bank balance to be -100 after one iteration would be if we call the `withdraw` thread before the `deposit` thread.   

6. Suppose two threads simultaneously insert objects into a linked list. Using the implementation in Chapter 16, explain how the list can be damaged in the process.

      If two threads simultaneously insert objects into a linked list, the list can be damaged in that the next element is not guaranteed to be in the sequence that the two threads inserted the object. Also, one object may be missing from the linked list.   

7. If you construct two BankAccount objects, how many lock objects are created?

      Only one lock object is created, since only one thread at at ime can execute eitehr method on a given object.   

8. What happens if we omit the call unlock at the end of the deposit method?

   If we omit the call unlock at the end of the `deposit` method, the thread will still lock this method indefinitely and no other method will have access to it.   