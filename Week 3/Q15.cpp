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

Node* reverse(Node* head, int k)
    {
        if (!head){
            return NULL;
        }
        
        Node* current = head;
        Node* prev = NULL;
        Node* next = NULL;
        int count = 0;
 
        while (current != NULL && count < k) {
            next = current->next;
            current->next = prev;
            prev = current;
            current = next;
            count++;
        }
        
        
        if(next != NULL){
           head->next = reverse(next,k); 
        }
        
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
    
    printList(head);
    
    head = reverse(head,3);
    
    printList(head);
    
    return 0;
}
