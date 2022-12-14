package Enums;

public enum Adverbs {
    SILENTLY ("бесшумно"),
    BACK ("назад"),
    ROUND ("обратно"),
    FARTHER ("дальше"),
    UPDOWN ("вверх-вниз"),
    FINISH ("наконец"),
    ENDKESS ("бесконечными рядами"),
    FIRST ("одно"),
    SECOND ("другим"),
    EVERYWHERE ("Всюду"),
    NEAR ("ближе"),
    SUDDENLY ("Внезапно"),
    LITTLE ("немного");

    private String mean;
    Adverbs(String name) {
        this.mean = name;
    }
    @Override
    public String toString() {
        return mean;
    }
}
