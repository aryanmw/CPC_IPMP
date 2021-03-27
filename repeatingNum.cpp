#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main() {
    int arr[] = { 4, 2, 4, 5, 2, 3, 1 };
    int count = 0;
    int arraySize = sizeof(arr) / sizeof(arr[0]);
    unordered_map<int,int> myMap;
  
    
    for (int i = 0 ; i < arraySize ; i++){
        myMap[arr[i]]++;
    }
    
    for (auto i : myMap){
        if (i.second > 1){
            cout << i.first << " ";
        }
    }
	
	return 0;
}