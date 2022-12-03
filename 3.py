

from commons import getfile


lines = getfile(3)

# print(ord('b')-96)
# print(ord('B')-38)

score = 0
score2 = 0

group = {}


def calc_score(str):
    if str.islower():
        return ord(str)-96
    else:
        return ord(str)-38


for (index, line) in enumerate(lines):
    middle = int(len(line)/2)
    first = {a: True for a in line[0:middle]}
    second = {b: True for b in line[middle:int(len(line)+1)]}
    intersect = [x for x in first if x in second][0]
    score+= calc_score(intersect[0])
    if index % 3 == 0:
        group = {a: True for a in line}
    group = {a: True for a in line if a in group}

    if index %3 ==2:
        score2 += calc_score([x for x in group][0])
    


print(score)
print(score2)