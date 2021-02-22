#include<stdio.h>
void main()
{
    int x1,x2,x3,x4,x5,sum;
    float per;
    printf("Enter the marks in 5 subjects\n");
    scanf("%d%d%d%d%d",&x1,&x2,&x3,&x4,&x5);
    sum=x1+x2+x3+x4+x5;
    printf("\nTotal marks=%d",sum);
    per=(float)sum/5;
    printf("\nPercentage=%f",per);
    if(per>=60)
    printf("\nDiv=I");
    else if(per>=50)
    printf("\nDiv=II");
    else if(per>=40)
    printf("\nDiv=III");
    else
    printf("\nFail");
    printf("\n\n");
}
