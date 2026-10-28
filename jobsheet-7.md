# WORKSHEET 7 - LOOPS 1

**Student Details:**

- **Name:** Farrosyehan Muhammad Ramdhan
- **Student ID (NIM):** 264107020186
- **Class / Attendance No.:** 1I / 11

---

## 1: PRACTICAL OBJECTIVES

The objectives of the practical session in this chapter are as follows:

1. Students are able to explain the syntax for writing loop programs (`for`, `while`, and `dowhile`).
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

- **Question 1:** Identify and indicate each component of the `FOR` loop in the program code of Experiment 1!
  - **Answer:** 
    - Initialization (`int i = 1`) : Set up the counter variable `i` with an initial value of 1.
    - Condition (`i <= 10`) : Determines the limit of the loop as long as the value of i is less than or equal to 10.
    - Update/Increment (`i++`) : increment the value of i by 1 at the end of each iteration.
    - Loop Body : A code block within curly braces `{.}` that executes commands for inputting values ​​and determining the highest and lowest values.

- **Question 2:** Why is the variable highest initialized to 0 and the variable lowest initialized to 100? What happens if highest is initialized to 100 and lowest is initialized to 0?
  - **Answer:** 
    - **Explanation:** 
      - The variable `highest` is initialized to 0.0 so that the first input value—or any higher value—can immediately replace it. The variable `lowest` is initialized to 100.0 so that the first input value—or any lower value—can immediately replace it.
      
      - If all entered values ​​fall within the range of 0 to 100, no input will be greater than 100, so the `highest` value will remain 100.0. Similarly, since no input will be smaller than 0, the `lowest` value will remain 0.0.


- **Question 3:** Explain the function and workflow of the following code snippet!
  ``` java
  if (score > highest) {
    highest = score;
  }
  if (score < lowest) {
    lowest = score;
  }
  ```
  - **Answer:** 
    - **Function:** Compares the newly entered score value with the current highest and lowest values, then updates the highest or lowest variable if a new value is found that meets the criteria.
  
    - **Workflow:**
      - The first if-block checks whether score > highest. If true, the value of highest is updated to the value of score.
      - The second if-block checks whether score < lowest. If true, the value of lowest is updated to the value of score.
  

- **Question 4:** Modify the program to count how many students pass and how many students fail, based on the passing threshold (minimum score of 60). Display the number of students who pass and fail after displaying the highest and lowest scores!
  - **Answer:**    
    ``` java
    import java.util.Scanner;

    public class SiakadFor11 {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            double score, highest = 0.0, lowest = 100.0;
            int passedCount = 0, failedCount = 0;

            for (int i = 1; i <= 10; i++) {
                System.out.print("Enter score for student " + i + ": ");
                score = sc.nextDouble();

                if (score > highest) {
                    highest = score;
                }

                if (score < lowest) {
                    lowest = score;
                }

                if (score >= 60) {
                    passedCount++;
                } else {
                    failedCount++;
                }
            }

            System.out.println("Highest Score: " + highest);
            System.out.println("Lowest Score: " + lowest);
            System.out.println("Number of student passed: " + passedCount);
            System.out.println("Number of student failed: " + failedCount);
        }
    }
    ```
---

### 2.2 Experiment 2: Student Grades Case Study in SIAKAD – WHILE Loop

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
    - **Explanation:**
      A. `score < 0 || score > 100` : a logical condition to check whether the `score` value is invalid—that is, if it is negative or greater than 100.

      B. `continue` : An instruction to stop the remaining commands in the current iteration and jump immediately to the next loop iteration, without executing the commands that follow.
    
  
- **Question 2:** Why is the i++ statement written at the end of the WHILE loop? What happens if it is written at the beginning of the WHILE loop?
  - **Answer:**
    - **Explanation:** 
      - The value of `i` is incremented only when the entered data is valid. If the input is invalid, the `continue` statement is executed before `i++`, ensuring that the student sequence count does not decrease before a valid value is entered.
      
      - The value of `i` increments before the input and classification process for a given entry is complete. This results in incorrect student numbering (starting from 2 instead of 1), and invalid inputs are still counted as a full student iteration.

- **Question 3:** If the number of students entered is 19, how many times will the WHILE loop run?
  - **Answer:** If all inputs are valid, the while loop will execute 19 times. However, if there are any invalid inputs, the loop will execute 19 times plus the total number of incorrect inputs.
    

- **Question 4:** Modify the program so that, if a student receives grade A, the program displays an additional message “Well done, keep up the good work!”
  - **Answer:**
  ``` java
  if (score > 80 && score <= 100) {
    System.out.println("The grade of student " + (i + 1) + " is A");
    System.out.println("Well done, keep up the good work!");
  }
  ```



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
    - **Explanation:** This loop program is executed exactly once. It runs the `do` block, reads the input "cancel", displays a cancellation message, and then exits the loop via the `break` command.
  
- **Question 2:**  State the stopping condition used in this DO-WHILE loop!
  - **Answer:** The termination of the loop is controlled by checking `customerName.equalsIgnoreCase("cancel")` within the loop block, which triggers a `break` command.
    
- **Question 3:** What is the function of using the value true in the DO-WHILE condition?
  - **Answer:** Creating a loop that runs continuously (an infinite loop) until a specific condition within the loop triggers a `break` command.
    
- **Question 4:** Why does this DO-WHILE loop still run even though it has no initialization and update components?
  - **Answer:** This loop employs a sentinel-controlled loop scheme, where the termination of the loop depends on a specific input value ("cancel") and the `break` command, rather than on a numerical counter. Consequently, the initialization and update components for a counter are not required.
    

## 3: INDIVIDUAL ASSIGNMENT

The following is a list of tasks to be completed in this worksheet:

- [x] **Task 1:** A cinema manager wants to create a program to calculate the total ticket sales in one day. Tickets are sold at Rp 50,000 per ticket. The program must calculate the total number of tickets sold and the total ticket sales revenue for the day, subject to the following rules.
- Rules : 
  -  If a customer buys more than 4 tickets, the customer receives a 10% discount.
  -  If a customer buys more than 10 tickets, the customer receives a 15% discount.
  -  If the ticket quantity entered is invalid (negative), the program ignores the input and asks for it to be re-entered.
  -  Loops may use for, while, or do-while. Add break or continue statements if necessary.
- [x] **Task 2:** A parking lot operator wants to create a program to calculate the total parking fees of several vehicles. The parking rate is Rp 3,000 per hour for cars and Rp 2,000 per hour for motorcycles. The program keeps asking for input as long as the input is not 0. Implement the flowchart as a Java program!
![Flowchart Task 2](/flowchart-jobsheet-7.png)


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
