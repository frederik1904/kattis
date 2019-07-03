#include <iostream>
using namespace std;

int main() {
    int temp = 0;
    for (int i = 0; i < 2; ++i) {
        cin >> temp;
        cout << 1 - temp << endl;
        
    }

    for (int i = 0; i < 3; ++i) {
        cin >> temp;
        cout << 2 - temp << endl;
    }

    cin >> temp;
    cout << 8 - temp << endl;

    return 0;
}