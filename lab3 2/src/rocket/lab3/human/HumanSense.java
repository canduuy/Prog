package rocket.lab3.human;

public enum HumanSense {
    NORMAL("нормич"),
    RELUCTANTLY(" неохотно"),
    AGRESS("aгрессивно"),
    CRY(" плачет"),
    SAD(" грустный"),
    PITIFULLY("ужасно жалко");

    private final String state;

    HumanSense(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
