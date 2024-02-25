#include <stdio.h>
#define max 10

int hash[max], key, count = 0, hk;

void insert()
{
    if (count == max - 1)
    {
        printf("\nThe hashtable is full.");
    }
    else
    {
        printf("\nEnter element: ");
        scanf("%d", &key);
        hk = ((2 * key) + 3) % 10;
        if (hash[hk] == NULL)
        {
            hash[hk] = key;
            count += 1;
        }
        else
        {
            for (int i = 1;; hk = (hk + 1) % 10)
            {
                if (hash[hk] == NULL)
                {
                    hash[hk] = key;
                    count += 1;
                    break;
                }
            }
        }
    }
}

void display()
{
    if (count == 0)
    {
        printf("\nThe hashtable is empty.");
    }
    else
    {
        for (int i = 0; i < max; i++)
        {
            if (hash[i] == NULL)
            {
                printf("\nIndex %d: %d\n", i, hash[i]);
            }
            else
            {
                printf("\nIndex %d: %d\n", i, hash[i]);
            }
        }
    }
}

void search()
{
    if (count == 0)
    {
        printf("The hashtable is empty.");
    }
    else
    {
        printf("\nEnter the element to search: ");
        scanf("%d", &key);
        hk = ((2 * key) + 3) % 10;
        if (hash[hk] == key)
        {
            printf("\nThe entered element is at hk: %d", hk);
        }
        else
        {
            int i;
            for (i = 1; i < max; hk = ((hk + i) % 10))
            {
                if (hash[hk] == key)

                {
                    printf("\nThe entered element is at hk: %d", hk);
                    break;
                }
                i++;
            }
            if(i == max)
            {
                printf("\nThe entered element is not in the hashtable.");
            }
        }
    }
}
int main()
{
    int opt;
    do
    {
        printf("\nEnter your operation: ");
        printf("\n1) Insert\n2) Search\n3) Display\n4) Exit\n");
        scanf("%d", &opt);
        switch (opt)
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
        }
        default:
        {
            printf("\nPlease enter a valid operation.");
        }
        }
    } while (1);
    return 0;
}