#include <iostream>
#include <bits/stdc++.h>
using namespace std;
struct Node{
    int data;
    Node* next;
};

void mergeLists(Node** head1, Node** head2){
    Node* curr1 = *head1;
    Node* curr2 = *head2;
    Node* next2 = NULL;
    Node* prev = NULL;
    while(curr2 != NULL){
        if(curr2->data < curr1->data && prev == NULL){
            next2 = curr2->next;
            curr2->next = curr1;
            *head1 = curr2;
            prev = curr2;
            curr2 = next2;
        }
        else if(curr2->data < curr1->data && curr2->data > prev->data){
            next2 = curr2->next;
            curr2->next = curr1;
            prev->next = curr2;
            prev = curr2;
            curr2 = next2;
        }
        else if(curr2->data > curr1->data && curr1->next == NULL){
            next2 = curr2->next;
            curr1->next = curr2;
            curr2 = next2;
            break;
            // prev = curr1;
            // curr1 = curr1->next;
            
        }
        else{
            prev = curr1;
            curr1 = curr1->next;
        }
    }
    
    
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
    // push(&head, 30);
    // push(&head, 24);
    push(&head, 20);
    push(&head, 6);
    push(&head, 2);
    
    struct Node* head1 = NULL;
    push(&head1, 30);
    push(&head1, 21);
    push(&head1, 10);
    push(&head1, 5);
    push(&head1, 1);
    
    printList(&head);
    printList(&head1);
 
    mergeLists(&head,&head1);
    printList(&head);
    printList(&head1);
    
	return 0;
}