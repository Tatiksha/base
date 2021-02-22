%{
int n,p;
%}
%%
[02468] {printf("even\n");}
[0-9] {printf("odd\n");}
%%
int main()
{
printf("enter input:\n");
yylex();
return 0;
}
