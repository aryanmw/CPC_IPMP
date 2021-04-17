#include <iostream>
#include <bits/stdc++.h>
using namespace std;

struct Node{
    int data;
    Node* next;
    
};



void push(Node** head, int data)
{
    struct Node* new_node = new Node();
    new_node->data = data;
    new_node->next = *head;
    
    *head = new_node;
}



Node *kAltReverse(Node *head, int k) 
{ 
    Node* current = head; 
    Node* next; 
    Node* prev = NULL; 
    int count = 0; 
  
    
    while (current != NULL && count < k) 
    { 
    next = current->next; 
    current->next = prev; 
    prev = current; 
    current = next; 
    count++; 
    } 
      
    
    if(head != NULL) 
    head->next = current; 
  
    
    count = 0; 
    while(count < k-1 && current != NULL ) 
    { 
    current = current->next; 
    count++; 
    } 
  
    
    
    if(current != NULL) 
    current->next = kAltReverse(current->next, k); 
  
    
    return prev; 
} 
    
    void printList(Node* head){
    Node* curr = head;
    while(curr != NULL){
        cout<<curr->data<<" ";
        curr = curr->next;
    }
    cout << "\n";
}


int main() {
    struct Node* head = NULL;
    push(&head, 30);
    push(&head, 24);
    push(&head, 15);
    push(&head, 10);
    push(&head, 5);
    push(&head, 19);
    push(&head, 59);
    push(&head, 80);
    push(&head, 7);
    
    printList(head);
    
    head = kAltReverse(head,3);
    
    printList(head);
    
    return 0;
}
