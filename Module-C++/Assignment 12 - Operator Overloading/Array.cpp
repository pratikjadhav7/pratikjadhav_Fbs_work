#include<iostream>
using namespace std;

class Array {
    int arr[5] = {10,20,30,40,50};

public:
    int operator[](int index) {
        return arr[index];
    }
};

int main() {

    Array a;

    cout << a[2];

    return 0;
}