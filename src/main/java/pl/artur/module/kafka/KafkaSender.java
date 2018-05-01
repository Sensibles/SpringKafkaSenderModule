package pl.artur.module.kafka;

import kafka.producer.ProducerConfig;

public interface KafkaSender<T> {
	
	void sendItem(ProducerConfig producerConfig, T object);

}
