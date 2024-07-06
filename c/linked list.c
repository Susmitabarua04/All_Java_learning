#include <stdio.h>
#include <stdlib.h>

// Node structure for the linked list
struct Node {
    int data;
    struct Node* next;
};

// Function to reverse a linked list
struct Node* reverseLinkedList(struct Node* head) {
    struct Node* prev = NULL;
    struct Node* current = head;
    struct Node* next = NULL;

    while (current != NULL) {
        next = current->next; // Save the next node
        current->next = prev; // Reverse the link
        prev = current; // Move prev to the current node
        current = next; // Move current to the next node
    }

    // The new head is the previous node (which was the last node in the original list)
    head = prev;

    return head;
}

// Function to print a linked list
void printLinkedList(struct Node* head) {
    while (head != NULL) {
        printf("%d ", head->data);
        head = head->next;
    }
    printf("\n");
}

int main() {
    // Creating a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
    struct Node* head = (struct Node*)malloc(sizeof(struct Node));
    head->data = 1;
    head->next = (struct Node*)malloc(sizeof(struct Node));
    head->next->data = 2;
    head->next->next = (struct Node*)malloc(sizeof(struct Node));
    head->next->next->data = 3;
    head->next->next->next = (struct Node*)malloc(sizeof(struct Node));
    head->next->next->next->data = 4;
    head->next->next->next->next = (struct Node*)malloc(sizeof(struct Node));
    head->next->next->next->next->data = 5;
    head->next->next->next->next->next = NULL;

    printf("Original linked list: ");
    printLinkedList(head);

    // Reverse the linked list
    head = reverseLinkedList(head);

    printf("Reversed linked list: ");
    printLinkedList(head);

    return 0;
}
