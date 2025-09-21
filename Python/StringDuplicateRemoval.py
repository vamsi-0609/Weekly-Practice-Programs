String = input("Enter the string: ")
result = ""
for i in String:
    if i not in result:
        result += i

print(result)