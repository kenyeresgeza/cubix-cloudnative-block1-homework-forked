package hu.cubix.cloud.consts;

public enum ApiMessage {

    DEFAULT("This is a default message!");

    private String value;

    ApiMessage(String msg) {
        this.value = msg;
    }

    public String getValue() {
        return value;
    }
}
