import sys

while 1:

    string = list(sys.stdin.readline().rstrip('\n'))
    
    if not string:
        break

    result = [0] * 4
    for i in string:
        if 65 <= ord(i) <= 91:
            result[1] += 1
        elif 97 <= ord(i) <= 123:
            result[0] += 1
        elif 48 <= ord(i) <= 58:
            result[2] += 1
        else: 
            result[3] += 1

    print(*result)
