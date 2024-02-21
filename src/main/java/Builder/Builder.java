package Builder;

public class Builder {
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
