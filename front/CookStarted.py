
from AbstractEvent import AbstractEvent
import json

class CookStarted(AbstractEvent):
    id : int
    foodId : str
    orderId : str
    status : str
    
    def __init__(self):
        super().__init__()
        self.id = None
        self.foodId = None
        self.orderId = None
        self.status = None

