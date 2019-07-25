#include "iostream"
#include "vector"
#include "algorithm"
using namespace std;

int main(int argc, const char** argv) {
    long n;
    cin >> n;
    vector<long long> c(n);

    for (int i = 0; i < n; i++) {   
        cin >> c[i];
    }
    
    sort(c.begin(), c.end());

    int index = 0;

    for (int i = c.size() - 1; i >= 0; i--)
    {
        if (c[i] >= c.size() - i && (i -1 < 0 || c[i-1] <= c.size() -i)) 
        {
            index = c.size() - i;
        }
    }

    cout << index << endl;
    return 0;
}