class Log {

    private String message;

    public Log(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String toString() {
        return message;
    }
}