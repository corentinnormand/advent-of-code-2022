
from commons import getfile

lines = getfile("5")


def parse_stacks(stacks: list[str]):
    piles_number = [int(n) for n in stacks[0].split("  ")]
    stacks.pop(0)
    piles = {p: [] for p in piles_number}
    for number in piles_number:
        for line in stacks:
            index = (number-1)*4+1
            char = line[index]
            if (char != ' '):
                piles[number].append(char)
    return (piles)


def parse_move(move):
    moves = move.split(" ")
    return (int(moves[1]), int(moves[3]), int(moves[5]))


def part1():
    stacks = []
    moves = []
    parsed_stacks = []
    is_part1 = True
    for line in lines:
        if len(line) == 0:
            is_part1 = False
            parsed_stacks = parse_stacks(stacks)
            continue

        if is_part1:
            stacks.insert(0, line)
        else:
            moves.append(parse_move(line))

    for move in moves:
        _amount, _from, _to = move
        to_add = parsed_stacks[_from][-_amount:]
        to_add.reverse()
        parsed_stacks[_to].extend(to_add)
        parsed_stacks[_from] = parsed_stacks[_from][0:-_amount]

    res = ""
    for result in parsed_stacks:
        res += parsed_stacks[result][-1:][0]

    print(res)

def part2():
    stacks = []
    moves = []
    parsed_stacks = []
    is_part1 = True
    for line in lines:
        if len(line) == 0:
            is_part1 = False
            parsed_stacks = parse_stacks(stacks)
            continue

        if is_part1:
            stacks.insert(0, line)
        else:
            moves.append(parse_move(line))

    for move in moves:
        _amount, _from, _to = move
        to_add = parsed_stacks[_from][-_amount:]
        parsed_stacks[_to].extend(to_add)
        parsed_stacks[_from] = parsed_stacks[_from][0:-_amount]

    res = ""
    for result in parsed_stacks:
        res += parsed_stacks[result][-1:][0]

    print(res)


part1()
part2()
