%{
int a;
int b;
int c;
%}
%%
"*" a++;
" " b++;
%%
int main(){
yyin=fopen(argv[1],"r");
yylex();
printf("Number of characters %d",a);
printf("Number of words %d",b-1);
printf("Number of white spaces %d",b);
fclose(yyin);
return 0;
}
