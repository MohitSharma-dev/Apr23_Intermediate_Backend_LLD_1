package Generics;

public class Pair <V, T>{
    V first;
    T second;

    // static attributes doesn't get tied to object instead with the class
    public static <T, M> M doSomething(T something){
        T x = something;

        System.out.println(something);
        return null;
    }

    public <Kamal> void doSome(Kamal temp){
        System.out.println("something something");
    }
    public void setSecond(V x){
        this.first = x;
    }

    public T getSecond(){
        return this.second;
    }


}
