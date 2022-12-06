

from commons import getfile


def parse():
    lines = getfile(1)
    elves = []
    index = 0
    for line in lines:
        if len(line) == 0:
            index += 1
        else:
            if len(elves) != index+1:
                elves.append(0)
            elves[index] = elves[index]+int(line)
    return elves


elves = sorted(parse(), reverse=True)
print(elves[0])
print(elves[0] + elves[1] + elves[2])
