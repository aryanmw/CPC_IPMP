#include <iostream>
#include <bits/stdc++.h>
using namespace std;

struct Node{
    char data;
    Node* next;
    
};



void push(Node** head, char data)
{
    struct Node* new_node = new Node();
    new_node->data = data;
    new_node->next = *head;
    
    *head = new_node;
}

    
    void printList(Node* head){
    Node* curr = head;
    while(curr != NULL){
        cout<<curr->data<<" ";
        curr = curr->next;
    }
    cout << "\n";
}

bool isVowel(char c){
    return(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
}
void segregateVowelsAndConso(Node** head){
    Node* start = NULL;
    Node* curr = *head;
    Node* prev = NULL;
    
    if(isVowel(curr->data)){
        start = curr;
        curr = curr->next;
    }
    
    while(curr != NULL){
        if(isVowel(curr->data) && start == NULL){
            prev->next = curr->next;
            curr->next = prev;
            *head = curr;
            start = curr;
            curr = prev->next;
        }
        else if(isVowel(curr->data)){
            prev->next = curr->next;
            Node* temp = start->next;
            curr->next = temp;
            start->next = curr;
            curr = prev->next;
            start = start->next;
        }
        
        else{
            prev = curr;
            curr = curr->next;
        }
    }
}


int main() {
    struct Node* head = NULL;
    push(&head, 'c');
    push(&head, 'i');
    push(&head, 'e');
    push(&head, 'b');
    push(&head, 'a');
    
    
    
    printList(head);
    
    segregateVowelsAndConso(&head);
    
    printList(head);
    
    return 0;
}
