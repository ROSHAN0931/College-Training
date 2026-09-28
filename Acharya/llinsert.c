#include<stdio.h>
#include<stdlib.h>

struct Node{
    int data;
    struct Node *next;
};

struct Node *createNode(int value){
    struct Node *newnode = malloc(sizeof(struct Node));
    newnode->data = value;//10
    newnode->next = NULL;//null
    return newnode;
}

struct Node *insertFront(struct Node *head,int value){
    struct Node *newnode = createNode(value);
    newnode->next = head;
    head = newnode;
    return head;
}

struct Node *insertBack(struct Node *head,int value){
    struct Node *newnode = createNode(value); // 10,null 
    if (head == NULL)
    {
        head = newnode;
    }
    else{
        struct Node *temp = head;
        while (temp->next != NULL)
        {
            temp = temp->next;
        }
        temp->next = newnode;
    }
    return head;
}

struct Node *display(struct Node *head){
    struct Node *temp = head;
    while (temp != NULL)
    {
        printf("%d -> ",temp->data);
        temp = temp->next;
    }
    printf("NULL");
}

int main(){
    struct Node *head = NULL;
    struct Node *temp;
    int n,value;
    printf("Enter the number of nodes : \n");
    scanf("%d",&n); // 3
    for(int i=0;i<n;i++){
        printf("Enter the value : \n");
        scanf("%d",&value);//10
        head = insertBack(head,value);
    }
    head = insertFront(head,6);
    display(head);
}