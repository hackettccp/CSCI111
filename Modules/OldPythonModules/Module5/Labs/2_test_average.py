"""
Create a program that finds the average of some number of test scores.

First, prompt the user to enter the number of test scores to average.
Validate that their input is greater than zero.

Then, based on how many test scores the user specified, prompt the user
to enter each test score.
Validate that each test score is greater than or equal to zero and
less than or equal to one hundred.

Calculate a print the average.
(Sum of the test scores divided by the total number of tests.)

EXAMPLE INPUT/OUTPUT
Enter the number of test scores to average: -5
Value cannot be negative. Try again.
Enter the number of test scores to average: 3

Enter the score for test #1: -4
Invalid entry. Score must be between 0 and 100. Try again.
Enter then score for test #1: 90
Enter then score for test #2: 95
Enter then score for test #3: 110
Invalid entry. Score must be between 0 and 100. Try again.
Enter then score for test #3: 91

The average of the test scores is: 92.0

"""

