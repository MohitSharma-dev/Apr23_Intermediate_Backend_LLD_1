package Collections;

import java.util.Comparator;

public class StudentPspComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        // o1 to come first -> return negative
        // o2 to come first -> return positive
        if(o1.psp > o2.psp){
            return -1;
        } else if (o1.psp < o2.psp) {
            return 1;
        }
        return 0;
    }
}
