package FactoryDP;

import FactoryDP.components.button.Button;
import FactoryDP.components.dropdown.Dropdown;
import FactoryDP.components.menu.Menu;

public class Client {
    public static void main(String[] args) {
        Platform p = new IOS();
//        Button b = p.createButton("Android");
        UIComponentFactory x =  p.createUIComponentFactory();
         Button b1 =  x.createButton();
        Dropdown d1 =  x.createDropdown();
            Menu m1 =  x.createMenu();

            Platform p1 = new Platform("Android");
        UIComponentFactory x1 = p1.createFactory();
        Button b2 = x1.createButton();
        Menu m2 = x1.createMenu();

    }
}
