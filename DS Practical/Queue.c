#include<stdio.h>
#define max 5

int item,queue[max],front = -1,rear = -1;

void enqueue()
{
    
    if (rear == max - 1)
    {
        if(front == max)
        {
            front = -1;
            rear = -1;
            printf("Enter 1 again to insert elements in the queue.\n");
        }
        else{
            printf("The queue is full.\n");
        }
    }
    else{
        
        if (front == -1)
        {
            front = 0;
        }
            printf("Enter your element: \n");
            scanf("%d",&item);
            rear = rear + 1;
            queue[rear] = item;
        
        
    }
    

}

void dequeue()
{
    if(front == -1 || front > rear)
    {
        printf("The queue is empty.\n");
    }
    else
    {
        printf("The deleted element is: %d\n",queue[front]);
        front = front + 1;
    }
}
void display()
{
    if (front == -1 || front > rear)
    {
        printf("The queue is empty.\n");
    }
    else
    {
        for(int i = front ; i <= rear;i++)
        {
            printf("%d\n",queue[i]);
        }
    }
}


int main()
{
    int c;
    while(1)
    {
        printf("Enter your choice:\n");
        printf("1 to enqueue\n2 to dequeue\n3 to display\n4 to exit:\n");
        scanf("%d",&c);
        switch(c)
        {
            case 1:
            {
                enqueue();
                break;
            }
            case 2:
            {
                dequeue();
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
                printf("Invalid option.");
            }
            
        }
    }    
}