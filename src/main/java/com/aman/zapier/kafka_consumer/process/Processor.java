package com.aman.zapier.kafka_consumer.process;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

import com.aman.zapier.kafka_consumer.objects.MessageObject;
import com.aman.zapier.kafka_consumer.objects.ZapRunObject;
import com.aman.zapier.kafka_consumer.proxies.ZapRunProxy;

@Component
public class Processor {

	@Autowired
	private ZapRunProxy proxy;
	
	
	@KafkaListener(topics="zap-events",groupId="first-group")
	public void processConsumer(ConsumerRecord<String,MessageObject> record,Acknowledgment ack) {
		ZapRunObject zapRun=new ZapRunObject();
		try {
			String topic=record.topic();
			int partition=record.partition();
			long offset=record.offset();
			MessageObject message=record.value();
			
			System.out.println("Topic:"+topic);
			System.out.println("partition:"+partition);
			System.out.println("offset: "+offset);
			
			System.out.println(message);
			zapRun=proxy.sendZapRun(message.getZapRunId());
			System.out.println(zapRun);
			
			//commit this message offset and move the consumer offset to next message
			ack.acknowledge();
		}
		catch(Exception e) {
			System.out.println("Error message :"+ e.getMessage());
		}
	}
}
