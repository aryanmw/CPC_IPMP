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

void findUnion(Node* head1, Node* head2, Node** unionHead, Node** interHead){
    Node* curr1 = head1;
    Node* curr2 = head2;
    unordered_map<int,int> myMap;
    while(curr1 != NULL){
        myMap[curr1->data]++;
        curr1 = curr1->next;
    }
    while(curr2 != NULL){
        myMap[curr2->data]++;
        curr2 = curr2->next;
    }
    Node* u = *unionHead;
    Node* in = *interHead;
    for(auto i : myMap){
        struct Node* new_node = new Node();
        new_node->data = i.first;
        if(i.second > 1){
            struct Node* new_node_in = new Node();
            new_node_in->data = i.first;
            if(in == NULL){
                *interHead = new_node_in;
                in = *interHead;
            }
            else{
                in->next = new_node_in;
                in = in->next;
            }
        }
        
        if(u == NULL){
            
            *unionHead = new_node;
            u = *unionHead;
        }
        else{
            u->next = new_node;
            u = u->next;
        }
    }
}

int main() {
	struct Node* head = NULL;
    push(&head, 20);
    push(&head, 4);
    push(&head, 15);
    push(&head, 10);
    
    struct Node* head1 = NULL;
    push(&head1, 10);
    push(&head1, 2);
    push(&head1, 4);
    push(&head1, 8);
    
    
    struct Node* a = NULL;
    struct Node* b = NULL;
    
    findUnion(head,head1,&union, &intersection);
    printList(union);
    printList(intersection);
	return 0;
}