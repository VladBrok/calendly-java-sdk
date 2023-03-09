package calendly.calendly.models.operations;

import java.net.http.HttpResponse;

public class GetScheduledEventsUuidResponse {
    public String contentType;
    public GetScheduledEventsUuidResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public GetScheduledEventsUuidErrorResponse errorResponse;
    public GetScheduledEventsUuidResponse withErrorResponse(GetScheduledEventsUuidErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public Integer statusCode;
    public GetScheduledEventsUuidResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public GetScheduledEventsUuidResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetScheduledEventsUuid200ApplicationJSON getScheduledEventsUuid200ApplicationJSONObject;
    public GetScheduledEventsUuidResponse withGetScheduledEventsUuid200ApplicationJSONObject(GetScheduledEventsUuid200ApplicationJSON getScheduledEventsUuid200ApplicationJSONObject) {
        this.getScheduledEventsUuid200ApplicationJSONObject = getScheduledEventsUuid200ApplicationJSONObject;
        return this;
    }
    
    public GetScheduledEventsUuid403ApplicationJSON getScheduledEventsUuid403ApplicationJSONObject;
    public GetScheduledEventsUuidResponse withGetScheduledEventsUuid403ApplicationJSONObject(GetScheduledEventsUuid403ApplicationJSON getScheduledEventsUuid403ApplicationJSONObject) {
        this.getScheduledEventsUuid403ApplicationJSONObject = getScheduledEventsUuid403ApplicationJSONObject;
        return this;
    }
    
}