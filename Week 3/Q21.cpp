#include <iostream>
#include <bits/stdc++.h>
using namespace std;

struct Node{
    int data;
    Node* next;
    
};

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

void alternateSplit(Node** head, Node** a, Node** b){
    int count = 0;
    Node* curr = *head;
    Node* l1 = *a;
    Node* l2 = *b;
    
    //cout << l1 << " "<<l2;
    
    while(curr != NULL){
        if(count %2 == 0){
            if(l1 == NULL){
                
                Node* temp = curr->next;
                l1 = curr;
                l1->next = NULL;
                *a = l1;
                curr = temp;
            }
            else{
                
                Node* temp = curr->next;
                l1->next = curr;
                l1 = l1->next;
                l1->next = NULL;
                curr = temp;
            }
        }
        else{
            if(l2 == NULL){
                
                Node* temp = curr->next;
                l2 = curr;
                l2->next = NULL;
                *b = l2;
                curr = temp;
            }
            else{
                
                Node* temp = curr->next;
                l2->next = curr;
                l2 = l2->next;
                l2->next = NULL;
                curr = temp;
            }
        }
        
        count++;
    }
}



int main() {
    struct Node* head = NULL;
    push(&head, 5);
    push(&head, 4);
    push(&head, 3);
    push(&head, 2);
    push(&head, 1);
    push(&head, 0);
    
    struct Node* a = NULL;
    struct Node* b = NULL;
    
    alternateSplit(&head,&a,&b);
    printList(a);
    
    printList(b);
    
    printList(head);
   
    
    return 0;
}
