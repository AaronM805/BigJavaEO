# Chapter 10 Self Check Questions

1. Suppose you want to use the **average** method to find the average salary of an array of **Employee** objects. What condition must the **Employee** class fulfill?

   If you want to use the **Data**'s **average** method to find the average salary of an array of **Employee** objects, the **Employee** class must implement the **Measurable** class and implement its **getMeasure** method.   

2. Why can’t the **average** method have a parameter variable of type **Object[]**?

   The **average** method can't have a parameter variable of type **Object[]** because the **Object** class doesn't know about the **getMeasure** method.   

3. Why can’t you use the **average** method to find the average length of **String** objects?

   I can't use the **average** method to find the average length of **String** objects because the **String** class doesn't implement the **Measurable** interface, and the **average** method only takes in parameters of type **Measurable**.   

4. What is wrong with this code?
```java
Measurable meas = new Measurable();
System.out.println(meas.getMeasure());
```

   We are instantiating a **Measurble** instance from a Measurable interface, and this is not allowed. We must use the class that implements the **Measurable** interface to properly instantiate it.

5. What is wrong with this code?
```java
Measurable meas = new Country("Uruguay", 176220);
System.out.println(meas.getName());
```

   **Measurable** doesn't know anything about the methods that **Country** has, so this would throw an error. We can only call methods that the **Measurable** interface has defined.   

6. Can you use a cast (**BankAccount**) meas to convert a Measurable variable meas to a BankAccount reference?
7. If both **BankAccount** and **Country** implement the **Measurable** interface, can a **Country** reference be converted to a **BankAccount** reference?
8. Why is it impossible to construct a **Measurable** object?
9. Why can you nevertheless declare a variable whose type is **Measurable**?
10. What does this code fragment print? Why is this an example of polymorphism?
```java
Measurable[] data = { new BankAccount(10000),
                      new Country("Belgium", 30510) };
System.out.println(average(data));
```