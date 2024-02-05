package Exceptions;

public class Student {
    public int doSomething(int rollNo) throws ClassNotFoundException, EvenNumberException{
        if(rollNo < 30) {
            throw new ClassNotFoundException("Even Number exception");
//            throw new IndexOutOfBoundsException();
        } else if (rollNo % 2 == 0){
            throw new EvenNumberException();
        } else if (rollNo % 2 != 0){
            throw new OddNumberException();
        }
        return 1/1;
    }

    public int something(){
        try{
            this.doSomething(50);
        } catch (ClassNotFoundException ex) {
            return 100;
        } catch (EvenNumberException ex) {
            return 101;
        } finally {
            return 102;
        }
    }

    public void doSome(int x){
        doSome(x);
    }
}
