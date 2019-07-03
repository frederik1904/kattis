import sys

tmp = input().split(" ")

a = int(tmp[0])
b = int(tmp[1])

arr = [0] * (a + b + 1)
for i in range(1, a):
    for j in range (1, b):
        sum =i + j
        arr[sum] += 1

max = 0
result = [-1] * (a + b + 1)
for i in range (1, a+b):

    if arr[i] > max:
        for j in range(1, i):
            result[j] = -1
        max = arr[i]
        result[i] = 1
    elif arr[i] == max:
            result[i] = 1

for i in range(1, a + b):
    if result[i] != -1:
        print(f"{i + 1}")
