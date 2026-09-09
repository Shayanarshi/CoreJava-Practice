public enum Signal {
    RED("red"),
    YELLOW("yellow"),
    GREEN("green");

    private final String value;
    private Signal(String value){
        this.value= value;
    }

    public String getValue() {
        return value;
    }
}
