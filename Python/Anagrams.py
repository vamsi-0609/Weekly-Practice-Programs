import re
def areAnagrams(one, two):
    cleaned1 = list(re.sub("[^a-zA-Z]", "", one).lower())
    cleaned2 = list(re.sub("[^a-zA-Z]", "", two).lower())

    alpha = [0] * 26

    if len(cleaned1) != len(cleaned2):
        return False

    #increment the frequency count
    for i in range(len(cleaned1)):
        alpha[ord(cleaned1[i]) - ord('a')] += 1

    #Decrement the frequency count
    for j in range(len(cleaned2)):
        alpha[ord(cleaned2[j]) - ord('a')] -= 1

    for i in alpha:
        if i != 0:
            return False

    return True


if __name__ == "__main__":
    one = input("Enter the string 1: ")
    two = input("Enter the string 2: ")

    if areAnagrams(one, two):
        print("The two Strings are Anagrams")
    else:
        print("The two Strings are not Anagrams")


