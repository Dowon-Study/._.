
my_str = input()

count = [ 0 for _ in range(0,26)]

for i in my_str:
    if(ord(i) < 91):
        count[ord(i) - 65] += 1
    else:
        count[ord(i) - 97] += 1

max_value = max(count)
max_index = count.index(max_value)

count.sort()

if(count[25] == count[24]):
    print("?")
else:
    print(chr(65 + max_index))

