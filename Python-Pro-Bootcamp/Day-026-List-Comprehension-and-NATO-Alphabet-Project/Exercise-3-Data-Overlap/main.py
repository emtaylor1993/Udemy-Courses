file_1 = []
file_2 = []

with open("file1.txt", "r") as f:
    lines = f.readlines()
    for line in lines:
        file_1.append(int(line))

with open("file2.txt", "r") as f:
    lines = f.readlines()
    for line in lines:
        file_2.append(int(line))

result = [num for num in file_1 if num in file_2]

# Write your code above 👆

print(result)
