#include <stdio.h>
#include <stdlib.h>

enum DIR{left, up, right, down};

int** createArray(int size) {
    int **arr = (int **)malloc(size * sizeof(int *));
    for (int i = 0; i < size; i++)
         arr[i] = (int *) malloc(size * sizeof(int));

    return arr;
}


int** RotateMatrix(int **matrix, int n) {
    int **ret = createArray(n);

    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < n; ++j) {
            ret[i][j] = matrix[n - j - 1][i];
        }
    }

    return ret;
}

int main(int argc, char const *argv[])
{
    int **field = createArray(4);
    for (int i = 0; i < 4; i++) {
        scanf("%d%d%d%d", &field[i][0], &field[i][1], &field[i][2], &field[i][3]);
    }

    int direction;
    scanf("%d", &direction);
    int rotations;
    switch (direction)
    {
    case left:
        rotations = 0;
        break;
    case right:
        rotations = 2;
        break;
    case down:
        rotations = 1;
        break;
    case up:
        rotations = 3;
        break;
    default:
        break;
    }
    for (int i = 0; i < rotations; ++i) {
        field = RotateMatrix(field, 4);
    }
    

    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 3; j++) {
            int tmpj = j + 1;
            while(tmpj < 4) {
                if (field[i][j] == field[i][tmpj]) {
                    field[i][j] = field[i][j] << 1;
                    field[i][tmpj] = 0;
                    break;
                } else if (field[i][tmpj] != 0) {
                    break;
                }
                tmpj++;
            }
        }
    }

    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            if (field[i][j] == 0) {
                int tmpj = j + 1;
                while(tmpj < 4) {
                    if (field[i][tmpj] != 0) {
                        field[i][j] = field[i][tmpj];
                        field[i][tmpj] = 0;
                        break;
                    }
                    tmpj++;
                }
            }
            
        }
    }

    for (int i = 0; i < 4 - rotations; ++i) {
        field = RotateMatrix(field, 4);
    }
    
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            printf("%d ", field[i][j]);
        }
        printf("\n");
    }

    /* code */
    return 0;
}
