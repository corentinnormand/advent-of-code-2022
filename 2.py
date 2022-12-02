
def getfile():
    file = open("2.txt")
    lines = []
    for line in file.readlines():
        lines.append(line.strip())
    return lines


lines = getfile()

# A for Rock, B for Paper, and C for Scissors.
# X for Rock, Y for Paper, and Z for Scissors
# 1 Rock
# 2 paper
# 3 scissors

# (0 if you lost,
#  3 if the round was a draw, and
#  6 if you won).

moves1 = {
    "A X": 1+3,
    "B X": 1+0,
    "C X": 1+6,
    "A Y": 2+6,
    "B Y": 2+3,
    "C Y": 2+0,
    "A Z": 3+0,
    "B Z": 3+6,
    "C Z": 3+3,
}


# X means you need to lose, Y means you need to end the round in a draw, and Z means you need to win. Good luck!"
moves2 = {
    "A X": 0+3,
    "B X": 0+1, 
    "C X": 0+2,
    "A Y": 3+1,
    "B Y": 3+2,
    "C Y": 3+3,
    "A Z": 6+2,
    "B Z": 6+3,
    "C Z": 6+1,
}

score = 0
score2= 0
for play in getfile():
    score += moves1[play]
    score2 += moves2[play]

print(score)
print(score2)
