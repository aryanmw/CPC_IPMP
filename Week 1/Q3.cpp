#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main() {
    int arr[] = { 1,2,1,3,2,3,3 };
    int count = 0;
    int arraySize = sizeof(arr) / sizeof(arr[0]);
    unordered_map<int,int> myMap;
  
    
    for (int i = 0 ; i < arraySize ; i++){
        myMap[arr[i]]++;
    }
    
    for (auto i : myMap){
        if (i.second % 2 != 0){
            cout << i.first << " ";
        }
    }
	
	return 0;
}