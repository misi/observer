package org.observertc.webrtc.service.samples;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.micronaut.core.annotation.Introspected;
import java.time.LocalDateTime;
import java.util.UUID;

@Introspected
public class OutboundStreamMeasurement {
	public Long SSRC;
	public UUID peerConnectionUUID;

	@JsonUnwrapped
	public InboundStreamMeasurement last;

	public Integer bytesSent;
	public Integer packetsSent;

	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	public LocalDateTime sampled;

	public OutboundStreamMeasurement() {

	}
}
