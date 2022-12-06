def getfile(day):
    file = open(f"{day}.txt")
    lines = []
    for line in file.readlines():
        lines.append(line.strip('\n'))
    return lines