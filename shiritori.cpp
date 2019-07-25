#include "iostream"
#include "set"
#include "string"
using namespace std;

int main(int argc, char const *argv[])
{
    set<string> words;
    long long n;

    cin >> n;
    char lastChar;
    string word;
    cin >> word;
    lastChar = word.back();
    words.insert(word);

    bool won = false;

    for (int i = 1; i < n; i++) {
        cin >> word;
        if (words.count(word) == 0) {
            words.insert(word);

            if (word.front() == lastChar) {
                lastChar = word.back();
            } else {
                cout << "Player " << (i % 2 == 0 ? "1" : "2") << " lost" << endl;
                won = true;
                break;
            }
        } else {
            cout << "Player " << (i % 2 == 0 ? "1" : "2") << " lost" << endl;
            won = true;
            break;
        }
    }

    if (!won) {
        cout << "Fair Game" << endl;
    }

    return 0;
}
