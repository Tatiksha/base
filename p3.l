%{
int a;
int b;
%}
%%
-?[0-9]+a++; printf("Integer value=%s\t",yytext);
[0-9]+"."[0-9]+ b++; printf("Float Value=%s",yytext);
. ;
%%
int main()
{
yylex();
printf("Total no. of integers=%d\n",a);
printf("Total no. of float=%d",b);
return 0;
}
