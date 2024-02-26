package FactoryDP;

import FactoryDP.components.button.AndroidButton;
import FactoryDP.components.button.Button;
import FactoryDP.components.button.IOSButton;

public class Platform {
    private String pl;
    Platform(){

    }
    Platform(String pl){
        this.pl = pl;
    }
    public void setTheme(){
        System.out.println("Set a theme!");
    }

    public void setRefreshRate(){
        System.out.println("Set refresh");
    }

//    public Button createButton(String platform){
//        if(platform.equals("Android")){
//            return new AndroidButton();
//        } else if (platform.equals("IOS")){
//            return new IOSButton();
//        }
//       return null;
//    }
    public UIComponentFactory createUIComponentFactory(){
        return null;
    }

    public UIComponentFactory createFactory(){
        return UIFactory.createUIComponentFactoryByPlatform(this.pl);
    }
}
