import pymongo
conn = pymongo.MongoClient("mongodb://localhost:27017/")
db = conn["mydatabase"]
col = db["student"]
# value = [{"Name":"aaron","Age":"40","place":"Ulloor"},
#          {"Name":"Aishu","Age":"21","Place":"Palakkad"},
#          {"Name":"Deepak","Age":"20","Place":"Sooranadu"}]
# col.insert_many(value)
cond = {"Age":"21"}
newvalue = {"$set":{"Place":"Trivandrum"}}
print(col.update_many(cond,newvalue))
# var = col.find({"Age":"21"},{"Name":1})
# for i in var:
#     print(i) 