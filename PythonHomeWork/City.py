from AbstractPlace import AbstractPlace

class City:
    population = 0
    name = ""

    mood = 20
    satiety = 20
    education = 20

    def __init__(self, name, population) -> None:
        self.name = name
        self.population = population

    def getName(self):
        print(self.name)
    def getPopulation(self):
        print(self.population)
    
    def getStatus(self):
        print("mood =", self.mood)
        print("satiety =", self.satiety)
        print("education =", self.education)
        
    def getPublicOpinion(self):
        if ((self.mood + self.satiety + self.education) <= 60): print("Мы хотим большего!")
        elif ((self.mood + self.satiety + self.education) <= 90): print("У нас все нормально.")
        elif ((self.mood + self.satiety + self.education) <= 120): print("У нас все отлично!")
            
    def addPlace(self, place):
        if (isinstance(place, AbstractPlace)):
            if (place.getTypePlace() == "entertainment"):
                self.population += 10000
                self.mood += 15
                self.satiety -= 5
            elif (place.getTypePlace() == "education"):
                self.population += 10000
                self.mood += -5
                self.education += 15
            elif (place.getTypePlace() == "food"):
                self.population += 10000
                self.mood += 5
                self.satiety += 15
            else: print("boo")

