#include<stdio.h>
#include<conio.h>
int main(){
    char ch[50];
    char a;
    int c;
    printf("Enter a name");
    gets(ch);
    printf("Which letter u want to find");
    scanf("%c",&a);
    for(int i=0; i<=50; i++){
        if(a == ch[i]){
            c++;
        }
    }
    printf("%d",c);
    return 0;
}