package Sandro_Matheus_Ramos.calculatorconsole.src.service;

import java.util.List;
import java.util.Scanner;

import Sandro_Matheus_Ramos.calculatorconsole.src.enums.EnumUserOption;
import Sandro_Matheus_Ramos.calculatorconsole.src.utils.StringUtil;

public class MenuService {

    final static Scanner option = new Scanner(System.in);

    public EnumUserOption showMenu() {
        var options = List.of(EnumUserOption.values());
        var menuTitle = StringUtil.addBlankLeftPad("\u001b[38;5;214m \u001b[48;5;153m MENU \u001b[m \u2728", 66);

        System.out.println("\n|------------------------------------------|");
        System.out.println("|".concat(menuTitle).concat("|"));
        System.out.println("|------------------------------------------|");

        options.forEach(element -> System.out.println(getOptionTemplate(element)));

        System.out.println("|------------------------------------------|");
        var enumOption = EnumUserOption.parseByKey(String.valueOf(option.next().charAt(0)));

        if (enumOption == null) {
            System.out.println("\n|------------------------------------------|");
            System.out.println("|             OPÇÃO INVÁLIDA!              |");
            System.out.println("|------------------------------------------|");

            enumOption = showMenu();
        }

        return enumOption;
    }

    private String getOptionTemplate(EnumUserOption enumUserChoice) {
        return StringUtil.addBlankLeftPad("| [".concat(enumUserChoice.getKey()).concat("] ")
                .concat(enumUserChoice.getValue()), 42).concat(" |");
    }

}
