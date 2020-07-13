package org.observertc.webrtc.service;

import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties("kafkaTopics")
public class KafkaTopicsConfiguration {
	public boolean createIfNotExists;
	public int replicationFactorOnCreating;
	public int partitionNumberOnCreating;
	public String observeRTCCIceStatsSample;
	public String observeRTCMediaStreamStatsSamples;
	public String observerSSRCPeerConnectionSamples;
	public String observertcReports;
	public String inboundStreamMeasurements;
	public String outboundStreamMeasurements;
	public String temp = "temp";
}

