/*
Polynomial evaluation means finding the value of a polynomial for a particular value of x.
For example:
P(x) = 5x³ + 4x² + 2x + 7
If:
x = 2
we substitute 2 for x.
*/

#include<stdio.h>
struct Term
{
    int coefficient;
    int exponent;
};

int main(){
    struct Term p[10];
    int n,x,res=0;
    int i,j,power;

    printf("Enter number of terms : \n");
    scanf("%d",&n);
    for (int i = 0; i < n; i++)
    {
        printf("Enter coefficient and exponent : \n");
        scanf("%d %d",&p[i].coefficient,&p[i].exponent);
    }
    printf("Enter the value of x : \n");
    scanf("%d",&x);
    for (int i = 0; i < n; i++)
    {
        power = 1;
        for (int j = 1; j <= p[i].exponent; j++)
        {
            power = power * x;
        }
        res = res + p[i].coefficient * power;
    }
    printf("Result : %d\n",res);
}
