%{
int a;
int b;
int c;
int d;
%}
%%
"\n" a++;
"" b++;
"\t" c++;
. d++;
%%
int main()
{
yylex();
printf("no. of lines=%d",a);
printf("\n no. of spaces=%d",b);
printf("\n no. of tab meta characters=%d",c);
printf("\n no. of rest characters=%d",d);
return 0;
}
