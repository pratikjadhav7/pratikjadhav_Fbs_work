#include <stdio.h>
#include <stdlib.h>
#include <string.h>
typedef struct Book {
  int id;
  char name[50];
  char author[50];
  char category[30];
  float price;
  float rating;
} Book;
Book *b;
int count = 0;
int capacity = 2;
int isDuplicateId(int id);
int isDuplicateName(char name[]);
////////////////////////////////////////////////////////////
void addBook() {
  if (count >= capacity) {
    capacity = capacity * 2;
    Book *b = (Book *)realloc(b, capacity * sizeof(Book));

    if (b == NULL) {
      printf("Memory Reallocation Failed!\n");
      return;
    }
  }

  int id;
  char name[50];
  printf("\n-------- Enter Book Details ---------\n");

  do {
    printf("\nEnter Book ID: ");
    scanf("%d", &id);

    if (isDuplicateId(id)) {
      printf("ID already exists! Try again.\n");
    }
  } while (isDuplicateId(id));

  b[count].id = id;

  do {
    printf("\nEnter Book Name: ");
    getchar();
    fgets(name, sizeof(name), stdin);
    name[strcspn(name, "\n")] = '\0';

    if (isDuplicateName(name)) {
      printf("Name already exists! Try again.\n");
    }
  } while (isDuplicateName(name));

  strcpy(b[count].name, name);

  printf("\nEnter Author Name:");
  fgets(b[count].author, sizeof(b[count].author), stdin);
  b[count].author[strcspn(b[count].author, "\n")] = '\0';

  printf("\nEnter Category:");
  fgets(b[count].category, sizeof(b[count].category), stdin);
  b[count].category[strcspn(b[count].category, "\n")] = '\0';

  do {
    printf("\nEnter Price: ");
    scanf("%f", &b[count].price);

    if (b[count].price <= 0) {
      printf("Price must be positive! Try again.\n");
    }
  } while (b[count].price <= 0);

  do {
    printf("\nEnter Book Rating (Out of 5) :");
    scanf("%f", &b[count].rating);

    if (b[count].rating > 5) {
      printf("Please Rate out of 5!");
    }
  } while (b[count].rating > 5);
  count++;
  printf("----Book Added Successfully----");
}
/////////////////////////////////////////////////////////////
void displayBooks() {
  printf("\n-----ALL BOOKS-----\n");
  for (int i = 0; i < count; i++) {
    printf(
        "\nID:%d | Name:%s | Author:%s | Category:%s | Price:%f | Rating:%f\n",
        b[i].id, b[i].name, b[i].author, b[i].category, b[i].price,
        b[i].rating);
  }
}
/////////////////////////////////////////////////////////////
void searchByID() {
  int id;
  int found = 0;
  printf("Enter Book ID:");
  scanf("%d", &id);

  for (int i = 0; i < count; i++) {
    if (b[i].id == id) {
      found = 1;
      printf("Found: %s by %s", b[i].name, b[i].author);
    }
  }
  if (found == 0)
    printf("Not Found");
}
///////////////////////////////////////////////////////////////
void searchByName() {
  char name[50];
  int found = 0;
  printf("Enter Book Name: ");
  getchar();
  fgets(name, sizeof(name), stdin);
  name[strcspn(name, "\n")] = '\0';

  for (int i = 0; i < count; i++) {
    if (strcasecmp(b[i].name, name) == 0) {
      found = 1;
      printf("Found: %s by %s", b[i].name, b[i].author);
    }
  }
  if (found == 0)
    printf("Not Found");
}
//////////////////////////////////////////////////////////
void removeBook() {
  int id;
  printf("Enter Book ID to delete: ");
  scanf("%d", &id);
  for (int i = 0; i < count; i++) {
    if (b[i].id == id) {
      for (int j = i; j < count - 1; j++) {
        b[j] = b[j + 1];
      }
      count--;
      printf("Book Deleted Successfully!\n");
      return;
    }
  }
  printf("Book Not Found\n");
}
/////////////////////////////////////////////////////////////
void updateBook() {
  int id;
  int found = 0;
  printf("Enter Book ID for Updating: ");
  scanf("%d", &id);

  for (int i = 0; i < count; i++) {
    if (b[i].id == id) {
      found = 1;
      printf("Enter New Price:");
      scanf("%f", &b[i].price);

      printf("Enter New Rating:");
      scanf("%f", &b[i].rating);

      printf("****** Updated Successfully! ******");
    }
  }
  if (found == 0)
    printf("Book Not Found!");
}
///////////////////////////////////////////////////////
void showAuthorBooks() {
  char author[50];
  int found = 0;
  printf("Enter Author Name: ");
  getchar();
  fgets(author, sizeof(author), stdin);
  author[strcspn(author, "\n")] = '\0';

  for (int i = 0; i < count; i++) {
    if (strcasecmp(b[i].author, author) == 0) {
      found = 1;
      printf("Book : %s", b[i].name);
    }
  }
  if (found == 0)
    printf("Book Not Found!");
}
/////////////////////////////////////////////////
void showCategoryBooks() {
  char cat[50];
  int found = 0;
  printf("Enter Category: ");
  getchar();
  fgets(cat, sizeof(cat), stdin);
  cat[strcspn(cat, "\n")] = '\0';

  for (int i = 0; i < count; i++) {
    if (strcasecmp(b[i].category, cat) == 0) {
      found = 1;
      printf("Book : %s", b[i].name);
    }
  }
  if (found == 0)
    printf("Book Not Found!");
}
////////////////////////////////////////////
void sortByPrice() {
  Book temp;
  for (int i = 0; i < count; i++) {
    for (int j = 0; j < count - 1; j++) {
      if (b[j].price > b[j + 1].price) {
        temp = b[j];
        b[j] = b[j + 1];
        b[j + 1] = temp;
      }
    }
  }
  printf("Sorted By Price:\n");
  for (int i = 0; i < count; i++) {
    printf("%s (%f)\n", b[i].name, b[i].price);
  }
}
/////////////////////////////////////////////
void sortByRating() {
  Book temp;
  for (int i = 0; i < count; i++) {
    for (int j = 0; j < count - 1; j++) {
      if (b[j].rating < b[j + 1].rating) {
        temp = b[j];
        b[j] = b[j + 1];
        b[j + 1] = temp;
      }
    }
  }
  printf("Sorted By Rating:\n");
  for (int i = 0; i < count; i++) {
    printf("%s (%f)\n", b[i].name, b[i].rating);
  }
}
int isDuplicateId(int id) {
  for (int i = 0; i < count; i++) {
    if (b[i].id == id) {
      return 1;
    }
  }
  return 0;
}

