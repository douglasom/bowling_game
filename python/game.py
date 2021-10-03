class Game(object):
    def __init__(self):
        self.total_score = 0
        self.current_roll = -1
        self.previous_roll = -1
        self.frame = 1
        self.first_attempt_within_frame = True
        self.bonus = []

    def roll(self, pins):
        self.current_roll = pins
        self.process_current_roll()
        self.prepare_bonus()

    def process_current_roll(self):
        self.process_bonus()
        self.total_score += self.current_roll

    def process_bonus(self):
        if self.bonus:
            self.total_score += self.bonus.pop(0) * self.current_roll

    def prepare_bonus(self):
        if self.frame != 10:
            if self.first_attempt_within_frame:
                self.frame += 1
                if self.current_roll == 10:
                    self.prepare_strike_bonus()
                else:
                    self.possible_spare_next_roll()
            else:
                if self.previous_roll + self.current_roll == 10:
                    self.prepare_spare_bonus()

    def possible_spare_next_roll(self):
        self.previous_roll = self.current_roll
        self.first_attempt_within_frame = not self.first_attempt_within_frame

    def prepare_spare_bonus(self):
        self.bonus.append(1)

    def prepare_strike_bonus(self):
        if self.bonus:
            self.bonus[0] += 1
        else:
            self.bonus.append(1)
        self.bonus.append(1)

    def score(self):
        return self.total_score
