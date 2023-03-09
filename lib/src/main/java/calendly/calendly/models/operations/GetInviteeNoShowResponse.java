package calendly.calendly.models.operations;

import java.net.http.HttpResponse;

public class GetInviteeNoShowResponse {
    public String contentType;
    public GetInviteeNoShowResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public GetInviteeNoShowErrorResponse errorResponse;
    public GetInviteeNoShowResponse withErrorResponse(GetInviteeNoShowErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public Integer statusCode;
    public GetInviteeNoShowResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public GetInviteeNoShowResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetInviteeNoShow200ApplicationJSON getInviteeNoShow200ApplicationJSONObject;
    public GetInviteeNoShowResponse withGetInviteeNoShow200ApplicationJSONObject(GetInviteeNoShow200ApplicationJSON getInviteeNoShow200ApplicationJSONObject) {
        this.getInviteeNoShow200ApplicationJSONObject = getInviteeNoShow200ApplicationJSONObject;
        return this;
    }
    
}
