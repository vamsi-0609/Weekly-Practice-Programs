class Math:
    def EvenOdd(self, num):
        return True if num % 2 == 0 else False
    def isprime(self, num):
        if num <=1:
            return False
        else:
            flag = True
            for i in range(2, int(num**0.5)+1):
                if num % i == 0:
                    flag = False
                    break
            return flag
    def factorial(self, num):
        val = 1
        for i in range(2, num+1):
            val *= i
        return val

if __name__ == "__main__":
    math = Math()
    print(" Choose the operation "
          " 1. EvenOdd"
          " 2. IsPrime"
          " 3. Factorial"
          " 4. Exit")

    choice = int(input("Enter the choice: "))
    while(choice < 5):
        if choice == 1:
            num = int(input("Enter the number: "))
            if math.EvenOdd(num):
                print(f"{num} is Even number")
            else:
                print(f"{num} is Odd number")
        elif choice == 2:
            num = int(input("Enter the number to check whether it is prime or not: "))
            if math.isprime(num):
                print(f"{num} is a Prime Number")
            else:
                print(f"{num} is not a Prime Number")
        elif choice == 3:
            num = int(input("Enter the number to get the factorial of it: "))
            print(f"The Factorial of {num} is {math.factorial(num)}")
        elif choice == 4:
            print("Exiting..")
            exit(1)
        choice  = int(input("Enter the choice of operation: "))




