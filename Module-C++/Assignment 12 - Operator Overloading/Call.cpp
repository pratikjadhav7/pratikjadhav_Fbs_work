#include<iostream>
using namespace std;

struct Demo {
    void operator()() {
        cout << "Function Call Operator";
    }
};

int main() {

    Demo d;

    d();

    return 0;
}