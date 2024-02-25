#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
} *head = NULL;

void insertatBeginning(int data)
{
    struct node *newnode;
    newnode = (struct node *)malloc(sizeof(struct node));
    newnode->data = data;
    if (head == NULL)
    {
        newnode->next = NULL;
        head = newnode;
    }
    else
    {
        newnode->next = head;
        head = newnode; // corrected
    }
    // printf("Node inserted at the head.");
}

void insertatIndex(int data, int loc)
{
    struct node *newNode;

    newNode = (struct node *)malloc(sizeof(struct node));
    newNode->data = data;
    if (head == NULL)
    {
        newNode->next = NULL;
        head = newNode;
    }
    else if (loc == 1)
    {
        newNode->next = head;
        head = newNode;
    }
    else
    {
        int i = 1;
        struct node *temp = head;
        // corrected
        while (i < loc - 1)
        {
            temp = temp->next;
            i++;
        }
        newNode->next = temp->next;
        temp->next = newNode;
        // printf("Node inserted at index: %d",loc);
    }
}

void insertatEnd(int data)
{
    struct node *newNode;
    newNode = (struct node *)malloc(sizeof(struct node));
    newNode->data = data;
    if (head == NULL) // corrected
    {
        newNode->next = NULL;
        head = newNode;
    }
    else
    {
        struct node *temp;
        temp = head;
        while (temp->next != NULL)
        {
            temp = temp->next;
        }
        newNode->next = NULL;
        temp->next = newNode;
        // printf("Node inserted at the end.");
    }
}

void removeatHead()
{
    if (head == NULL)
    {
        printf("The list is empty.");
    }
    else
    {
        struct node *temp;
        temp = head;
        temp->next = head->next;
        head = temp->next;
        free(temp);
    }
}

void removeatSpecific(int data)
{
    struct node *temp;
    if (head == NULL)
    {
        printf("The list is empty.");
    }
    else
    {
        int i = 1;
        struct node *temp1;
        temp = head;
        while (temp->data != data)
        {
            if (temp->next == NULL)
            {
                printf("\nData not found.\n");
                return;
            }
            temp1 = temp;
            temp = temp->next;
            i++;
        }
        temp1->next = temp->next;
        free(temp);
    }
}

void removeatEnd()
{
    if (head == NULL)
    {
        printf("The list is empty.");
    }
    else
    {
        struct node *temp, *temp1;
        temp = head;
        temp1 = head;
        int i = 1;
        while (temp->next != NULL)
        {
            temp1 = temp;
            temp = temp->next;
            i++;
        }
        temp1->next = NULL;
        free(temp);
    }
}

void display()
{
    if (head == NULL)
    {
        printf("The list is empty.");
    }
    else
    {
        struct node *temp = head;

        while (temp != NULL) // corrected
        {
            printf("%d --->", temp->data);
            temp = temp->next;
        }
        printf("NULL\n");
    }
}

int main()
{
    // insertatBeginning(11);
    // insertatIndex(13,2);
    // insertatIndex(14,3);
    // insertatEnd(15);
    // insertatIndex(12,5);
    // insertatEnd(27);
    // // removeatSpecific(15);
    // removeatEnd();
    // removeatHead();
    // display();

    int data, loc, opt;
    while (1)
    {
    mainmenu:
        printf("\nEnter your operation: \n");
        printf("1) Insert\n2) Delete\n3) Display\n4) Exit\n");
        scanf("%d", &opt);
        switch (opt)
        {
        case 1:
        {
            printf("1)Insert at head\n2) Insert at specific\n3) Insert at End\n");
            scanf("%d", &opt);

            switch (opt)
            {
            case 1:
            {
                printf("Enter element: ");
                scanf("%d", &data);
                insertatBeginning(data);
                break;
            }
            case 2:
            {
                printf("Enter element: ");
                scanf("%d", &data);
                printf("Enter location: ");
                scanf("%d", &loc);
                insertatIndex(data, loc);
                break;
            }
            case 3:
            {
                printf("Enter element: ");
                scanf("%d", &data);
                insertatEnd(data);
                break;
            }
            default:
            {
                printf("Please enter a valid operation.");
                goto mainmenu;
            }
            }
            break;
        }
        case 2:
        {
            printf("1) Delete head\n2) Delete specific\n3) Delete end\n");
            scanf("%d", &opt);
            switch (opt)
            {
            case 1:
            {
                removeatHead();
                break;
            }
            case 2:
            {
                printf("Enter element: ");
                scanf("%d", &data);
                removeatSpecific(data);
                break;
            }
            case 3:
            {
                removeatEnd();
                break;
            }
            default:
            {
                printf("Please enter a valid operation.");
                goto mainmenu;
            }
            }
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
        }
        default:
        {
            printf("Please enter a valid operation.");
            goto mainmenu;
        }
        }
    }

    return 0;
}
