array = list(map(int, input().split()))

print("Array Before Sorting: ")
print(array)

for i in range(len(array)-1):
    for j in range(len(array)-i-1):
        if array[j] > array[j+1]:
            array[j], array[j+1] = array[j+1], array[j]


print("Array After applying Bubble Sort: ")
print(array)
