package Enums;

public enum Adjectives {
    INVITING ("манящий"),
    SWEET ("сладковатый"),
    POCKET ("карманного"),
    MAGIC ("магическом"),
    BLACK("черный"),
    EASY("легкие"),
    PRINTED("набивной"),
    MULTICOLORED("разноцветные"),
    STUNNED("Oшеломленая"),
    SHORT("короткими"),
    SOFT("мягкими"),
    SWAN("лебяжий"),
    HEAVY("тяжелая"),
    SPARKLING("сверкающая"),
    STRANGER ("странный");

    private String mean;
    Adjectives(String name) {
        this.mean = name;
    }

    @Override
    public String toString() {
        return mean;
    }
}
