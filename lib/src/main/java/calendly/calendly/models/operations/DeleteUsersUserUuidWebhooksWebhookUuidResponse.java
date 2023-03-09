package calendly.calendly.models.operations;

import java.net.http.HttpResponse;

public class DeleteUsersUserUuidWebhooksWebhookUuidResponse {
    public String contentType;
    public DeleteUsersUserUuidWebhooksWebhookUuidResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public DeleteUsersUserUuidWebhooksWebhookUuidErrorResponse errorResponse;
    public DeleteUsersUserUuidWebhooksWebhookUuidResponse withErrorResponse(DeleteUsersUserUuidWebhooksWebhookUuidErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public Integer statusCode;
    public DeleteUsersUserUuidWebhooksWebhookUuidResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public DeleteUsersUserUuidWebhooksWebhookUuidResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
