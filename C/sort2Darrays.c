#include<stdio.h>

void sort(int arr[][20], int n, int m) {
	int i, j, temp;

	for (i = 0; i < n * m - 1; ++i) {
		for (j = 0; j < n * m - 1 - i; ++j) {
			
			if (arr[j / m][j % m] > arr[(j + 1) / m][(j + 1) % m]) {

				temp = arr[(j + 1) / m][(j + 1) % m];
				arr[(j + 1) / m][(j + 1) % m] = arr[j / m][j % m];
				arr[j / m][j % m] = temp;

			}
		}
	}

}

void display(int arr[][20], int n, int m) {
	int i, j;
	for (i = 0; i < n; ++i) {
		for (j = 0; j < m; ++j) {
			printf("%d ", arr[i][j]);
		}
		printf("\n");
	}
}

int main()
{
	int n, m;
	int i, j;
	int arr[20][20];
	printf("Enter Number of Rows: ");
	scanf("%d", &n);
	printf("Enter Number of Columns: ");
	scanf("%d", &m);
	printf("Enter Array Elements\n");
	for (i = 0; i < n; ++i) {
		for (j = 0; j < m; ++j) {
			scanf("%d", &arr[i][j]);
		}
	}
	sort(arr, n, m);
	printf("\nArray After Sorting: ");
	display(arr, n, m);
}