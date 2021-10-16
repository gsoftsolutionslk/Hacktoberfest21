/*You are going to appear a fast-aptitude exam, but only people with a calculating mind can clear it. Given 2 years, write a program to calculate the total number of days in both years.

Input Description:
- First line of input consists of n, the number of test cases.
- Next n lines, each line consists of 2 integers, denoting the both the years separated by space.

Input variables:
int t: No. of test cases
int a,b: Both the years
   

Output Description:
int: The  total days

Constraints:-
1 <= n <= 100
2000<=a,b<=3000

Example :-
Input: 
2
2016 2022
2017 2018

Output:  
731
730 */
#include <stdio.h>
int leap()
{
    int a, b, days;
    scanf("%d %d", &a, &b);
    if (a % 4 == 0 && b % 4 == 0)
    {
        days = 732;
    }
    else if (a % 4 == 0 || b % 4 == 0)
    {
        days = 731;
    }
    else
    {
        days = 730;
    }
    return days;
}
int main()
{
    int n;
    scanf("%d", &n);
    printf("\n");

    for (int i = 0; i < n; i++)
    {
        printf("%d \n", leap());
    }
}