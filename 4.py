
from commons import getfile


lines = getfile(4)


def to_set(str):
    split = str.split('-')
    left = split[0]
    right = split[1]
    return {x: True for x in range(int(left), int(right)+1)}


score = 0
score2 = 0
for line in lines:
    split_line = line.split(',')
    left = to_set(split_line[0])
    right = to_set(split_line[1])
    intersect = {x: True for x in left if x in right}
    if intersect == right or intersect == left:
        score += 1
    if len(intersect) > 0:
        score2 += 1

print(score)
print(score2)
