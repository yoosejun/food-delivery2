# 

## Model
www.msaez.io/#/storming/Q8eftQC5maXPCTCtN9vbXkjAgIl2/d3441e0dfde982ce5847c722ab3a2f82

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd kafka
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic 
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- front
- store
- customer
- delivery


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- front
```
 http :8088/주문 id="id" 품목="품목" 수량="수량" 
 http :8088/orders id="id" foodId="foodId" amount="amount" customerId="customerId" options="options" address="address" status="status" 
 http :8088/payments id="id" orderId="orderId" amount="amount" 
```
- store
```
 http :8088/주문관리 id="id" 
 http :8088/orderManages id="id" foodId="foodId" orderId="orderId" status="status" test="test" couponNumber="couponNumber" 
```
- customer
```
 http :8088/logs id="id" customerId="customerId" message="message" 
```
- delivery
```
 http :8088/deliveries id="id" address="address" orderId="orderId" riderId="riderId" status="status" 
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```

