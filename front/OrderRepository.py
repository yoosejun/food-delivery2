from flask import Response, request

import OrderDB
import util
from Order import Order

repository = OrderDB.repository

def Create(request):
    entity = Order()
    entity = util.AutoBinding(request.json, entity)
    repository.save(entity)

    return entity
    
def Read(request):
    entity_list = repository.list()
    
    return entity_list

def Read_by_id(id):
    
    ele = repository.find_by_id(id)

    return ele

def Update(id, request):
    
    ele = repository.update(id, request.json)
    
    return ele

def Delete(id):
    ele = repository.delete(id)
    
    return ele