/*
 * SLL Using Recursive Method.c
 */

#include <stdio.h>
#include <stdlib.h>
#include <malloc.h>

// node
struct node
{
    int data;
    struct node *next;
};

// Globals
struct node *start;
static int list_length=0;
// for reversing
struct node *next,*prev;

// Function Definitions

/*
 * Function: *getNewNode(int value)
 * ----------------------------
 * value: value will be assigned to the data value in the node
 *
 * returns: new_node of type struct node*
 */

struct node *getNewNode(int value)  /* You can write too "struct node* getNewNode(int value)"*/
{
    struct node *new_node = (struct node*)malloc(sizeof(struct node));
    new_node->data = value;
    new_node->next = NULL;
    return new_node;
}

void insertAtBegin(int value)
{
    // getting new node
    struct node *new_node = getNewNode(value);
    // if list is not empty then.....
    if(start!=NULL) new_node->next = start; // we can eliminate this line by writing new_node->next = start; instead of writing new_node->next = NULL; but i kept it for better understanding!

    start = new_node;
}

void insertAtEnd(int value)
{
    // getting new node
    struct node *new_node = getNewNode(value);

    if(start==NULL)
    {
      start = new_node;
    }

    else
    {
      struct node *temp = start;
        while(temp -> next!= NULL)
        {
            temp = temp -> next;
        }
        temp->next = new_node;
    }

}

void insertAtNth(int position,int value)
{
    // getting new node
    struct node *new_node = getNewNode(value);

    int i;
    struct node *temp = start;
        if(start == NULL)
            start = new_node;

            // This loop points to the second last position for given number
        for(i=1;i<position-1;i++)
            temp = temp -> next;

         new_node->next = temp -> next;
         temp -> next = new_node;

}

int deleteAtBegin()
{
    // if list is empty then....
    if(start==NULL)
        return 0;
    struct node *temp;
    temp = start->next;
    start->next = NULL;
    start = temp;
}
int deleteAtEnd()
{
        struct node *temp = start;

        // if list is empty then....
        if(start==NULL)
            return 0;
        while(temp -> next -> next!= NULL) // Mistake I write only  temp -> next!= NULL!
        {
            temp = temp -> next;
        }
        temp->next = NULL;
        free(temp->next);
}
void deleteAtNth(int position)
{
    struct node *temp = start;
    int i;
        if(start == NULL)
            return;

        for(i=1;i<position-1;i++)
            temp = temp -> next;

        temp->next=temp->next->next;


}

void printListForword(struct node *temp ) // Recursive
{
    if(temp) // if(temp!=NULL) then
    {
        printf("%d ",temp->data);
        printListForword(temp->next);
    }
}

// Benefits of the Recursion
void printListReverse(struct node *temp) // Recursive
{
    if(temp) // if(temp!=NULL) then
    {
        printListReverse(temp->next);
        printf("%d ",temp->data);
    }
}

int printLength(struct node *temp)  // Recursive
{
    if(temp)
    {
        list_length++;
        printLength(temp->next);
    }
}

void reverseList(struct node *current)
{
    if(current)
        {
            next = current->next;
            current->next = prev;
            prev = current;
            current = next;
            reverseList(current);
        }
}

// Driver Program
int main()
{
        start = NULL;
        int count = 0;
        int running = 1;
        int choice;
        printf("\n------------------------------------------------Welcome To Single LinkedList Implementation Using Recursive Method-------------------------------------------------------------\n");
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
            printf("10. Reverse The List\n");
            printf("11. Exit ");

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
                    printListForword(start);
                    printf("\n");
                    break;
                case 8:
                    printListReverse(start);
                    printf("\n");
                    break;
                case 9:
                    printLength(start);
                    printf("%d",list_length);
                    printf("\n");
                    break;
                case 10:
                    reverseList(start);
                    start = prev;
                    break;
                case 11:
                    running = 0;
                    break;
                default:
                    running = 0;
                    break;
            }
            count++;
        }
}
