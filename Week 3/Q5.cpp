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
bool checkIfPalindrome(Node* head){
         
        
        Node* slow= head;
 
        
        stack <int> s;
        while(slow != NULL){
                s.push(slow->data);
                slow = slow->ptr;
        }
 
        
        while(head != NULL ){
            int i=s.top();
            s.pop();
            if(head -> data != i){
                return false;
            }
            head=head->ptr;
        }
 
        return true;
}

int main() {
    struct Node* head = NULL;
    push(&head, 20);
    push(&head, 4);
    push(&head, 15);
    push(&head, 4);
    push(&head, 20);
    
    bool check = checkIfPalindrome(head, 3);
	return 0;
}