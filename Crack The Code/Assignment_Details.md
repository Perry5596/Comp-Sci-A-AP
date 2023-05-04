# Crack The Code

In this assignment, you will be creating a program that requires a secret code to “unlock.” The program should first welcome the user and ask the user to input their name. Then, the program will greet the user using the entered name and ask whether they are ready to crack the code. If they type "yes" (using any combination of upper/lower-case letters) then the program should proceed to the next stage. Otherwise, it should finish at that point and produce no more output.

In order to “crack the code,” the user must input a string, followed by two integers which satisfy the following conditions:

- The first input must be a string of length 3.
- The second input can either be the number 19 or a number between 35 and 78, but not equal to 78. 
- The third number must be a positive number (remember 0 is not positive) that is even or has a remainder of 1 when divided by 10.

As the user enters each input, the program should immediately check whether or not the input satisfies its respective requirement(s) listed above. If the requirement(s) is satisfied, then a “Correct!” confirmation should be printed out. If the requirement(s) is NOT satisfied, then an error message should be printed out, and the user cannot input any more numbers. (i.e. if the user inputs a string of length 4 as the first number, then the user has failed to crack the code, and cannot guess the first or second number.)

Please refer to the sample outputs below for formatting. (Any output statements from the program must match the sample formatting exactly.)


## Sample Run 1:

```
Welcome. What is your name?
Peter
Hello Peter. Are you ready to crack the code?
no
```

## Sample Run 2:

```
Welcome. What is your name?
Peter
Hello Peter. Are you ready to crack the code?
YES

PHASE 1
Enter a string:
abc
Correct!

PHASE 2
Enter a number:
40
Correct!
```

## Sample Run 3:

```
Welcome. What is your name?
Peter
Hello Peter. Are you ready to crack the code?
YES
 
PHASE 1
Enter a string:
abc
Correct!
 
PHASE 2
Enter a number:
20
Sorry, that was incorrect!
Better luck next time!
```

## Sample Run 4:

```
Welcome. What is your name?
Peter
Hello Peter. Are you ready to crack the code?
yes
 
PHASE 1
Enter a string:
abc
Correct!
 
PHASE 2
Enter a number:
19
Correct!
 
PHASE 3
Enter a number:
23
Sorry, that was incorrect!
Better luck next time!
```

## Sample Run 5:

```
Welcome. What is your name?
Peter
Hello Peter. Are you ready to crack the code?
Yes
 
PHASE 1
Enter a string:
abc
Correct!
 
PHASE 2
Enter a number:
19
Correct!
 
PHASE 3
Enter a number:
2
Correct!
You have cracked the code!
```

## Milestones
As you work on this assignment, you can use the milestones below to inform your development process:

### Milestone 1: 

Write code that takes the name input and displays it along with the appropriate messages. Take a second String input from the user, process it and write a first if statement to check if the input by the user is equal to "yes" in any case.

### Milestone 2: 

Write a conditional block of code for the program, displaying “Correct!” and continuing only if the string entered is of length 3, displaying the appropriate messages and ending otherwise.

### Milestone 3: 

Write the next conditional block of code for the program, displaying correct and continuing only if the number entered is either 19 or between 35 and 78 but not equal to 78 and displaying the appropriate messages and ending otherwise.

### Milestone 4: 

Write the final conditional block of code for the program, displaying correct and finishing if the number entered is positive and even or produces a remainder of 1 when divided by 10, displaying the appropriate messages for an incorrect entry otherwise.

> **NOTE: You MUST use the class name "Assignment3" for this assignment. REMEMBER: you must SUBMIT your answer. Your assignment doesn't count as complete unless it has been submitted.**

This activity requires the use of nested if statements, which are if statements inserted inside of other if statements. 

Here is an example of nested statements:

```java
if (a > 0)
{
    if (b > 0)
    {
        statement;
    }
    else
    {
        statement;
    }
}
else
{
    if (b > 0)
    {
        statement;
    }
    else
    {
        statement;
    }
}
```
In this example, we have a typical if-else structure, similar to what you have seen in previous lessons. However, we have also included a nested if-else statement inside of the outer if and else statements. The nested conditions will only be tested if the outer statement is evaluated to true. For example, if a > 0, then only the nested statements within the outer if will be tested and not those of the outer else statement. If a > 0 is false, the nested statements in the outer if are skipped and the nested statements in the outer else statement will be tested.
