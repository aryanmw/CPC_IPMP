#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main() {
    int arr[] = { 1, 2, 4, 6, 3, 7, 8 };
    int count = 0;
    int arraySize = sizeof(arr) / sizeof(arr[0]);
    int sum = 0;
    
    int sumTotal = (arraySize + 1)*(arraySize + 2) / 2;
    for (int  i=0 ; i < arraySize ; i++){
        sum += arr[i]; 
    }
    
    int miss = sumTotal - sum;
    cout << miss;
	return 0;
}