#include <iostream>
#include <math.h>
using namespace std;

int main() {
    long a, b;

    while (cin >> a >> b) {
        cout << abs(a - b) << endl;
    }
    return 0;
}