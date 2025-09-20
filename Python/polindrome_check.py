def palindrome_check(word):
    flag = True
    for i in range(len(word) // 2):
        if word[i] != word[len(word)-i -1]:
            flag = False
            break
    return flag


word = list(input("Enter the string: "))
if palindrome_check(word):
    print("palindrome")
else:
    print("Not a palindrome")
