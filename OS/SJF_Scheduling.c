#include <stdio.h>
int main()
{

    int i, n;
    int avgwt = 0, avgtat = 0;

    printf("Enter the number of process: ");
    scanf("%d", &n);
    int pid[n], bt[n], wt[n], tat[n];
    for (i = 0; i < n; i++)
    {
        printf("Enter process id: ");
        scanf("%d", &pid[i]);
        printf("Enter BT for this pid: ");
        scanf("%d", &bt[i]);
    }

    for (i = 0; i < n; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            int temp;
            if (bt[i] > bt[j])
            {
                temp = bt[i];
                bt[i] = bt[j];
                bt[j] = temp;

                temp = pid[i];
                pid[i] = pid[j];
                pid[j] = temp;
            }
        }
    }
    wt[0] = 0;
    for (i = 1; i < n; i++)
    {
        wt[i] = bt[i] + wt[i - 1];
    }
    for (i = 0; i < n; i++)
    {
        tat[i] = wt[i] + bt[i];
        avgtat += tat[i];
        avgwt += wt[i];
    }
    printf("PID\tBT\tWT\tTAT\n");
    for (i = 0; i < n; i++)
    {
        printf("%.2d\t%.2d\t%.2d\t%.2d\n", pid[i], bt[i], wt[i], tat[i]);
    }
    printf("avgwt = %d\navgtat = %d", avgwt / n, avgtat / n);

    return 0;
}