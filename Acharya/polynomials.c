#include<stdio.h>
struct Term{
    int coefficient;
    int exponent;
};

int main(){
    struct Term p[10];
    int n,i;
    printf("Enter number of terms : \n");
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        printf("Enter coefficient and exponent : \n");
        scanf("%d %d",&p[i].coefficient,&p[i].exponent);
    }
    printf("Polynomials : \n");
    for(int i=0;i<n;i++){
        printf("%dx^%d",p[i].coefficient,p[i].exponent);
        if (i != n-1)
        {
            printf(" + ");
        }
    }
}