package Sprint1.Inlämning1;

public enum Liquids {
    Mineralvatten("mineralvatten"),
    Kranvatten("kranvatten"),
    Proteindryck("proteindryck");

    public final String liquidType;

    Liquids(String liquidType) {
        this.liquidType = liquidType;
    }
}
