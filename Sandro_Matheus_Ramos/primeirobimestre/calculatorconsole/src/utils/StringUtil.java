package Sandro_Matheus_Ramos.calculatorconsole.src.utils;

public class StringUtil {
    
    public static String addBlankLeftPad(String campo, int tamanhoCampo) {
        if (campo == null) {
            return lpad(campo, " ", tamanhoCampo);
        }
        if (campo.length() > tamanhoCampo) {
            campo = campo.substring(0, tamanhoCampo);
        }
        return lpad(campo, " ", tamanhoCampo);
    }

    public static String lpad(String valueToPad, String filler, int size) {

        if (valueToPad == null) {
            valueToPad = "";
        }
        if (valueToPad.length() >= size) {
            valueToPad = valueToPad.substring(0, size);
        }

        while (valueToPad.length() < size) {
            valueToPad = valueToPad + filler;
        }
        return valueToPad;
    }

}
