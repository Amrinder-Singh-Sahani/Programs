#include<stdio.h>
#define TABLE_SIZE 10
int key,hkey[TABLE_SIZE],Index;

void insert()
{
    printf("Enter the element you want to insert: \n");
    scanf("%d",&key);
    for(int i = 0;i<=TABLE_SIZE;i++)
    {
        Index = (key+i)%10;
        if(hkey[Index]==NULL)
        {
            hkey[Index] = key;
            break;
        }
        if(i == TABLE_SIZE)
        {
            printf("Element cannot be inserted.\n");
        }
    }
}
void search()
{
    printf("Enter the element you want to search: \n");
    scanf("%d",&key);
    for(int i = 0;i<=TABLE_SIZE;i++)
    {
        Index = (key+i)%10;
        if(hkey[Index]==key)
        {
            printf("The element is at index number %d\n",Index);
            break;
        }
        if(i == TABLE_SIZE)
        {
            printf("Element not found.\n");
        }
    }
}
void display()
{
    for(int i = 0;i<TABLE_SIZE;i++)
    {
        printf("Index %d = %d\n",i,hkey[i]);
    }
}
int main()
{
    int ch;
    for(;;)
    {
        printf("1 to insert\t2 to search\t3 to display\t4 to exit: \n");
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
                search();
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