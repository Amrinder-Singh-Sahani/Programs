#include<stdio.h>
int max = 5, stack[5], top = -1,item;
void push()
{
    if (top == max -1)
    {
        printf("Stack is full.\n");
    }
    else
    {
        printf("Enter the element: ");
        scanf("%d",&item);
        top = top +1;
        stack[top] = item;
    }
}
void pop()
{
    if(top == -1)
    {
        printf("Stack is empty.\n");

    }
    else
    {
        printf("Deleted item is: %d \n", stack[top]);
        top = top -1;

    }
}
void display()
{
    if (top == -1)
    {
        printf("Stack is empty.\n");
    }
    else 
    {
        for (int i = top; i>= 0; i--)
        {
            printf("Element in stack location %d is: %d \n",i,stack[i]);
        }
    }
}

int main()
{
    int a;
    while (1)
    {
        printf("Choose the given option\n");
        printf("1) Enter the element in stack\n");
        printf("2) Delete the element in stack\n");
        printf("3) Dispaly the element in stack\n");
        printf("4) Exit\n");
        scanf("%d",&a);
        switch (a)
        {
            case 1:
            {
                push();
                break;
            }
            
            case 2:
            {
                pop();
                break;
            }
            case 3:
            {
                display();
                break;
            }
            case 4:
            {
                return 0;
                break;
            }
            default:
            {
                printf("Enter a valid choice.");
            }
        }
        
        
    }    
    
    
}