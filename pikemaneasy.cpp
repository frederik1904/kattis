#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int comp(const void *p, const void *q) {
  int *a = (int *) p;
  int *b = (int *) q;
  return *a - *b;
}

int main(int argc, char const *argv[])
{
    long long N, T, A, B, C, penalty = 0, time = 0, solved = 0;
    long tj[10000];

    cin >> N >> T >> A >> B >> C >> tj[0];
    for (int i = 1; i < N; i++) {
        tj[i] = (A * tj[i-1] + B) % C + 1;
    }
    qsort(tj, N, sizeof(long), comp);

    for (int i = 0; i < N; i++){
        if (time + tj[i] <= T) {
            penalty = (penalty + tj[i] + time) % 1000000007;
            time += tj[i];
            solved++;
        } else {
            break;
        }
    }

    cout << solved << " " << penalty << endl;

    return 0;
}
