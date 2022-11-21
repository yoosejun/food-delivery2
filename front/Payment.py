from sqlalchemy.ext.declarative import declarative_base 
from sqlalchemy import Column, String, Integer, event, Float, Boolean
from datetime import datetime

import util
from 결제승인됨 import 결제승인됨
from Paid import Paid

Base = declarative_base()

class Payment(Base):
    __tablename__ = 'Payment_table'
    id = Column(Integer, primary_key=True)
    orderId = Column(String(50))
    amount = Column(Float)

    def __init__(self):
        self.id = None
        self.orderId = None
        self.amount = None

@event.listens_for(Payment, 'after_insert')
def PostPersist(mapper, connection, target):
    event = Paid()
    event = util.AutoBinding(target, event)

    event.Publish()
    

    
@event.listens_for(Payment, 'before_insert')
def PrePersist(mapper, connection, target):
    event = 결제승인됨()
    event = util.AutoBinding(target, event)

    event.Publish()
    

    

