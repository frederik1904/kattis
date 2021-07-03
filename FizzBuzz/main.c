#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char const *argv[])
{
    int X, Y, N;
    scanf("%d%d%d", &X, &Y, &N);

    for (int i = 1; i <= N; i++) {
        int tmpX = i % X;
        int tmpY = i % Y;
        if (!tmpX) {
            printf("Fizz");
        } 

        if(!tmpY) {
            printf("Buzz");
        }

        if(tmpX && tmpY) {
            printf("%d", i);
        }

        printf("\n");
    }
    /* code */
    return 0;
}
