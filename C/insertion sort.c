#include<stdio.h>
int main()
{
    int a[100],i,n;
    scanf("%d",&n); // number of elements
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);  //takes input of arrays
    }
    int temp,j;
    //insertion sort code.
    for(i=1;i<n;i++)
    {
        temp=a[i];
        for(j=i-1;j>=0;j--)
        {
            if(temp<a[j])    //ascending order.
            {
                a[j+1]=a[j];    //shift greater value to next index.
                a[j]=temp;
            }
        }
    }
    printf("\n Your array in asc. order is : ");
    for(i=0;i<n;i++)
    {
        printf("%d ",a[i]);
    }
    printf("\n\n");
    return 0;
}
