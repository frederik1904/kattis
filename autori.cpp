#include <iostream>
#include <string>
#include <cstring>

using namespace std;
int main() {
    string s = "";
    cin >> s;

    const char *a = s.c_str();

    int l = s.length();

    string temp = "";

    for(int i = 0; i < l; i++) {
        if(isupper(a[i])) {
            temp += a[i];
        }
    }

    cout << temp << endl;
    return 0;
}