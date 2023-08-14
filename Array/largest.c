#include <stdio.h>

int largest(int arr[5]);

int main(){
    int a[5] = {2,6,7,0,1};
    printf("%d", largest(a));
    return 0;
}

int largest(int arr[5]){
    int max=arr[0];
    for(int i=1; i<5; ++i){
        if (arr[i]>max)
        {
            max=arr[i];
        }
    }
    return max;
}