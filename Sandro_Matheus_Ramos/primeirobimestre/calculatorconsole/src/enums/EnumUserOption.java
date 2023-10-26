package Sandro_Matheus_Ramos.calculatorconsole.src.enums;

public enum EnumUserOption {

    SUM("1", "Soma \uD83D\uDE0E"),
    SUBTRACTION("2", "Subtração \uD83D\uDD1D"),
    MULTIPLICATION("3", "Multiplicação \uD83D\uDD1D"),
    DIVISION("4", "Divisão \uD83D\uDD1D"),
    EXIT("5", "Sair \uD83C\uDFC3");

    private final String key;

    private final String value;

    private EnumUserOption(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public static EnumUserOption parseByKey(String key) {

        if (key != null && !key.trim().isEmpty()) {
            for (var value : EnumUserOption.values()) {
                if (value.getKey().equalsIgnoreCase(key)) {
                    return value;
                }
            }
        }

        return null;
    }

}
