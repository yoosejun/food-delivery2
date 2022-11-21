from AbstractEvent import AbstractEvent
import json
from datetime import datetime

class OrderCanceled(AbstractEvent):
    id : int
    foodId : str
    amount : int
    customerId : str
    preference : str
    
    def __init__(self):
        super().__init__()
        self.id = None
        self.foodId = None
        self.amount = None
        self.customerId = None
        self.preference = None

