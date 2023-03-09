package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
public enum PostOrganizationsUuidInvitations403ApplicationJSONMessageEnum {
    YOU_ALREADY_SENT_ALL_THE_INVITATIONS_YOU_RE_ALLOTTED_BASED_UPON_THE_NUMBER_OF_SEATS_PURCHASED_WITH_YOUR_ACCOUNT_PLEASE_PURCHASE_MORE_SEATS_TO_SEND_MORE_INVITATIONS("You already sent all the invitations you're allotted based upon the number of seats purchased with your account. Please purchase more seats to send more invitations."),
    YOU_ALREADY_SENT_ALL_THE_INVITATIONS_ALLOTTED_TO_YOU_WITH_A_TRIAL_ACCOUNT("You already sent all the invitations allotted to you with a trial account."),
    YOU_DO_NOT_HAVE_PERMISSION("You do not have permission"),
    YOU_CANNOT_PERFORM_THIS_ACTION_FOR_AN_ORGANIZATION_WITH_SCIM_ENABLED("You cannot perform this action for an organization with SCIM enabled.");

    @JsonValue
    public final String value;

    private PostOrganizationsUuidInvitations403ApplicationJSONMessageEnum(String value) {
        this.value = value;
    }
}
