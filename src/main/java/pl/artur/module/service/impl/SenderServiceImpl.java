package pl.artur.module.service.impl;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kafka.producer.ProducerConfig;
import kafka.serializer.StringEncoder;
import pl.artur.module.db.entity.Item;
import pl.artur.module.service.SenderService;
import pl.artur.module.kafka.*;

@Component
public class SenderServiceImpl implements SenderService{
	
	@Autowired
	KafkaSender kafkaSender;
	
	private static ProducerConfig producerConfig() {
		Properties props = new Properties();
		props.put("metadata.broker.list", Conf.brokerList);
		props.put("serializer.class", StringEncoder.class.getName());
		props.put("partitioner.class", VerbosePartitioner.class.getName());
		props.put("request.required.acks", "1");
		return new ProducerConfig(props);
	}

	@Override
	public void sendItem(Item item) {
		kafkaSender.sendItem(producerConfig(), item);
		// TODO Auto-generated method stub
		
	}

}
