package calendly.calendly.models.operations;

import java.net.http.HttpResponse;

public class PostSchedulingLinksResponse {
    public String contentType;
    public PostSchedulingLinksResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public PostSchedulingLinksErrorResponse errorResponse;
    public PostSchedulingLinksResponse withErrorResponse(PostSchedulingLinksErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public Integer statusCode;
    public PostSchedulingLinksResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public PostSchedulingLinksResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public PostSchedulingLinks201ApplicationJSON postSchedulingLinks201ApplicationJSONObject;
    public PostSchedulingLinksResponse withPostSchedulingLinks201ApplicationJSONObject(PostSchedulingLinks201ApplicationJSON postSchedulingLinks201ApplicationJSONObject) {
        this.postSchedulingLinks201ApplicationJSONObject = postSchedulingLinks201ApplicationJSONObject;
        return this;
    }
    
}
