String = input("Enter the string to count the frequency of the characters: ").lower()
freq = {}
for i in String:
    if i not in freq:
        freq[i] = 1
    else:
        freq[i] += 1

print(freq)