%{
int upper=0, lower=0;
%}

%%
[A-Z] upper++;
[a-z] lower++;
%%

void main()
{
yyin = fopen("f1.txt","r");
yyout = fopen("f2.txt","w");

yylex();
printf("\nUppercase Letters: %d\n", upper);
printf("\nLowercase Letters: %d\n", lower);
}
