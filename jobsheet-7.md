# WORKSHEET 7 - LOOPS 1

**Student Details:**

- **Name:** Farrosyehan Muhammad Ramdhan
- **Student ID (NIM):** 264107020186
- **Class / Attendance No.:** 1I / 11

---

## 1: PRACTICAL OBJECTIVES

The objectives of the practical session in this chapter are as follows:

1. Students are able to explain the syntax for writing loop programs (for, while, and dowhile).
2. Students are able to implement loop flowcharts using the Java programming
language
---

## 2: Experimental Results & Analysis

### 2.1 Experiment 1: Student Grades Case Study in SIAKAD – FOR Loop

In the Academic Information System (SIAKAD), a lecturer enters the grades of the
Programming Fundamentals Practicum course taken by students. The lecturer wants to find
the highest and lowest quiz scores among 10 students in one class. The lecturer must enter the score of each student, and then determine and display the highest and lowest scores. 

#### 2.1.1 Java Program Code

```java

import java.util.Scanner;

public class SiakadFor11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double score, highest = 0, lowest = 100;
    
        for (int i = 1; i <= 10; i++ ) {
            System.out.print("Enter score for student " + i + ": ");
            score = sc.nextDouble();
            if (score > highest) {
                highest = score;
            }
            if (score < lowest) {
                lowest = score;
            }
        }
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest Score: " + lowest);

        sc.close();
    }
}
```

#### 2.1.2 Screenshot Output

The following shows the _output_ after the program is run:

![ Output Experiment 1](/result-1.png)

#### 2.1.3 Answers to Questions

- **Question 1:** Identify and indicate each component of the FOR loop in the program code of Experiment 1!
  - **Answer:** 

- **Question 2:** Why is the variable highest initialized to 0 and the variable lowest initialized to 100? What
happens if highest is initialized to 100 and lowest is initialized to 0?
  - **Answer:** 


- **Question 3:**  Explain the function and workflow of the following code snippet!
  ``` java
  if (score > highest) {
    highest = score;
  }
  if (score < lowest) {
    lowest = score;
  }
  ```
  - **Answer:** 
  

- **Question 4:** Modify the program to count how many students pass and how many students fail, based on the passing threshold (minimum score of 60). Display the number of students who pass and fail after displaying the highest and lowest scores!
  - **Answer:**    





---

### 2.2 Experiment 2:  Student Grades Case Study in SIAKAD – WHILE Loop

A lecturer wants to enter the scores of several students into SIAKAD in order to determine their letter grades. The program must prompt the lecturer to enter the score of each student. If the lecturer enters an invalid score (negative or greater than 100), the program must ignore the input and ask the lecturer to re-enter it. Valid scores are then classified into letter grades:
A (80 < score ≤ 100), B+ (73 < score ≤ 80), B (65 < score ≤ 73), C+ (60 < score ≤ 65), C (50 < score ≤ 60), D (39 < score ≤ 50), and E (score ≤ 39).

#### 2.2.1 Java Program Code

```java

import java.util.Scanner;

public class SiakadWhile11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int studentCount, score, i = 0;
        
        System.out.print("Enter the number of students: ");
        studentCount = sc.nextInt();

        while (i < studentCount) {
            System.out.print("Enter score for student " + (i + 1) + ": ");
            score = sc.nextInt();

            if (score < 0 || score > 100) {
                System.out.println("Invalid score. Please enter a valid score!");
                continue;
            }
            if (score > 80 && score <= 100) {
                System.out.println("The Grade of student " + (i+1) + " is A");
            } else if (score > 73 && score <= 80) {
                System.out.println("The Grade of student " + (i+1) + " is B+");
            } else if (score > 65 && score <= 73) {
                System.out.println("The Grade of student " + (i+1) + " is B");
            } else if (score > 60 && score <= 65) {
                System.out.println("The Grade of student " + (i+1) + " is C+");
            } else if (score > 50 && score <= 60) {
                System.out.println("The Grade of student " + (i+1) + " is C");
            } else if (score > 39 && score <= 50) {
                System.out.println("The Grade of student " + (i+1) + " is D");
            } else {
                System.out.println("The Grade of student " + (i+1) + " is E");
            }
            i++;
        }
        sc.close();
    }
}

```

#### 2.2.2 Screenshot Output

The following shows the _output_ after the program is run:

![Output Experiment 2](/result-2.png)

---

#### 2.2.3 Answers to Questions

- **Question 1:** In the following code snippet, determine the meaning and purpose of the following syntax:
    ```java
    if (score < 0 || score > 100) {
        System.out.println("Invalid score. Please enter a valid score");
        continue;
    }
    ```
    a. score < 0 || score > 100
    b. continue
  - **Answer:**
    
  
- **Question 2:** Why is the i++ statement written at the end of the WHILE loop? What happens if it is written at the beginning of the WHILE loop?
  - **Answer:**
    - **Explanation:** 

- **Question 3:** If the number of students entered is 19, how many times will the WHILE loop run?
  - **Answer:** 
    

- **Question 4:** Modify the program so that, if a student receives grade A, the program displays an additional message “Well done, keep up the good work!”
  - **Answer:**



### 2.3 Experiment 3: Café Transaction Case Study – DO-WHILE Loop

At a café, a cashier wants to process the transactions of several customers. A customer
may buy more than one item (coffee at Rp 12000, tea at Rp 7000, and bread at Rp 20000), and the cashier will continue to enter the purchase quantities for each customer. If a customer decides to cancel the transaction (by entering “cancel”), the cashier stops entering transactions and the program terminates.

