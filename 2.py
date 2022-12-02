

from commons import getfile


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
for play in getfile(2):
    score += moves1[play]
    score2 += moves2[play]

print(score)
print(score2)
