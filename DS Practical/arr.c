#include<stdio.h>
#include<conio.h>
int main()
{
    int arr[5] = {2,3,4,5,7};
    int length = sizeof(arr)/sizeof(arr[0]);
    printf("%d",length);
    getch();
}