#### 2.3.1 Java Program Code

```java

import java.util.Scanner;

public class CafeDoWhile11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String customerName;
        int coffee, tea, bread;
        int totalPrice;
        int coffeePrice = 12000;
        int teaPrice = 7000;
        int breadPrice = 20000;

        do {
            System.out.print("Enter customer name (type 'cancel' to exit): ");
            customerName = sc.nextLine();
            if (customerName.equalsIgnoreCase("cancel")) {
                System.out.println("Transaction canceled");
                break;
            }
            System.out.print("Coffee quantity: ");
            coffee = sc.nextInt();
            System.out.print("Tea quantity: ");
            tea = sc.nextInt();
            System.out.print("Bread quantity: ");
            bread = sc.nextInt();
            totalPrice = (coffee * coffeePrice) + (tea * teaPrice) + (bread * breadPrice);
            System.out.println("Total amount to pay: Rp " + totalPrice);
            sc.nextLine();
        } while (true);
        sc.close();
    }
}

```

#### 2.3.2 Screenshot Output

The following shows the _output_ after the program is run:

![Output Experiment 3](/result-3.png)


#### 2.3.3 Answers to Questions

- **Question 1:** In this DO-WHILE loop, if the first customer name entered is “cancel”, how many times is the loop executed?
  - **Answer:**
    - **Explanation:** 
  
- **Question 2:**  State the stopping condition used in this DO-WHILE loop!
  - **Answer:**
    


- **Question 3:** What is the function of using the value true in the DO-WHILE condition?
  - **Answer:** 
    

- **Question 4:** Why does this DO-WHILE loop still run even though it has no initialization and update components?
  - **Answer:**
    


## 3: INDIVIDUAL ASSIGNMENT

The following is a list of tasks to be completed in this worksheet:

- [x] **Task 1:** A cinema manager wants to create a program to calculate the total ticket sales in one day. Tickets are sold at Rp 50,000 per ticket. The program must calculate the total number of tickets sold and the total ticket sales revenue for the day, subject to the following rules.
- Rules : 
  -  If a customer buys more than 4 tickets, the customer receives a 10% discount.
  -  If a customer buys more than 10 tickets, the customer receives a 15% discount.
  -  If the ticket quantity entered is invalid (negative), the program ignores the input and asks for it to be re-entered.
  -  Loops may use for, while, or do-while. Add break or continue statements if necessary.
- [x] **Task 2:** A parking lot operator wants to create a program to calculate the total parking fees of several vehicles. The parking rate is Rp 3,000 per hour for cars and Rp 2,000 per hour for motorcycles. The program keeps asking for input as long as the input is not 0. Implement the flowchart as a Java program!


### 3.1 Implementation of Task 1 Code

```java
import java.util.Scanner;;

public class CinemaLoop11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            
        double ticketPrice = 50000;
        int totalTicketsSold = 0;
        double totalIncome = 0;
        int totalTickets;
        double discount;
        double totalBeforeDiscount;
        double totalPay;

        System.out.println("=== Cinema Ticket Sales System ===");

        do {
            System.out.print("Enter the number of tickets purchased (type 0 to exit): ");
            totalTickets = sc.nextInt();

            // Negative Input Validation
            if (totalTickets < 0) {
                System.out.println("Invalid ticket amount (cannot be negative)! Please re-enter.\n");
                continue;
            }

            // Transaction Stop
            if (totalTickets == 0) {
                break;
            }

            // Discount
            discount = 0.0;
            if (totalTickets > 10) {
                discount = 0.15;
            } else if (totalTickets > 4) {
                discount = 0.10;
            }

            // Counting Transaction
            totalBeforeDiscount = totalTickets * ticketPrice;
            totalPay = totalBeforeDiscount - (totalBeforeDiscount * discount);

            // Total Acumulation
            totalTicketsSold += totalTickets;
            totalIncome += totalPay;

            System.out.printf("Transaction successful! Total payment: Rp%.0f (Discount: %.0f%%)\n\n", totalPay, discount * 100);

        } while (true);

        System.out.println("\n=== DAILY RECAPITULATION REPORT ===");
        System.out.println("Total Tickets Sold     : " + totalTicketsSold + " Tickets");
        System.out.printf("Total Daily Income      : Rp.%.0f\n", totalIncome);

        sc.close();

        }
    }

```

### 3.2 Implementation of Task 2 Code

```java
import java.util.Scanner;;

public class ParkingLot11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int type;
        int duration;
        int total = 0;

        do {
            System.out.print("Enter Vehicle Type (type '0' to exit): ");
            type = sc.nextInt();
            if (type == 1 || type == 2) {
                System.out.print("Enter Duration: ");
                duration = sc.nextInt();
                if (type == 1) {
                    total += duration * 3000;
                } else {
                    total += duration * 2000;
                }
            }
        } while (type != 0);
            System.out.println("Total Parking: " + total);
        
        sc.close();
    }
}

```


## 4: CONCLUSION

Nested IF functions to solve problems that have multilevel or hierarchical requirements which allows the program flow to check the prerequisite requirements first before checking the quantitative requirements in them. If the condition at the outermost level is not met, the program does not need to evaluate the conditions inside, thereby saving execution time and simplifying instruction handling. Furthermore, nested IFs allow for the combination of logical operator flexibility at each level of evaluation.