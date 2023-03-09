package calendly.calendly.models.operations;

import java.net.http.HttpResponse;

public class GetUserAvailabilitySchedulesUuidResponse {
    public String contentType;
    public GetUserAvailabilitySchedulesUuidResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public GetUserAvailabilitySchedulesUuidErrorResponse errorResponse;
    public GetUserAvailabilitySchedulesUuidResponse withErrorResponse(GetUserAvailabilitySchedulesUuidErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public Integer statusCode;
    public GetUserAvailabilitySchedulesUuidResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public GetUserAvailabilitySchedulesUuidResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetUserAvailabilitySchedulesUuid200ApplicationJSON getUserAvailabilitySchedulesUuid200ApplicationJSONObject;
    public GetUserAvailabilitySchedulesUuidResponse withGetUserAvailabilitySchedulesUuid200ApplicationJSONObject(GetUserAvailabilitySchedulesUuid200ApplicationJSON getUserAvailabilitySchedulesUuid200ApplicationJSONObject) {
        this.getUserAvailabilitySchedulesUuid200ApplicationJSONObject = getUserAvailabilitySchedulesUuid200ApplicationJSONObject;
        return this;
    }
    
    public GetUserAvailabilitySchedulesUuid403ApplicationJSON getUserAvailabilitySchedulesUuid403ApplicationJSONObject;
    public GetUserAvailabilitySchedulesUuidResponse withGetUserAvailabilitySchedulesUuid403ApplicationJSONObject(GetUserAvailabilitySchedulesUuid403ApplicationJSON getUserAvailabilitySchedulesUuid403ApplicationJSONObject) {
        this.getUserAvailabilitySchedulesUuid403ApplicationJSONObject = getUserAvailabilitySchedulesUuid403ApplicationJSONObject;
        return this;
    }
    
}