int isDuplicateName(char name[]) {
  for (int i = 0; i < count; i++) {
    if (strcasecmp(b[i].name, name) == 0) {
      return 1;
    }
  }
  return 0;
}
/////////////////////////////////////////////
int main() {
  int choice;
  b = (Book *)malloc(capacity * sizeof(Book));
  if (b == NULL) {
    printf("Memory Allocation Failed!\n");
    return 0;
  }

  do {
    printf("\n======BOOK MANAGEMENT SYSTEM======");
    printf("\n1. Add Book");
    printf("\n2. Remove Book");
    printf("\n3. Search by ID");
    printf("\n4. Search by Name");
    printf("\n5. Show Author Books");
    printf("\n6. Show category Books");
    printf("\n7. Update  Book");
    printf("\n8. Sort by Price");
    printf("\n9. Sort by Rating Book");
    printf("\n10. Display All");
    printf("\n0.  EXIT");
    printf("\nEnter Choice:");
    scanf("%d", &choice);

    switch (choice) {
    case 1:
      addBook();
      break;
    case 2:
      removeBook();
      break;
    case 3:
      searchByID();
      break;
    case 4:
      searchByName();
      break;
    case 5:
      showAuthorBooks();
      break;
    case 6:
      showCategoryBooks();
      break;
    case 7:
      updateBook();
      break;
    case 8:
      sortByPrice();
      break;
    case 9:
      sortByRating();
      break;
    case 10:
      displayBooks();
      break;
    case 0:
      printf("EXITING....");
      break;
    default:
      printf("Invalid Choice");
    }
  } while (choice != 0);
  free(b);
}
