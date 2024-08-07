# Chapter 9 Self Check Questions

**1. Consider classes Manager and Employee. Which should be the superclass and which should be the subclass?**

   Manager should be the subclass and Employee should be the superclass. A manager is a type of employee.

**2. What are the inheritance relationships between classes BankAccount, Checking­ Account, and SavingsAccount?**

   CheckingAccount and SavingsAccount are subclasses of superclass BankAccount. These are two types of bank accounts.  

3. What are all the superclasses of the JFrame class? Consult the Java API documen- tation or Appendix D.

   The superclasses of the JFrame class are: Frame, Window, Container, Component, Object

4. Consider the method doSomething(Car c). List all vehicle classes from Figure 1 whose objects cannot be passed to this method.

   The following vehicle classes are not able to pass in to doSomething(Car c): Motorcycle, Truck

5. Should a class Quiz inherit from the class Question? Why or why not?

   The class Quiz should not inherit from the class Question becaue a quiz consists of one ore more questions. The class Quiz can use the class Question.

6. Suppose q is an object of the class Question and cq an object of the class Choice­ Question. Which of the following calls are legal?  
  a. q.setAnswer(response) - **illegal**   
  b. cq.setAnswer(response) - **legal**   
  c. q.addChoice(choice, true) - **illegal**  
  d. cq.addChoice(choice, true) - **legal**   
7. Suppose the class Employee is declared as follows:
```java
public class Employee {
  private String name; private double baseSalary;
  public void setName(String newName) { . . . }
  public void setBaseSalary(double newSalary) { . . . } public String getName() { . . . }
  public double getSalary() { . . . }
}
```
   Declare a class Manager that inherits from the class Employee and adds an instance variable bonus for storing a salary bonus. Omit constructors and methods.   

```java
public class Manager extends Employee {
  private double salaryBonus;
}
```

8. Which instance variables does the Manager class from Self Check 7 have?  

   The ***Manager*** class only has the ***salaryBonus*** instance variable. ***name*** and ***baseSalary*** belong to the ***Employee*** class.   

9. In the Manager class, provide the method header (but not the implementation) for a method that overrides the getSalary method from the class Employee.  

```java
public class Manager extends Employee {
  private double salaryBonus;

  @Override
  public double getSalary() { . . . }
}
```

10. Which methods does the Manager class from Self Check 9 inherit?

   The **Manager** class inherits the following methods: ***setName***, ***setBaseSalary***   