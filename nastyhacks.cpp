#include "iostream"
using namespace std;

int main(int argc, char const *argv[])
{
    long long n, r, e, c;
    cin >> n;

    while (n != 0) {
        cin >> r >> e >> c;

        e = e - c;

        if (e == r) 
        {
            cout << "does not matter" << endl;
        } 
        else if (e < r)
        {
            cout << "do not advertise" << endl;
        }
        else
        {
            cout << "advertise" << endl;
        }
        n--;
    }
    return 0;
}
