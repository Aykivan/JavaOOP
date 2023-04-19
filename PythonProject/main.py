from Cat import Cat
from Dog import Dog
from Owl import Owl
from Salmon import Salmon


cat = Cat("Easeboy", 2)
cat.voice()
print(cat.getName())

dog = Dog("Firstdog", 5)
dog.voice()

owl = Owl("Owl", 8)
# owl.addHunger(5)
# owl.isHungry()
# owl.feed(4)
# owl.isHungry()
# owl.feed(1)
# owl.isHungry()

salmon = Salmon("Sal", 10)
salmon.addHunger(5)
salmon.feed("egg")
salmon.isHungry()
salmon.feed("bread")
salmon.isHungry()