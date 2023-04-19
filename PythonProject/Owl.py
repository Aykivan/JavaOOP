from Animal import Animal
from Salmon import Salmon


class Owl(Animal):
    hunger = 0

    def __init__(self, name, age) -> None:
        super().__init__(name, age)
    def voice(self):
        print("u-u, u-u")

    def feed(self, hunger, food):
        if (isinstance(food, Salmon)): self.hunger -= hunger
        else: print("boo")

    def addHunger(self, hunger):
        self.hunger += hunger
    def isHungry(self):
        if (self.hunger > 0):
            print("I'am hungry")
        else:
            print("I'am NOT hungry")
