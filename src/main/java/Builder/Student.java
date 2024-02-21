package Builder;

public class Student {
    String name;
    int id;
    int age;
    int gradYear;
    String batch;
    double psp;
    int coins;
//    Student(int id , String name , double psp, int coins){
//        ---
//    }
    static public class Builder {
        String name;
        int id;
        int age;
        int gradYear;
        String batch;
        double psp;
        int coins;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public void setBatch(String batch) {
            this.batch = batch;
        }

        public double getPsp() {
            return psp;
        }

        public void setPsp(double psp) {
            this.psp = psp;
        }

        public Student build(){
            // validations
            if(this.age > 25){
                throw new IllegalArgumentException();
            }
            if(this.gradYear < 2020){
                throw new IllegalArgumentException();
            }

            return new Student(this);
        }
    }

    private Student(Builder builder){
        // do validations

        // validations are done

        this.age = builder.getAge();
        this.name = builder.getName();
        this.gradYear = builder.getGradYear();
    }

    public static Builder getBuilder(){
        return new Builder();
    }
}

// static functions can't use non-static members
// non-static basically exists with the existence of the obj
// static members doesn't require objects
