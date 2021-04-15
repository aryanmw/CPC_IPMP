#include <iostream>
#include <bits/stdc++.h>
using namespace std;
struct Node{
    int data;
    Node* next;
};

void printNthFromLast(Node** head, int n)
{
    int len = 0, i;
    struct Node* temp = *head;

    while (temp != NULL) {
        temp = temp->next;
        len++;
    }
 
    
    if (len < n)
        return;
 
    temp = *head;
 
    
    for (i = 1; i < len - n + 1; i++)
        temp = temp->next;
 
    cout << temp->data;
 
    return;
}

void push(Node** head, int data)
{
    struct Node* new_node = new Node();
    new_node->data = data;
    new_node->next = *head;
    new_node->visited = 0;
    *head = new_node;
}

   
}
void printList(Node** head){
    Node* curr = *head;
    while(curr != NULL){
        cout<<curr->data<<" ";
        curr = curr->next;
    }
}
int main() {
    struct Node* head = NULL;
    push(&head, 20);
    push(&head, 4);
    push(&head, 15);
    push(&head, 10);
    push(&head, 25);
    
    printNthFromLast(head, 3);
	return 0;
}