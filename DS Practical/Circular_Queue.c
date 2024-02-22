#include<stdio.h>
#define MAX 5

int count = 0,rear = -1,front = 0,queue[MAX],element;

void insert()
{
    if(count == MAX)
    {
        printf("Queue is full\n");
    }
    else
    {
        printf("Enter your element\n");
        scanf("%d",&element);
        rear = (rear+1)%MAX;
        queue[rear] = element;
        count++;        
    }
}
void delete()
{
    if(count == 0)
    {
        printf("The queue is empty\n");
    }
    else
    {
        printf("Deleted element is %d\n",queue[front]);
        front = (front+1)%MAX;
        count--;
    }
}
void display()
{
    int i,j = front;
    if(count == 0)
    {
        printf("Queue is empty\n");
    }
    else
    {
        for(i = 0;i < count;i++)
        {
            printf("%d\t",queue[j]);
            j = (j+1)%MAX;
            printf("\n");
        }
    }
}

int main()
{

    int ch;
    while(2)
    {
    printf("Enter your choice: \n");
    printf("1) Insert\n2) Delete\n3) Display\n4) Exit\n");
    scanf("%d",&ch);
        switch(ch)
        {
            case 1:
            {
                insert();
                break;
            }
            case 2:
            {
                delete();
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
                printf("Enter a valid choice\n");
            }
        }
    }
}