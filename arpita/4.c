#include<stdio.h>
void main()
{ 
  int i,n;
  float p, sum=0;
  printf("\nEnter the value of n:\n");
  scanf("%d",&n);
  for (i=1;1<=n;i++)
  {
    p=1/(float)i;
    sum=sum+p;
  }
  for(i=1;i<=n-1;i++)
    printf("1/%d +",i);
    printf("1/%d=%f",n,sum);
    printf("\n");
}
