package coding_blocks_lec24;

public class Person {

    String name = "Kaju";
    int age = 21;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //constructor is an method
    //same as class name
    //constructor is always public
    public Person(String name , int age){
        this.name = name;
        this.age = age;

    }
}
