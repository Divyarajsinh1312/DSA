//Delete element from array
#include <stdio.h>

void delete(int arr[6], int n, int element);

int main(){
    int n = 6;
    int element;
    int array[6] = {1,2,4,6,7,8};
    printf("Enter element which you wnat to delete: ");
    scanf("%d", &element);
    printf("\n\nArray before delete Element: ");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", array[i]);
    }
    delete(array, n, element);
    n--;
    printf("\n\nArray after delete Element: ");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", array[i]);
    }
    return 0;
}

void delete(int arr[6], int n, int element){
    int flag=0;
    int pos;
    int a;
    for (int i = 0; i < n; i++)
    {
        if(arr[i]==element){
            flag=1;
            pos = i;
        }
    }
    if (flag==1)
    {
        a=1;
        for (int i = 0; i < n-pos; i++)
        {
            arr[pos+i]=arr[pos+a];
            a++;
        }
    }
    else
    {
        printf("Your given element is not found in Array");
    }
    
}