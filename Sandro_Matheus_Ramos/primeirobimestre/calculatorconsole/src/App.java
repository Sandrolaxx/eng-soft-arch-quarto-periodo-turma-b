package Sandro_Matheus_Ramos.calculatorconsole.src;

import Sandro_Matheus_Ramos.calculatorconsole.src.service.CalculatorSerivce;
import Sandro_Matheus_Ramos.calculatorconsole.src.service.MenuService;

public class App {
    
    public static void main(String[] args) {

        var menu = new MenuService();

        var calculator = new CalculatorSerivce();

        var option = menu.showMenu();

        //criar método para "resolver" escolha usuário
    }

}
