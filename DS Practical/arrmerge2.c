#include <stdio.h>
#include <conio.h>
int main()
{
    int a, b, item;

    printf("Enter the size for array 1: \n");
    scanf("%d", &a);
    int arr[a - 1];
    for (int i = 0; i < a; i++)
    {
        printf("Enter element %d for array 1: \n", i + 1);
        scanf("%d", &item);
        arr[i] = item;
    }

    printf("Enter the size for array 2: \n");
    scanf("%d", &b);
    int arr2[b - 1];
    for (int j = 0; j < b; j++)
    {
        printf("Enter element %d for array 1: \n", j + 1);
        scanf("%d", &item);
        arr2[j] = item;
    }

    int res = a + b;
    int c = 0, resstack[res - 1];

    for (int l = 0; l < res; l++)
    {
        if (l < a)
        {
            resstack[l] = arr[l];
            printf("%d\n", resstack[l]);
        }
        if (l >= a)
        {
            resstack[l] = arr2[c];
            printf("%d\n", resstack[l]);
            c++;
        }
    }
    getch();

    return 0;
}