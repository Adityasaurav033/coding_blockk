package coding_blocks_lec26;

public class Student {
    String name = "Raj";
    int age = 22;

    public Student(){

    }

    public Student(String S , int age){
        this.name = S;
        this.age = age;
    }
    @Override
    //We can override String class because String is of Object class... So, basically we can override all the object class present in the java.
    // like java dont allow the array class to override because it is not persent.
    public String toString(){
        return name + " " + age;
    }


}
