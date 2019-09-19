#include <stdio.h>
#include <stdlib.h>
#include <malloc.h>

struct node
{
    int data;
    struct node *next;
};

// Global
struct node *head;

// Function Definitions

void insertAtEnd(int value)
{
    // node creating.....
    struct node *new_node = (struct node*)malloc(sizeof(struct node));
    new_node->data = value;
    new_node->next = NULL;

    if(head==NULL)
    {
      head = new_node;
    }

    else
    {
      struct node *temp = head;
        while(temp -> next!= NULL)
        {
            temp = temp -> next;
        }
        temp->next = new_node;
    }

}

void deleteAtEnd()
{
        struct node *temp = head;

        // if list is empty then....
        if(head==NULL)
            return 0;
        while(temp -> next -> next!= NULL) // Mistake I write only  temp -> next!= NULL!
        {
            temp = temp -> next;
        }
        temp->next = NULL;
}

void printList()
{
    struct node *temp = head;
    printf("List Is:");

    // Traversing the List
    while(temp != NULL)
    {
        printf("%d ",temp->data);
        temp = temp -> next;
    }
    printf("\n");
}

int printLength()
{
    struct node *temp = head;
    int i=0;

    // Traversing the List
    while(temp != NULL)
    {
      i++;
      temp = temp -> next;
    }
    printf("%d\n",i);

}

