# Chapter 9 Self Check Questions

1. Consider classes Manager and Employee. Which should be the superclass and which should be the subclass?
2. What are the inheritance relationships between classes BankAccount, Checking­ Account, and SavingsAccount?
3. What are all the superclasses of the JFrame class? Consult the Java API documen- tation or Appendix D.
4. Consider the method doSomething(Car c). List all vehicle classes from Figure 1 whose objects cannot be passed to this method.
5. Should a class Quiz inherit from the class Question? Why or why not?
6. Suppose q is an object of the class Question and cq an object of the class Choice­ Question. Which of the following calls are legal?  
  a. q.setAnswer(response)  
  b. cq.setAnswer(response)  
  c. q.addChoice(choice, true)  
  d. cq.addChoice(choice, true)  
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
8. Which instance variables does the Manager class from Self Check 7 have?  
9. In the Manager class, provide the method header (but not the implementation) for a method that overrides the getSalary method from the class Employee.  
10. Which methods does the Manager class from Self Check 9 inherit?