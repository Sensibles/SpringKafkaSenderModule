package pl.artur.module.kafka.impl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;


import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;
import pl.artur.module.db.entity.*;
import pl.artur.module.kafka.Conf;
import pl.artur.module.kafka.KafkaSender;
import pl.artur.module.utils.GsonFactory;

@Component
public class KafkaItemSender implements KafkaSender<Item> {
	
	//TODO MAKE LOGGER WORKS :D
	final static Logger logger = Logger.getLogger(KafkaItemSender.class);
	
	@Autowired
	private Gson gson;

	@Override
	public void sendItem(ProducerConfig producerConfig, Item object) {
		// TODO Auto-generated method stub
		System.out.println("Starting sending item...");
		  Producer<String, String> producer = new Producer<String, String>(producerConfig);
		  String msg = gson.toJson(object);
		  System.out.println("Item parsed to JSON: " + msg);
		  KeyedMessage<String, String> data = new KeyedMessage<String, String>(Conf.topic, "item", msg);
		  producer.send(data);
		  System.out.println("Item sent");
	}
}
