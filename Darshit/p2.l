%{
int a;
%}
%%
[A-Za-z_][A-Za-z0-9_]* a++; printf("identifiers=%s\t",yytext);
. ;
%%
int main()
{
yylex();
printf("Total no. of identifiers=%d",a);
return 0;
}

int yywrap()
{
return 1;
}
