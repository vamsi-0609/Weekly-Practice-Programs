
def BinarySearch(array, ele):
    #if element is not found it will return 0
    left = 0
    right = len(array) - 1

    while left <= right:
        mid = (left + right) // 2

        if array[mid] == ele:
            return mid
        elif array[mid] < ele:
            left = mid + 1
        elif array[mid] > ele:
            right = mid - 1

    return -1

if __name__ == "__main__":

    array = [1,2,3,4,5,6,7,8,9]
    target = 9
    index = BinarySearch(array, target)
    if index == -1:
        print("Element is not found in the array")
    else:
        print(f"Element {target} is found at the index {index}")



