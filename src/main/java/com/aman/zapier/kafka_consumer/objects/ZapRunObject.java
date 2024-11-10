package com.aman.zapier.kafka_consumer.objects;

import java.util.UUID;

public class ZapRunObject {
	private UUID id;
	private String zapId;
	private String metadata;
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getZapId() {
		return zapId;
	}
	public void setZapId(String zapId) {
		this.zapId = zapId;
	}
	public String getMetadata() {
		return metadata;
	}
	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}
	@Override
	public String toString() {
		return "ZapRunObject [id=" + id + ", zapId=" + zapId + ", metadata=" + metadata + "]";
	}
	
	
}