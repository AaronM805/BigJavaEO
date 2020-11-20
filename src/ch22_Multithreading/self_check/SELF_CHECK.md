# Ch 22 Self Check Questions

1. What happens if you change the call to the `sleep` method in the `run` method to `Thread.sleep(1)`?
   
##  ANSWER
   
   If you change the call to the **sleep** method in the **run** method to **Thread.sleep(1)**, the thread would only sleep for 1 millisecond. Since it is only 1 ms, the printouts would happen instantly.   

2. What would be the result of the program if the **main** method called
```java
r1.run();
r2.run();
```
   instead of starting threads?   

   the **r1** instance would execute it's code and it will exit the **run** method after it was done, and then the **r2** instance would execute. The methods would be called in sequence.   

3. Suppose a web browser uses multiple threads to load the images on a web page. Why should these threads be terminated when the user hits the “Back” button?



4. Consider the following runnable.
```java
public class MyRunnable implements Runnable {
    public void run() {
        try {
            System.out.println(1); Thread.sleep(1000); System.out.println(2);
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
Thread t = new Thread(new MyRunnable()); t.start();
t.interrupt();
```
What output is produced?