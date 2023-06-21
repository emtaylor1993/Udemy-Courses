package pojo;

public abstract class TradeAccount {
    private String id;

    public TradeAccount(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Abstract method to be overidden allowing us to clone abstract objects.
    public abstract TradeAccount clone();
}