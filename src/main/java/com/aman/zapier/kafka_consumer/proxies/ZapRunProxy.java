package com.aman.zapier.kafka_consumer.proxies;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.aman.zapier.kafka_consumer.objects.ZapRunObject;

@FeignClient(name="DATABASE-CONNECTIVITY")
public interface ZapRunProxy {
	@GetMapping(path="/retrieve/zapRun/{zapRunId}")
	ZapRunObject sendZapRun(@PathVariable("zapRunId") String zapRunId);
}
