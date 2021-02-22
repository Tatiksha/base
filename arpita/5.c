#include<stdio.h>
float func(float);
int check (float,float);
void main()
{
  int ans;
  float x,y,x1,x2;
  printf("\n Enter the value of x:\n");
  scanf("%f",&x);
  y=func(x);
  printf("\n y  at %f = %f\n",x,y);
  printf("Enter the interval x1, x2:");
  scanf("%f%f",&x1,&x2);
  ans=check(x1,x2);
  printf("\nf(%f)=%f",x1,func(x1));
  printf("\nf(%f)=%f",x2,func(x2));
  if(ans==1)
     printf("\nRoot lies between %f and %f\n",x1,x2);
  else
    printf("\nRoot does not lies between %f and %f\n",x1,x2);
}
  float func (float a)
{ 
  float z;
  z=a*a*a+3*a-5;
  return z;
}
int check (float a, float b)
{
if (func (a)*func(b)<=0)
    return 1;
else
    return 0;
}

