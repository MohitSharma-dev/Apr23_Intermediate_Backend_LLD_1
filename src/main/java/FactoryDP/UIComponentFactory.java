package FactoryDP;

import FactoryDP.components.button.Button;
import FactoryDP.components.dropdown.Dropdown;
import FactoryDP.components.menu.Menu;

public interface UIComponentFactory {
    public Button createButton();
    public Menu createMenu();
    public Dropdown createDropdown();
}
