#include <stdio.h>

int search(int arr[5], int element);

int main(){
    int a[5] = {1,4,6,8,9};
    int element;
    printf("Enter Element for Search: ");
    scanf("%d", &element);
    search(a, element);
    return 0;
}

//Search operation
int search(int arr[5], int element){
    int index;
    int flag = 0;
    for(int i=0; i<5; ++i){
        if (arr[i]==element)
        {
           index = i;
           flag = 1;
        }
    }
    if (flag==1)
    {
        printf("Element Found at Position: %d", index);
    }
    else{
        printf("Element is not Found");
    }
}