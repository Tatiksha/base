%{ 
    int c=0;
%} 
  
%% 
[_a-zA-z][a-zA-Z0-9]* {printf("Valid");} 
. {printf("Invalid");}
%% 
  
int main() 
{ 
    yylex(); 
    
    
    return 0; 
}  

