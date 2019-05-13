package id.nexcloud.nexsurvey.response;

public interface NexResponse<D> {

    String getCode();

    String getStatus();

    D getContent();

    NexPageInfo getPageInfo();

    String getError();

}
