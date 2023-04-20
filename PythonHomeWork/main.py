from AbstractPlace import AbstractPlace
from City import City
from School import School
from FoodFarm import FoodFarm
from Cinema import Cinema

print("Проверяем статус города")
city = City("City", 10000)
city.getStatus()
city.getPublicOpinion()
print("")

print("Добавили школу")
school = School("School №1", "education")
city.addPlace(school)
city.getStatus()
city.getPublicOpinion()
print("")

print("Добавили ферму")
farm = FoodFarm("Farm", "food")
city.addPlace(farm)
city.getStatus()
city.getPublicOpinion()
print("")

print("Добавили кинотеатр")
cinema = Cinema("Cinema", "entertainment")
city.addPlace(cinema)
city.getStatus()
city.getPublicOpinion()
print("")