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

void findMiddle(Node** head){
    Node* fast = *head;
    Node* slow = *head;
    while(fast != NULL){
        if(fast->next == NULL){
            cout<<slow->data <<" ";
            //cout<<slow->next->data;
            return;
        }
        fast = fast->next->next;
        slow = slow->next;
        
    }
    cout<<slow->data <<" ";
    cout<<slow->next->data;
}

int main() {
    struct Node* head = NULL;
    push(&head, 20);
    push(&head, 4);
    push(&head, 15);
    push(&head, 10);
    push(&head, 25);
    
    findMiddle(&head);
	return 0;
}