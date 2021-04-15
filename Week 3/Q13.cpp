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

void deleteAlternateNode(Node** head)
{
    Node* curr = *head;
    Node* nodeToDelete = curr->next;
    while(curr->next != NULL){
        curr->next = nodeToDelete->next;
        free(nodeToDelete);
        curr = curr->next;
        nodeToDelete = curr->next;
    }
}

void printList(Node** head){
    Node* curr = *head;
    while(curr != NULL){
        cout<<curr->data<<" ";
        curr = curr->next;
    }
}

int main(){
     struct Node* head = NULL;
    push(&head, 20);
    push(&head, 4);
    push(&head, 15);
    push(&head, 10);
    push(&head, 25);
    
    printList(&head);
 
    deleteAlternateNode(&head);
    printList(&head);
    return 0;
}