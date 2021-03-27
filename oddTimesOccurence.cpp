#include <iostream>
using namespace std;

int main() {
    int arr[] = { 1,2,1,3,2,3,3 };
    int count = 0;
    int arraySize = sizeof(arr) / sizeof(arr[0]);
    for (int i = 0 ; i < arraySize ; i++){
        for (int j = 0 ; j < arraySize ; j++){
            
                if (arr[i] == arr[j]){
                    count++;
                }
            
        }
        if (count % 2 != 0){
            cout<<arr[i];
            break;
        }
        count = 0;
    }
	
	return 0;
}