from Animal import Animal


class Cat(Animal):
    hunger = 0

    def __init__(self, name, age) -> None:
        super().__init__(name, age)

    def voice(self):
        print("meow")
