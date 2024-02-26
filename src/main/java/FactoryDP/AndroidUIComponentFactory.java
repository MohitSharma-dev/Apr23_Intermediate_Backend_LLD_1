package FactoryDP;

import FactoryDP.components.button.AndroidButton;
import FactoryDP.components.button.Button;
import FactoryDP.components.dropdown.AndriodDropdown;
import FactoryDP.components.dropdown.Dropdown;
import FactoryDP.components.menu.AndroidMenu;
import FactoryDP.components.menu.Menu;

public class AndroidUIComponentFactory implements UIComponentFactory{
    @Override
    public Dropdown createDropdown() {
        return new AndriodDropdown();
    }

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
