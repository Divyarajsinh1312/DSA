#include <stdio.h>

int secondLargest(int arr[5]);

int main(){
    int a[5] = {1,4,6,3,8};
    printf("%d", secondLargest(a));
    return 0;
}

int secondLargest(int arr[5]){
    int max1 = arr[0];
    int max2 = arr[0];
    for(int i=0; i<5; ++i){
        if (arr[i]>max1)
        {
            max1=arr[i];
        }
    }
    for(int i=0; i<5; ++i){
        if (arr[i]<max1 && arr[i]>max2)
        {
            max2=arr[i];
        }
    }
    return max2;
}