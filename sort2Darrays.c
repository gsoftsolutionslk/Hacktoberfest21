#include<stdio.h> 
#include<conio.h> 
void main() 
 
{ 
     
    int arr[3][3],b[9]; 
    int i,j,k=0,temp; 
    clrscr(); 
 
    printf("\nEnter the elements of the array:\n"); 
    
    for(i=0;i<3;++i) 
    { 
     	printf("\n"); 
	    for(j=0;j<3;++j) 
	    scanf("%d",&arr[i][j]); 
    } 
 
    printf("\nThe elements entered are :\n"); 
 
    for(i=0;i<3;++i) 
    { 
	   for(j=0;j<3;++j) 
	   { 
	       printf("%d ",arr[i][j]); 
	   } 
	   printf("\n"); 
    } 
 
    for(i=0;i<3;i++)  
    { 
	    for(j=0;j<3;j++) 
     	b[k++]=arr[i][j]; 
    } 
 
    printf("\nEntered 1-D Matrix is:\n"); 
 
    for(k=0;k<9;k++) 
    printf("%d ",b[k]); 
 
    for (i=0;i<9;i++) 
    { 
 	    for (j=0;j<(8-i);j++) 
	    { 
   	        if(b[j]>b[j+1]) 
	        { 
	         	temp = b[j]; 
	        	b[j] = b[j+1]; 
		        b[j+1] = temp; 
	        } 
	    } 
    } 
 
    printf("\n\nSorted array is:\n"); 
 
    for(i=0;i<9;i++) 
    { 
	    printf("%d ", b[i]); 
    } 
 
    k=0; 
    for(i=0;i<3;i++) 
    { 
	    for(j=0;j<3;j++) 
	    { 
	        arr[i][j]=b[k]; 
	        k++; 
	    } 
 
    } 
    
    printf("\n\n2D Sorted Array is:\n"); 
 
    for(i=0;i<3;i++) 
    { 
	    for(j=0;j<3;j++) 
	    { 
            printf("%d ",arr[i][j]); 
	    } 
    	printf("\n"); 
    } 
 
    getch(); 
 
} 