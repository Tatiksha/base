%{
int vow,cons;
%}
%%

[aeiouAEIOU] {vow++;}
[a-zA-Z] {cons++;}

%%
int main()
{
yylex();
printf("No of vowels r %d\n",vow);
printf("no of consonents r %d\n",cons);
return 0;
}
