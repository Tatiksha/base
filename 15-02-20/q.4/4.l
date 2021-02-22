%{
int upper=0, lower=0;
%}

%%
[A-Z] upper++;
[a-z] lower++;
%%

void main()
{
yyin = fopen("gautam.txt","r");
yylex();
printf("\nUppercase Letters: %d\n", upper);
printf("\nLowercase Letters: %d\n", lower);
}
