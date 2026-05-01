#include <iostream>
using namespace std;

int main() {
  for (int i = 1; i <= 5; i++) {
    for (int j = 2; j <= i; j++) {
      cout << " *";
    }
    cout << "\n";
  }

  for (int i = 1; i <= 5; i++) {
    for (int j = 5; j >= i; j--) {
      cout << " *";
    }
    cout << "\n";
  }
}