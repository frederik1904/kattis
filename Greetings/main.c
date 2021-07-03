#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[])
{
    char string[1000];

    scanf("%s", &string);
    printf("h");
    for (int i = 1; i < 1000; i++) {
        if (string[i] == 'e') {
            printf("ee");
        } else {
            break;
        }
    }
    printf("y");

    /* code */
    return 0;
}
