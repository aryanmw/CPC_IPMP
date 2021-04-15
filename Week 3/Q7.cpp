#include <iostream>
#include <bits/stdc++.h>
using namespace std;
struct Node{
    int data;
    Node* next;
    int visited;
};

void push(Node** head, int data)
{
    struct Node* new_node = new Node();
    new_node->data = data;
    new_node->next = *head;
    new_node->visited = 0;
    *head = new_node;
}

void detectLoop(Node** head)
{
    Node* curr = *head;
    Node* next = NULL;
    
    
    
    while(curr!=NULL){
        if(curr->visited == 1){
            cout << "Loop Found";
            return;
        }
        curr->visited = 1;
        curr = curr->next;
    }
    cout << "Loop not found";
}

int main() {
    struct Node* head = NULL;
    push(&head, 20);
    push(&head, 4);
    push(&head, 15);
    push(&head, 10);
    push(&head, 25);
    
    head->next->next->next->next = head;
	detectLoop(&head);
	return 0;
}