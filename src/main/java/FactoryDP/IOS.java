package FactoryDP;

public class IOS extends Platform{
    @Override
    public UIComponentFactory createUIComponentFactory() {
        return new IOSUIComponentFactory();
    }
}
