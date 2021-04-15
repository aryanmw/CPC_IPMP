#include <iostream>
#include <bits/stdc++.h>
using namespace std;

struct Node{
    int data;
    Node* next;
    
};

void sortIntoZeroesOnesAndTwos(Node** head){
    Node* curr = *head;
    int n0 = 0,n2 = 0,n1 = 0;
    while(curr != NULL){
        if(curr->data == 0){
            n0++;
        }
        else if(curr->data == 1){
            n1++;
        }
        else if(curr->data == 2){
            n2++;
        }
        
        curr = curr->next;
    }
    
    curr = *head;
    int count = 0;
    while(count < n0){
        curr->data = 0;
        curr = curr->next;
        count++;
    }
    count = 0;
    while(count < n1){
        curr->data = 1;
        curr = curr->next;
        count++;
    }
    count = 0;
    while(count < n2){
        curr->data = 2;
        curr = curr->next;
        count++;
    }
}

void printList(Node* head){
    Node* curr = head;
    while(curr != NULL){
        cout<<curr->data<<" ";
        curr = curr->next;
    }
    cout << "\n";
}



void push(Node** head, int data)
{
    struct Node* new_node = new Node();
    new_node->data = data;
    new_node->next = *head;
    
    *head = new_node;
}



int main() {
    struct Node* head = NULL;
    push(&head, 0);
    push(&head, 1);
    push(&head, 2);
    push(&head, 2);
    push(&head, 1);
    printList(head);
    sortIntoZeroesOnesAndTwos(&head);
    printList(head);
   
    
    return 0;
}
