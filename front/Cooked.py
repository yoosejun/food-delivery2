
from AbstractEvent import AbstractEvent
import json

class Cooked(AbstractEvent):
    id : int
    foodId : str
    orderId : str
    preference : str
    status : str
    
    def __init__(self):
        super().__init__()
        self.id = None
        self.foodId = None
        self.orderId = None
        self.preference = None
        self.status = None

