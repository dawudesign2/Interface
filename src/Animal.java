public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name) {
        this.name = name;
        this.age = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }


    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract String sing();
}
