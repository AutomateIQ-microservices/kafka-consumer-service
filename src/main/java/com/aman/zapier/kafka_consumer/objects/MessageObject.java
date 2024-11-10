package com.aman.zapier.kafka_consumer.objects;

public class MessageObject {
	private String zapRunId;
	private int stage;
	public String getZapRunId() {
		return zapRunId;
	}
	public void setZapRunId(String zapRunId) {
		this.zapRunId = zapRunId;
	}
	public int getStage() {
		return stage;
	}
	public void setStage(int stage) {
		this.stage = stage;
	}
	public MessageObject(String zapRunId, int stage) {
		super();
		this.zapRunId = zapRunId;
		this.stage = stage;
	}
	public MessageObject() {
		super();
	}
	@Override
	public String toString() {
		return "MessageObject [zapRunId=" + zapRunId + ", stage=" + stage + "]";
	}
	
}
