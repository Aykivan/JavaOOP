from abc import abstractmethod

class AbstractPlace:
    name = ""
    typePlace = ""

    def __init__(self, name, typePlace) -> None:
        self.name = name
        self.typePlace = typePlace

    def getName(self):
        return self.name
    def getTypePlace(self):
        return self.typePlace

    @abstractmethod
    def cityEvent(self):
        pass