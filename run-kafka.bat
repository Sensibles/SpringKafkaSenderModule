cd C:\kafka_2.11-1.1.0
start bin\windows\zookeeper-server-start.bat config\zookeeper.properties
start bin\windows\kafka-server-start.bat config\serverItem.properties

TIMEOUT /T 20
		
start bin\windows\kafka-console-producer.bat --topic test --broker-list localhost:9094
start bin\windows\kafka-console-consumer.bat --topic test --zookeeper localhost:2181
