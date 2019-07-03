#include <iostream>
using namespace std;

int main() {
    int nrOfTests;
    cin >> nrOfTests;

    for (int i = 0; i < nrOfTests; ++i) {
        __int128 sum = 0;
        int pp = 0;
        cin >> pp;

        for (int j = 0; j < pp; ++j) {
            long current = 0;
            cin >> current;
            sum += current;
        }
        if (sum % pp == 0) cout << "YES" << endl;
        else cout << "NO" << endl;
    }

    return 0;
}