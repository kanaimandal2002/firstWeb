#include <iostream>
using namespace std;

int main() {
    char op;
    double a, b;
    cout << "Enter expression (e.g. 2 + 3): ";
    cin >> a >> op >> b;

    switch(op) {
        case '+': cout << a + b; break;
        case '-': cout << a - b; break;
        case '*': cout << a * b; break;
        case '/': cout << a / b; break;
        default: cout << "Invalid operator";
    }

    return 0;
}
