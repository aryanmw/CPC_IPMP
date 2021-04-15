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
    new_node->visited = 0;
    *head = new_node;
}

void printReverse(Node* head) 
{ 
    if (head == NULL) 
    return; 
  
    printReverse(head->next); 
    cout << head->data << " "; 
} 

int main() {
    struct Node* head = NULL;
    push(&head, 30);
    push(&head, 24);
    push(&head, 15);
    push(&head, 10);
    push(&head, 5);
    
    
    
    printReverse(head);
    
    return 0;
}