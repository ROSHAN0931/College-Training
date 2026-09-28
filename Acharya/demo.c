#include<stdio.h>
#include<stdlib.h>

struct Node{
    int data;
    struct Node *next;
};

int main(){
    //create nodes
    struct Node *head;
    struct Node *second;
    struct Node *third;
    //create memory for each node
    head = (struct Node *)malloc(sizeof(struct Node));
    second = (struct Node *)malloc(sizeof(struct Node));
    third = (struct Node *)malloc(sizeof(struct Node));
    //store data
    head->data = 10;
    second->data = 25;
    third->data = 7;
    //make connections
    head->next = second;
    second->next = third;
    third->next = NULL;
    
    struct Node *temp = head;
    int key = 25;
    while (temp != NULL)
    {
        if (temp->data == key)
        {
            printf("Element Found");
            return 0;
        }
        temp = temp->next;
    }
    printf("Element Not Found");
}