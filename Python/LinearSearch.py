array = list(map(int, input("Enter the space separated elements: ").split()))
num = int(input("Enter the number to find index : "))
flag = True
for i in range(len(array)):
    if num == array[i]:
        print(f"Element {num} found at index {i}")
        flag = False
        break

if flag:
    print("Element {num} is not found in the array")
