#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[])
{
    int n;
    scanf("%d", &n);
    int res = 1;
    int tmp = 1;
    while (n > tmp) {
        res++;
        tmp <<= 1;
    }
    printf("%d", res);
    /* code */
    return 0;
}
