package Prototype;

public class IntelligentStudent extends Student{
    int iq;
    IntelligentStudent(){

    }
    IntelligentStudent (IntelligentStudent other){
        super(other);
        this.iq = other.iq;
    }
    public  IntelligentStudent copy() {
        System.out.println("IS");
        IntelligentStudent s = new IntelligentStudent(this);
        return s;
    }
}
