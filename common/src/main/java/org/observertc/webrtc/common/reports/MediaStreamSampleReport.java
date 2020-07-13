package org.observertc.webrtc.common.reports;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.time.LocalDateTime;
import java.util.UUID;

@JsonTypeName("MEDIA_STREAM_SAMPLE")
public class MediaStreamSampleReport extends Report {
	public static MediaStreamSampleReport of(
			UUID observerUUID,
			UUID outboundPeerConnectionUUID,
			UUID inboundPeerConnectionUUID,
			Long SSRC,
			LocalDateTime firstSample,
			LocalDateTime lastSample,
			MediaStreamSampleRecordReport RTTRecord,
			MediaStreamSampleRecordReport bytesReceivedRecord,
			MediaStreamSampleRecordReport bytesSentRecord,
			MediaStreamSampleRecordReport packetsLostRecord,
			MediaStreamSampleRecordReport packetsReceivedRecord,
			MediaStreamSampleRecordReport packetsSentRecord
	) {
		MediaStreamSampleReport result = new MediaStreamSampleReport();
		result.observerUUID = observerUUID;
		result.outboundPeerConnectionUUID = outboundPeerConnectionUUID;
		result.outboundPeerConnectionUUID = inboundPeerConnectionUUID;
		result.SSRC = SSRC;
		result.firstSample = firstSample;
		result.lastSample = lastSample;
		result.RTTRecord = RTTRecord;
		result.bytesReceivedRecord = bytesReceivedRecord;
		result.bytesSentRecord = bytesSentRecord;
		result.packetsLostRecord = packetsLostRecord;
		result.packetsReceivedRecord = packetsReceivedRecord;
		result.packetsSentRecord = packetsSentRecord;
		return result;
	}

	@JsonCreator
	public MediaStreamSampleReport() {
		super(ReportType.MEDIA_STREAM_SAMPLE);
	}

	public UUID outboundPeerConnectionUUID;

	public UUID inboundPeerConnectionUUID;

	public UUID observerUUID;

	public Long SSRC;

	public Long inboundMeasurementsNum = 0L;

	public Long outboundMeasurementsNum = 0L;

	public Long remoteInboundMeasurementsNum = 0L;

	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	public LocalDateTime firstSample;

	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	public LocalDateTime lastSample;

	@JsonUnwrapped(prefix = "RTTRecord_")
	public MediaStreamSampleRecordReport RTTRecord;

	@JsonUnwrapped(prefix = "bytesReceivedRecord_")
	public MediaStreamSampleRecordReport bytesReceivedRecord;

	@JsonUnwrapped(prefix = "bytesSentRecord_")
	public MediaStreamSampleRecordReport bytesSentRecord;

	@JsonUnwrapped(prefix = "packetsSentRecord_")
	public MediaStreamSampleRecordReport packetsSentRecord;

	@JsonUnwrapped(prefix = "packetsReceivedRecord_")
	public MediaStreamSampleRecordReport packetsReceivedRecord;

	@JsonUnwrapped(prefix = "packetsLostRecord_")
	public MediaStreamSampleRecordReport packetsLostRecord;
}
