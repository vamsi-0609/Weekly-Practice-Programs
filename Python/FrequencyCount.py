"""
Problem statement:
    Given array = [ 1,2,3,4,2,3,1,5,6,7,3,4]
    output:
        1 -> 2
        2 -> 2
        3 -> 3
        4 -> 2
        5 -> 1
        6 -> 1
        7 -> 1
"""


List = list(map(int, input().split()))
freq = {}
for i in List:
    if i not in freq:
        freq[i] = 1
    else:
        freq[i] += 1

for i, j in freq.items():
    print(f"{i} -> {j}")
