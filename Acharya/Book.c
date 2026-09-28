/*
Experiment 1:-

Implement the Linear data structures for organizing and performing various operations on data stored.

1.Create a Book structure and display one book's details.
2.Store details of N books using an array of structures.
3.Dynamically allocate memory for N books using malloc().
4.Display all books using a function.
5.Search a book using Book ID.
6.Search a book using Book Title.
7.Implement Issue Book operation.
8.Implement Return Book operation.
9.Count the number of available books.
10.Create a menu-driven Book Management System using struct, malloc(), functions, and free().
*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct Book
{
    int id;
    char title[50];
    char author[50];
    float price;
    int available;
};


/* Function to display all books */
void displayBooks(struct Book *books, int n)
{
    int i;

    printf("\n========== BOOK DETAILS ==========\n");

    for(i = 0; i < n; i++)
    {
        printf("\nBook %d\n", i + 1);

        printf("Book ID     : %d\n", books[i].id);
        printf("Title       : %s\n", books[i].title);
        printf("Author      : %s\n", books[i].author);
        printf("Price       : %.2f\n", books[i].price);

        if(books[i].available == 1)
        {
            printf("Status      : Available\n");
        }
        else
        {
            printf("Status      : Issued\n");
        }
    }
}


/* Function to search a book */
void searchBook(struct Book *books, int n)
{
    int id;
    int i;
    int found = 0;

    printf("\nEnter Book ID to search: ");
    scanf("%d", &id);

    for(i = 0; i < n; i++)
    {
        if(books[i].id == id)
        {
            printf("\nBook Found!\n");

            printf("Book ID     : %d\n", books[i].id);
            printf("Title       : %s\n", books[i].title);
            printf("Author      : %s\n", books[i].author);
            printf("Price       : %.2f\n", books[i].price);

            if(books[i].available == 1)
            {
                printf("Status      : Available\n");
            }
            else
            {
                printf("Status      : Issued\n");
            }

            found = 1;
            break;
        }
    }

    if(found == 0)
    {
        printf("\nBook not found.\n");
    }
}


/* Function to issue a book */
void issueBook(struct Book *books, int n)
{
    int id;
    int i;
    int found = 0;

    printf("\nEnter Book ID to issue: ");
    scanf("%d", &id);

    for(i = 0; i < n; i++)
    {
        if(books[i].id == id)
        {
            found = 1;

            if(books[i].available == 1)
            {
                books[i].available = 0;

                printf("\nBook issued successfully.\n");
            }
            else
            {
                printf("\nBook is already issued.\n");
            }

            break;
        }
    }

    if(found == 0)
    {
        printf("\nBook not found.\n");
    }
}


/* Function to return a book */
void returnBook(struct Book *books, int n)
{
    int id;
    int i;
    int found = 0;

    printf("\nEnter Book ID to return: ");
    scanf("%d", &id);

    for(i = 0; i < n; i++)
    {
        if(books[i].id == id)
        {
            found = 1;

            if(books[i].available == 0)
            {
                books[i].available = 1;

                printf("\nBook returned successfully.\n");
            }
            else
            {
                printf("\nBook is already available.\n");
            }

            break;
        }
    }

    if(found == 0)
    {
        printf("\nBook not found.\n");
    }
}


/* Main function */
int main()
{
    struct Book *books;

    int n;
    int i;
    int choice;

    printf("Enter number of books: ");
    scanf("%d", &n);

    /* Dynamic memory allocation */
    books = (struct Book *)malloc(n * sizeof(struct Book));

    if(books == NULL)
    {
        printf("Memory allocation failed.\n");
        return 1;
    }

    /* Input book details */
    printf("\nEnter Book Details:\n");

    for(i = 0; i < n; i++)
    {
        printf("\nBook %d\n", i + 1);

        printf("Enter Book ID: ");
        scanf("%d", &books[i].id);

        printf("Enter Book Title: ");
        scanf(" %[^\n]", books[i].title);

        printf("Enter Author Name: ");
        scanf(" %[^\n]", books[i].author);

        printf("Enter Price: ");
        scanf("%f", &books[i].price);

        /* Initially book is available */
        books[i].available = 1;
    }


    /* Menu */
    do
    {
        printf("\n\n========== BOOK MANAGEMENT SYSTEM ==========\n");

        printf("1. Display Books\n");
        printf("2. Search Book\n");
        printf("3. Issue Book\n");
        printf("4. Return Book\n");
        printf("5. Exit\n");

        printf("Enter your choice: ");
        scanf("%d", &choice);


        switch(choice)
        {
            case 1:
                displayBooks(books, n);
                break;

            case 2:
                searchBook(books, n);
                break;

            case 3:
                issueBook(books, n);
                break;

            case 4:
                returnBook(books, n);
                break;

            case 5:
                printf("\nThank you!\n");
                break;

            default:
                printf("\nInvalid choice.\n");
        }

    } while(choice != 5);


    /* Free allocated memory */
    free(books);

    return 0;
}
