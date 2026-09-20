Count Digits in a Number
📌 Description
This Java program counts the total number of digits in an integer entered by the user.

The program uses a while loop to repeatedly remove the last digit of the number and count how many times this can be done.

Example
Input:
423424

Output:
Number of Digits in 423424 is: 6

🛠️ Concepts Used
This program demonstrates the following Java concepts:

Scanner for taking user input

Variables and data types

if-else conditions

while loop

Integer division

Counting using a counter variable

🔍 How It Works
The program asks the user to enter an integer.

The entered number is stored in the num variable.

The original number is saved in originalNum so it can be displayed later.

A count variable is initialized to 0.

If the user enters 0, the digit count is set to 1.

Otherwise, the program uses a while loop:

num = num / 10 removes the last digit.

count++ increases the digit counter by 1.

Once the number becomes 0, the loop stops.

The program displays the total number of digits.

💡 Example Walkthrough
For the input:

423424

The loop works like this:

423424 / 10 = 42342   → count = 1
42342  / 10 = 4234    → count = 2
4234   / 10 = 423     → count = 3
423    / 10 = 42      → count = 4
42     / 10 = 4       → count = 5
4      / 10 = 0       → count = 6

The final result is:

Number of Digits in 423424 is: 6

▶️ How to Run
Prerequisites
Java Development Kit (JDK)

Any Java IDE such as IntelliJ IDEA, Eclipse, or VS Code

Run from the Command Line
Save the file as:

CountDigits.java

Compile the program:

javac CountDigits.java

Run the program:

java CountDigits

📂 Package
The program belongs to the following package:

package day6;

Therefore, the file should normally be located inside a day6 package/folder in your Java project.

🧪 Sample Output
Enter integer number:
423424
Number of Digits in 423424 is: 6

Another Example
Enter integer number:
7
Number of Digits in 7 is: 1

Zero
Enter integer number:
0
Number of Digits in 0 is: 1

⏱️ Complexity
Time Complexity: O(n) where n is the number of digits.

Space Complexity: O(1) because the program uses only a fixed number of variables.

📚 Learning Goal
This exercise is useful for practicing:

Loops

Conditional statements

Integer division

Basic problem-solving

Working with numbers in Java
