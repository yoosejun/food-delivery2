import util
import 주문DB
from 주문 import 주문
주문repository = 주문DB.repository

import OrderDB
from Order import Order
orderrepository = OrderDB.repository

import PaymentDB
from Payment import Payment
paymentrepository = PaymentDB.repository


from 배달시작됨 import 배달시작됨

def whenever배달시작됨_주문상태변경(data):
    event = 배달시작됨()
    event = util.AutoBinding(data, event)
    
    주문 = 주문()
    주문repository.save(주문)
    order = Order()
    orderrepository.save(order)
    payment = Payment()
    paymentrepository.save(payment)
    
from Accepted import Accepted

def wheneverAccepted_UpdateStatus(data):
    event = Accepted()
    event = util.AutoBinding(data, event)
    
    주문 = 주문()
    주문repository.save(주문)
    order = Order()
    orderrepository.save(order)
    payment = Payment()
    paymentrepository.save(payment)
    
from Rejected import Rejected

def wheneverRejected_UpdateStatus(data):
    event = Rejected()
    event = util.AutoBinding(data, event)
    
    주문 = 주문()
    주문repository.save(주문)
    order = Order()
    orderrepository.save(order)
    payment = Payment()
    paymentrepository.save(payment)
    
from Cooked import Cooked

def wheneverCooked_UpdateStatus(data):
    event = Cooked()
    event = util.AutoBinding(data, event)
    
    주문 = 주문()
    주문repository.save(주문)
    order = Order()
    orderrepository.save(order)
    payment = Payment()
    paymentrepository.save(payment)
    
from CookStart import CookStart

def wheneverCookStart_UpdateStatus(data):
    event = CookStart()
    event = util.AutoBinding(data, event)
    
    주문 = 주문()
    주문repository.save(주문)
    order = Order()
    orderrepository.save(order)
    payment = Payment()
    paymentrepository.save(payment)
    
from OrderCanceled import OrderCanceled

def wheneverOrderCanceled_CancelPayment(data):
    event = OrderCanceled()
    event = util.AutoBinding(data, event)
    
    주문 = 주문()
    주문repository.save(주문)
    order = Order()
    orderrepository.save(order)
    payment = Payment()
    paymentrepository.save(payment)
    
from Rejected import Rejected

def wheneverRejected_OrderCancel(data):
    event = Rejected()
    event = util.AutoBinding(data, event)
    
    주문 = 주문()
    주문repository.save(주문)
    order = Order()
    orderrepository.save(order)
    payment = Payment()
    paymentrepository.save(payment)
    

