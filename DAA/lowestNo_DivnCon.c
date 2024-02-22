#include<stdio.h>
int max,min,arr[100];
void div(int i,int j)
{
    int max1,min1,mid;
    if(i == j)
    {
        max = i;
        min = i;
    }
    else
    {
        if(i == j-1)
        {
            if(arr[i] < arr[j])
            {
                max = arr[j];
                min = arr[i];
            }
            else
            {
                max = arr[i];
                min = arr[j];
            }
        }
        else
        {
            mid = (i+j)/2;
            div(i,min);
            max1 = max;
            min1 = min;
            div(mid+i,j);
            if(max<max1)
            {
                max = max1;
                printf("Highest number: %d",max);
            }
            if(min>min1)
            {
                min = min1;
                printf("Lowest number: %d",min);
            }
        
        }
    }
}
int main()
{
    int input;
    printf("Enter the length of the array: \n");
    scanf("%d",&input);
    int arr[input];
    printf("Enter %d numbers in a sorted manner: \n",input);
    for(int i = 0;i<input;i++)
    {
        scanf("%d",&arr[i]);
    }
    max = arr[0];
    min = arr[input - 1];
    div(arr[0],arr[input-1]);
    printf("Highest number: %d",max);
    printf("Lowest number: %d",min);






    return 0;
}