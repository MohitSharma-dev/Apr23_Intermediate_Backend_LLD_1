package FactoryDP;

public class UIFactory {
    public static UIComponentFactory createUIComponentFactoryByPlatform(String pl){
        if(pl.equals("Andriod")){
            return new AndroidUIComponentFactory();
        } else if (pl.equals("IOS")){
            return new IOSUIComponentFactory();
        }
        return null;
    }
}
