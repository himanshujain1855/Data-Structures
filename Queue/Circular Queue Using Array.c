/*Thanks To Geeks For Geeks For Easy Explanation
*/
        #include<stdio.h>
        // queue capacity is 3
        #define MAX 3
        int queue[MAX];
        int rear = -1;
        int front = -1;

        int enqueue(int value)
        {
            //  condition if queue is full

            if(( rear+1 ) % MAX == front)
                printf("OverFlow");

            // condition for empty or adding element first time
            else if(front==-1)
            {
                front=0;
                rear=0;
                queue[rear]=value;
            }
            // Normal
            else
            {
                rear = (rear+1)%MAX;
                queue[rear]=value;
            }

        }

        int dequeue()
        {
            if(front==-1)
             printf("UnderFlow");

            // deleting last element
            else if(front==rear)
            {
                front=-1;
                rear=-1;
            }
            // Normal
            else
            {
                front = (front+1) % MAX;
            }

        }

        void display()
        {
                int i=0;
                if(front==-1)
                    printf("UnderFlow");
                // Normal Condition
                else if(rear>=front)
                {
                    for(i=front;i<=rear;i++)
                        printf("%d ",queue[i]);
                }
                // But What if Front>rear ..
                else
                {
                    for(i=front;i<MAX;i++)
                     printf("%d",queue[i]);
                    for(i=0;i<=rear;i++)
                         printf("%d ",queue[i]);
                }
        }


        int main()
        {
            int count = 0;
                int running = 1;
                int choice;
                printf("\n------------------------------------------------Welcome To Circular queue Implementation Using An queueay-------------------------------------------------------------\n");
                    printf("Please Select Which Operation Do You Want?\n");
                    printf("1. Insert\n");
                    printf("2. Delete\n");
                    printf("3. Display\n");
                    printf("4. Exit ");

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
                                enqueue(value);
                                break;
                            }

                        case 2:
                           dequeue();
                           break;

                        case 3:
                            display();
                            break;

                        case 4:
                            running = 0;
                            break;
                    }
                    count++;
                }
        }
