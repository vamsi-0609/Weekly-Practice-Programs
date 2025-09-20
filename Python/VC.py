#Counting the vowels and consonants in a string
string = input("Enter the string")
vowel_list = ['a', 'e', 'i', 'o', 'u']
vowels = 0
consonants = 0

for i in string:
    if i in vowel_list:
        vowels += 1
    else:
        consonants += 1

print(f"Vowels: {vowels} \nConsonants: {consonants}")