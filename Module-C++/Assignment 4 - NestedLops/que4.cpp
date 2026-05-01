#include<iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter n: ";
    cin >> n;

    cout << "Perfect numbers till " << n << " are:\n";

    for(int num = 1; num <= n; num++) {
        int sum = 0;

        for(int i = 1; i <= num/2; i++) {
            if(num % i == 0) {
                sum += i;
            }
        }

        if(sum == num && num != 0) {
            cout << num << " ";
        }
    }

    return 0;
}