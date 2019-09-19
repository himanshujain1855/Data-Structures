#include <stdio.h>
#include <stdlib.h>
#include <malloc.h>

struct node
{
    int data;
    struct node *next;
    struct node *prev;
};

// Global
struct node *head;
static int i = 0;

// Function Definitions

struct node* getNewNode(int value)
{
    struct node *new_node = (struct node*)malloc(sizeof(struct node));
    new_node->data = value;
    new_node->next = NULL;
    new_node->prev = NULL;
    return new_node;
}

int insertAtBegin(int value)
{
    // node creating
    struct node *new_node = getNewNode(value);
    // if list is empty then.....
    if(head==NULL)
    {
        head = new_node;
        return 1;
    }
    // if list is not empty then.....
    new_node->next=head;
    head->prev=new_node;
    head = new_node;
}

int insertAtEnd(int value)
{
    // node creating.....
    struct node *new_node = getNewNode(value);

    // if list is empty then.....
    if(head==NULL)
    {
        head = new_node;
        return 1;
    }

    struct node *temp = head;
        while(temp -> next!= NULL)
        {
            temp = temp -> next;
        }
        temp->next = new_node;
        new_node->prev=temp;

}

int insertAtNth(int position,int value)
{
    // node creating.....
    int i;
    struct node *new_node = getNewNode(value);
    struct node *temp = head;

        if(head == NULL)
        {
            head = new_node;
            return 1;
        }

        // This loop points to the second last position for given number
        for(i=1;i<position-1;i++)
            temp = temp -> next;

         // setting next and previous nodes
         new_node->next = temp -> next;
         temp->next->prev=new_node;
         temp -> next = new_node;
         new_node->prev=temp;



}

int deleteAtBegin()
{
    // if list is empty then....
    if(head==NULL)
        return 0;
    struct node *temp;
    temp = head->next;
    head->next = NULL;
    head = temp;
    head->prev = NULL;
}

int deleteAtEnd()
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

void deleteAtNth(int position)
{
    struct node *temp = head;
    int i;
        if(head == NULL)
            return;

        // This loop points to the second last position for given number
        for(i=1;i<position-1;i++)
            temp = temp -> next;

        temp->next=temp->next->next;
        temp->next->prev=temp;

}

void printList(struct node *temp)
{
     if(temp) // if(temp!=NULL) then
    {
        printf("%d ",temp->data);
        printList(temp->next);
    }
}

// Printing(Traversing)
void printListReverse()
{
    struct node *temp = head;
    printf("Reverse List Is:");

    // going till the second last element-> next!=NULL in the List
    while(temp->next!= NULL)
        temp = temp -> next;
    // Printing element in reverse order from last to the first
    while(temp!=NULL)
    {
        printf("%d ",temp->data);
        temp=temp->prev;
    }
     printf("\n");
}

int printLength(struct node *temp)
{
    if(temp)
    {
        i++;
        printLength(temp->next);
    }
}

// Driver Program
int main()
{
        head = NULL;
        int count = 0;
        int running = 1;
        int choice;
        printf("\n------------------------------------------------Welcome To Doubly Linked List Implementation Using Iterative Method-------------------------------------------------------------\n");
            printf("Please Select Which Operation Do You Want?\n");
            printf("1. InsertAtBegin\n");
            printf("2. InsertAtEnd\n");
            printf("3. InsertAtNthPosition\n");
            printf("-------------------------\n");
            printf("4. DeleteAtBegin\n");
            printf("5. DeleteAtEnd\n");
            printf("6. DeleteAtNthPosition\n");
            printf("-------------------------\n");
            printf("7. Display Forward\n");
            printf("8. Display Reverse\n");
            printf("9. Length Of The List\n");
            printf("10. Exit ");

        while(running)
        {
            if(count != 0)
                printf("Please Select Which Operation Do You Want?");
            scanf("%d",&choice);

            switch(choice)
            {
                case 1:
                    {
                        int value;
                    printf("Enter Value");
                    scanf("%d",&value);
                    insertAtBegin(value);
                    }
                    break;

                case 2:
                   {
                        int value;
                    printf("Enter Value");
                    scanf("%d",&value);
                    insertAtEnd(value);
                    }
                    break;

                case 3:
                    {
                    int value,position;

                    printf("Enter Position");
                    scanf("%d",&position);

                     printf("Enter Value");
                    scanf("%d",&value);

                    insertAtNth(position, value);
                    }
                    break;
                case 4:
                     deleteAtBegin();
                    break;
                case 5:
                   deleteAtEnd();
                    break;
                case 6:
                     {
                    int position;

                    printf("Enter Position");
                    scanf("%d",&position);

                    deleteAtNth(position);
                    }

                    break;
                case 7:
                    printList(head);
                    printf("\n");
                    break;
                case 8:
                    printListReverse();
                    break;
                case 9:
                    printLength(head);
                    printf("%d",i);
                    printf("\n");
                    break;
                case 10:
                    running = 0;
                    break;
            }
            count++;
        }
}
