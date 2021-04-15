#include <iostream>
#include <bits/stdc++.h>
using namespace std;

struct Node{
    int data;
    Node* next;
    int visited;
};

void findCommonElements(Node** head1, Node** head2){
    Node* curr1 = *head1;
    Node* curr2 = *head2;
    
    while(curr1 != NULL && curr2!=NULL){
        if(curr1->data > curr2->data){
            curr2 = curr2->next;
        }
        else if(curr1->data < curr2->data){
            curr1 = curr1->next;
        }
        else{
            cout << curr1->data << " ";
            curr2 = curr2->next;
            curr1 = curr1->next;
        }
    }
}
void push(Node** head, int data)
{
    struct Node* new_node = new Node();
    new_node->data = data;
    new_node->next = *head;
    new_node->visited = 0;
    *head = new_node;
}


int main() {
  struct Node* head = NULL;
    push(&head, 30);
    push(&head, 24);
    push(&head, 15);
    push(&head, 10);
    push(&head, 5);
    
    struct Node* head1 = NULL;
    //push(&head, 30);
    push(&head1, 30);
    push(&head1, 16);
    push(&head1, 10);
    push(&head1, 6);
    
    
    findCommonElements(&head,&head1);
    
    return 0;
}