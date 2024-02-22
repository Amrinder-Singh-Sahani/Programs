#include<stdio.h>
#include<conio.h>

int a,b,item,stack[100];
int stack1[100];
int resstack[200];

void stackone()
{
    printf("Enter the size for your first stack:\n ");
    scanf("%d",&a);
    for (int i = 0;i<a;i++)
    {
        
        printf("Element %d for stack 1 \n",i+1);
        scanf("%d",&item);
        stack[i]=item;
        
    }


}

void stack2()
{
    printf("Enter the size for your second stack:\n ");
    scanf("%d",&b);
    for (int j = 0;j<b;j++)
    {
        
        printf("Element %d for stack 2 \n",j+1);
        scanf("%d",&item);
        stack1[j]=item;
    }
}
void stackmerge()
{
    int res = a+b;
    int c=0;
    
    
    for (int l = 0;l<res;l++)
    {
        if(l<a)
        {
            resstack[l] = stack[l];
            printf("%d\n",resstack[l]);

        }
         if(l>=a)
        {
            resstack[l] = stack1[c];
            printf("%d\n",resstack[l]);
            c++;
        }
      
    }
    
}





int main()
{
    stackone();
    stack2();
    stackmerge();
    
        
        
}