from AbstractPlace import AbstractPlace

class Cinema(AbstractPlace):
    mood = 0
    satiety = 0
    education = 0

    def __init__(self, name, typePlace) -> None:
        super().__init__(name, typePlace)
        
    def getMood(self):
        return(self.mood)
    def getSatiety(self):
        return(self.satiety)
    def getEducation(self):
        return(self.education)

    def cityEvent(self):
        self.mood += 3
        self.satiety -= 1
        print("Кинофест")