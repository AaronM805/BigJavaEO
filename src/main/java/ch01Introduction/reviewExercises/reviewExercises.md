**• R1.1 Explain the difference between using a computer program and programming a computer.**

The difference between using a computer program and programming a computer is that when using a computer  

- you are using something that has already been programmed and tested
- you are not able to modify the program
- the program is the final product of the software development lifecycle

When programming a computer

- you have much more control on what the program should do
- you are most likely working on a program that is not ready to go to production.
---
**• R1.2 Which parts of a computer can store program code? Which can store user data?**

Programming code is usually stored in permanent memory. If the program is being used, then the data  
is most likely stored in RAM.
---
**• R1.3 Which parts of a computer serve to give information to the user? Which parts take
user input?**

Providing user information:

- monitor
- printer
- audio components

Take in user input:

- keyboard
- mouse
- computer camera
---
**•• R1.4 A toaster is a single-function device, but a computer can be programmed to carry out different tasks. Is  
your cell phone a single-function device, or is it a programmable computer? (Your answer will depend on your cell  
phone model.)**

My cell phone is a programmable computer. However, it is only programmable by the manufacturer, and it cannot be  
modified, unless it is jail broken.
---
**•• R1.5 Explain two benefits of using Java over machine code.**

- With Java, the code is written once, but can be deployed to different types of machines
- Java is a high-level language, which means it is easier to write than machine code

---
**•• R1.6 On your own computer or on a lab computer, find the exact location (folder or
directory name) of**
- **The sample file HelloPrinter.java, which you wrote with the editor.**  
  `~/Development/git/BigJavaEO/src/main/java`
- **The Java program launcher java.exe or java.**  
`/usr/bin/java`
- **The library file rt.jar that contains the run-time library.**  
`/Library/Java/JavaVirtualMachines/adoptopenjdk-11.jdk/Contents/Home/lib`
---
**•• R1.7 What does this program print?**
```java
public class Test {
  public static void main(String[] args) {
    System.out.println("39 + 3");
    System.out.println(39 + 3);
  }
}
```
39 + 3  
42
---
**•• R1.8 What does this program print? Pay close attention to spaces.**
```java
public class Test {
    public static void main(String[] args) {
      System.out.print("Hello");
      System.out.println("World");
    }
}
```
HelloWorld

---
**•• R1.9 What is the compile-time error in this program?**
```java
public class Test {
    public static void main(String[] args) {
      System.out.println("Hello", "World!");
    }
}
```
I think that the output would be a method error. An error stating that the method only takes 1 parameter

**actual output `Cannot resolve method println(String, String)`** 

---
**•• R1.10 Write three versions of the HelloPrinter.java program that have different compile-
time errors. Write a version that has a run-time error.**

---
**• R1.11 How do you discover syntax errors? How do you discover logic errors?**

Syntax errors will happen at the point of writing a program. The IDE will catch those errors and report the issue. The  
application will not be able to be executed.

Logic errors occur when the application is executing, and an unexpected behavior occurs.

---
**••• R1.12 The cafeteria offers a discount card for sale that entitles you, during a certain period,
to a free meal whenever you have bought a given number of meals at the regular
price. The exact details of the offer change from time to time. Describe an algorithm
that lets you determine whether a particular offer is a good buy. What other inputs
do you need?**

---
**•• R1.13 Write an algorithm to settle the following question: A bank account starts out with
$10,000. Interest is compounded monthly at 6 percent per year (0.5 percent per
month). Every month, $500 is withdrawn to meet college expenses. After how many
years is the account depleted?**

---
**••• R1.14 Consider the question in Exercise •• R1.13. Suppose the numbers ($10,000, 6
percent, $500) were user selectable. Are there values for which the algorithm you
developed would not terminate? If so, change the algorithm to make sure it always
terminates.**
---
**••• R1.15 In order to estimate the cost of painting a house, a painter needs to know the surface
area of the exterior. Develop an algorithm for computing that value. Your inputs are
the width, length, and height of the house, the number of windows and doors, and
their dimensions. (Assume the windows and doors have a uniform size.)**
---
**•• R1.16 In How To 1.1, you made assumptions about the price of gas and annual usage to
compare cars. Ideally, you would like to know which car is the better deal without
making these assumptions. Why can’t a computer program solve that problem?**

---
**•• R1.17 Suppose you put your younger brother in charge of backing up your work. Write a
set of detailed instructions for carrying out his task. Explain how often he should do
it, and what files he needs to copy from which folder to which location. Explain how
he should verify that the backup was carried out correctly.**
---
**• R1.18 Write pseudocode for an algorithm that describes how to prepare Sunday breakfast
in your household.**
---
**•• R1.19 The ancient Babylonians had an algorithm for determining the square root of a num-
ber a. Start with an initial guess of a/2. Then find the average of your guess g and a/g. That’s your next guess. Repeat until two consecutive guesses are close enough. Write
pseudocode for this algorithm.**