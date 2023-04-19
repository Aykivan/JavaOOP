from Animal import Animal


class Dog(Animal):
    hunger = 0

    def __init__(self, name, age) -> None:
        super().__init__(name, age)

    def voice(self):
        print("gav")