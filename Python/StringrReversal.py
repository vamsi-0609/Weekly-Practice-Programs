string = input("Enter the string to reverse: ")
for i in range(len(string)-1, -1, -1):
    print(string[i], end = "")