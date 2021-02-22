%{
int a;
int b;
int c;
%}
%%
" " b++;
[^\n\t] a++;
%%
int main(int argc,char *argv[]){
yyin=fopen(argv[1],"r");
yylex();
printf("Number of characters %d",a);
printf("Number of words %d",b+1);
printf("Number of white spaces %d",b);
fclose(yyin);
return 0;
}

int yywrap()
{
return 1;
}
