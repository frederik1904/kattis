#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main(int argc, char const *argv[])
{
    int a,b,c,l;
    cin >> a >> b >> c >> l;
    bool found = false;

    for (int i = 0; ; i++) {
        int aLegs = i * a;
        if (aLegs > l) {
            break;
        }

        for (int j = 0; ; j++) {
            int bALegs = j * b + aLegs;
            if (bALegs > l) {

                break;
            }

            for (int k = 0; ; k++) {
                if ((bALegs + (k * c)) == l) {
                    cout << i << " " << j << " " << k << endl;
                    found = true;
                    break;
                } else if ((bALegs + (k * c)) > l) {
                    break;
                }
            }
        }
    }

    if (!found) {
        cout << "impossible" << endl;
    }
    /* code */
    return 0;
}
