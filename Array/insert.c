#include <stdio.h>

int insert(int arr[6], int element, int n, int capacity);

int main(){
    int a[6] = {1,5,7,8,9};
    int element;
    int n = 5;
    int capacity = sizeof(a) / sizeof(a[0]);
    printf("Enter Element at the end of array: ");
    scanf("%d", &element);
    insert(a, element, n, capacity);
    return 0;
}

//Insert
int insert(int arr[6], int element, int n, int capacity){
    if(n>=capacity){
        printf("Array has no more space for new Elements");
    }
    else{
        arr[n] = element;
    }

    printf("\n\nArray before update: \n");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }

    printf("\n\nArray after update: \n");
    for (int i = 0; i < capacity; i++)
    {
        printf("%d ", arr[i]);
    }
    
}