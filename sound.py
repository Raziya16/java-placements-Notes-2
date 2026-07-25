import winsound

notes=[262,294,330,392,440,494,523,494,440,392,349,330,294,262] # C D E F G A B C
for note in notes:
    winsound.Beep(note, 1500)