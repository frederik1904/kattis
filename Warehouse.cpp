#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

struct nameValue {
    int amount = 0;
    string name;

} ;

bool compareName(const nameValue &a, const nameValue &b) {
    if (a.amount == b.amount) {
        int minLen = a.name.length() < b.name.length() ? 
                                a.name.length() : b.name.length();
        
        for (int i = 0; i < minLen; i++) {
            if (a.name.at(i) != b.name.at(i)) {
                return a.name.at(i) < b.name.at(i);
            }
        }
        return a.name.length() < b.name.length();
    } else {
        return a.amount > b.amount;
    }
}

int main(int argc, char *argv[]) {
    int testCases, products, value;
    string str;
    cin >> testCases;

    for (int j = 0; j < testCases; j++) {
        vector<nameValue> names;
        cin >> products;

        for (int k = 0; k < products; k++) {
            cin >> str >> value;
            bool found = false;

            for (int i = 0; i < names.size(); i++) {
                if (names.at(i).name.compare(str) == 0) {
                    names.at(i).amount += value;
                    found = true;
                    break;
                }
            }
            if (!found) {
                nameValue n;
                n.name = str;
                n.amount = value;

                names.push_back(n);
            }
        }

        sort(names.begin(), names.end(), compareName);
        cout << names.size() << endl;
        for (int i = 0; i < names.size(); i++) {
            cout << names.at(i).name << " " << names.at(i).amount << endl;
        }
    }
} 