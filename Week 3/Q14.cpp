#include <iostream>
#include <bits/stdc++.h>
using namespace std;
struct Node{
    int data;
    Node* next;
};

void rotateList(Node** head, int n){
    int count = 1;
    Node* curr = *head;
    Node* pivot = NULL;
    Node* lastElement = NULL;
    while(curr->next != NULL){
        if(count == n){
            pivot = curr->next;
            lastElement = curr;
        }
        curr = curr->next;
        count++;
    }
    curr->next = *head;
    lastElement->next = NULL;
    *head = pivot;
}


void push(Node** head, int data)
{
    struct Node* new_node = new Node();
    new_node->data = data;
    new_node->next = *head;
    *head = new_node;
}

void printList(Node** head){
    Node* curr = *head;
    while(curr != NULL){
        cout<<curr->data<<" ";
        curr = curr->next;
    }
    cout << "\n";
}
int main() {
    struct Node* head = NULL;
    push(&head, 20);
    push(&head, 4);
    push(&head, 15);
    push(&head, 10);
    push(&head, 25);
    
    printList(&head);
 
    rotateList(&head,3);
    printList(&head);
    
	return 0;
}