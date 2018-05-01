package pl.artur.module.kafka;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;
import pl.artur.module.db.entity.*;

@Component
public class KafkaItemSender implements KafkaSender<Item> {
	
	@Autowired
	private Gson gson;

	@Override
	public void sendItem(ProducerConfig producerConfig, Item object) {
		// TODO Auto-generated method stub
		  Producer<String, String> producer = new Producer<String, String>(producerConfig);
		  String msg = gson.toJson(object);
		  KeyedMessage<String, String> data = new KeyedMessage<String, String>(Conf.inputTopic, "item", msg);
		  producer.send(data);
		
	}


	//TODO:  Przerobić run-kafka.bat tak by posiadał te tematy które chcemy i żeby miał odpowiednią ilość brokerów itp
	niedokonczony kod zeby wyswietlilo tu blad i zebym zwrocil na to uwage 
}
