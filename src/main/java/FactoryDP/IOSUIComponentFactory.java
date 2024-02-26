package FactoryDP;

import FactoryDP.components.button.Button;
import FactoryDP.components.button.IOSButton;
import FactoryDP.components.dropdown.Dropdown;
import FactoryDP.components.dropdown.IOSDropdown;
import FactoryDP.components.menu.IOSMenu;
import FactoryDP.components.menu.Menu;

public class IOSUIComponentFactory implements UIComponentFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
