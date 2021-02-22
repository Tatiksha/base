%{
 int a;
 int b;
 int c;
 int d;
%}
%%
"\n" a++;
" " b++;
"\t" c++;
. d++ ;
%%
int main()
{
+yyin=fopen("text.txt","r");
yylex();
fclose(yyin);
printf("\nno. of lines %d",a);
printf("\nno. of spaces=%d",b);
printf("\nno. of tab meta characters=%d",c);
printf("\n no. of rest characters=%d",d);

return 0;
}

int yywrap()
{
return 1;
}
