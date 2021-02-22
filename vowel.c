

%{ 
    int vc=0; 
    int cc =0; 
%} 
  
%% 
[aeiouAEIOU] {vc++;} 
[a-zA-Z] {cc++;} 
%% 
  
int main() 
{ 
    yylex(); 
    printf("Vowels:  %d\n", vc); 
    printf("Consonants:  %d\n", cc); 
    return 0; 
}  

