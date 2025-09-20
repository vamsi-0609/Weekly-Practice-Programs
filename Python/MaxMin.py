List = list(map(int, input().split()))

Min = float('inf')
Max = float('-inf')
sum = 0

for num in range(len(List)):

    if List[num] > Max:
        Max = List[num]
    if List[num] < Min:
        Min = List[num]
    sum += List[num]

print(Min, Max, sum / len(List))