#include <iostream>
#include <bits/stdc++.h>
using namespace std;

struct Node{
    int data;
    Node* next;
    
};

void segregateEvenAndOdd(Node** head){
    Node* curr = *head;
    Node* prev = NULL;
    Node* end = NULL;
    int len = 0;
    while(curr != NULL){
        if(curr->data % 2 == 0){
            end = curr;
        }
        
        curr = curr->next;
        len++;
    }
    int count = 0;
    curr = *head;
    
    while(count < len-1){
        if(curr->data % 2 == 1 && curr == *head){
            *head = curr->next;
            Node* tempNext = end->next;
            curr->next = tempNext;
            end->next = curr;
            end = end->next;
            curr = *head;
        }
        else if(curr->data % 2 == 1){
            prev->next = curr->next;
            Node* tempNext = end->next;
            curr->next = tempNext;
            end->next = curr;
            end = end->next;
            curr = prev->next;
        }
        else{
            prev = curr;
            curr = curr->next;
            
        }

        count++;
    }
    //cout << end->data << " " << len;
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
    push(&head, 5);
    push(&head, 4);
    push(&head, 3);
    push(&head, 2);
    push(&head, 1);
    push(&head, 0);
    
    printList(head);
    segregateEvenAndOdd(&head);
    printList(head);
   
    
    return 0;
}
