
from AbstractEvent import AbstractEvent
import json

class Accepted(AbstractEvent):
    id : int
    foodId : str
    ordered : str
    status : str
    
    def __init__(self):
        super().__init__()
        self.id = None
        self.foodId = None
        self.ordered = None
        self.status = None

