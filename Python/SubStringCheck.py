def substring(text, pattern):
    n = len(text)
    m = len(pattern)
    for i in range(n-m):
        match = True
        for j in range(m):
            if text[i+j] != pattern[j]:
                match = False
                break
        if match:
            return True

    return False

if __name__ == "__main__":
    text = input("Enter the main text: ")
    pattern = input("Enter the pattern: ")

    if substring(text,pattern):
        print("The text contains the sub string")
    else:
        print("The text doesn't contains sub string")