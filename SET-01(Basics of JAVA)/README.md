# SET-1 (Basics of JAVA)

## Compilation Guide
To create all class files, run:
```bash
javac *.java
```
---

# 📘 PRACTICAL 01 :-

##  AIM :-

Simulate a simple ATM or cashier. Given an integer amount to be dispensed (e.g., 787), calculate and
display the **minimum number of currency notes** of denominations **100, 50, 10, 5, 2, and 1** that would be
given to the user..

## Explanation

The program reads an amount from the user and calculates how many notes of each denomination are needed.
It uses:

* **Division (`/`)** → to find number of notes
* **Modulus (`%`)** → to find remaining amount

## OUTPUT:-

```
Enter amount: 787

Minimum number of notes required:
100 = 7
50 = 1
10 = 3
5 = 1
2 = 1
1 = 0
```

---

# PRACTICAL 02 :- 

## AIM :-

Write a Java program that accepts a **five-digit integer from the keyboard**. Your program should then
create a new number by adding one to each digit of the input number. For example, if the input is
12391, the output should be 23402 (note: 9+1=10, so it becomes 0 with a carry)

## Explanation

Each digit is extracted using **division and modulus operations**.
After extracting digits, **1 is added to each digit**.
If the digit becomes **10**, it is converted to **0**.

## OUTPUT :-

```
Enter a five digit number: 12391

New number: 23402
```

---

# PRACTICAL 03 :-

## AIM :-

Write a Java program that **accepts two numbers as command-line arguments.** Convert these arguments
to appropriate numeric types (e.g., int or double), perform a simple calculation (e.g., sum or product),
and print the result to the console.

## Explanation 

The program reads values from the **args[] array**.
Since command-line arguments are strings, they are converted to integers using:

```
Integer.parseInt()
```

Then the program calculates the **sum of two numbers**.

## OUTPUT:-

```
java practical03 10 20

First Number: 10
Second Number: 20
Sum = 30
```

---
