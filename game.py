class Game(object):
    def __init__(self):
        print("new game!")

    def roll(self, pins):
        print(f'rolling {pins}')

    def score(self):
        return -1