package coding_blocks_lec24;

import java.sql.SQLOutput;

public class Student {
    String name;
    int age;
    public void Intro_yourself(){
        System.out.println("My name is " + name + " and age is "+ age);
    }
    public void sayHey(String name){
        System.out.println(this.name + " Say Hey  " + name);
    }

    //static field cannot access the no static field.
    // but the non static field can access the static field.

    public static void Mentore_Name(){
        System.out.println("monu bhaiya");
    }
    static{
        System.out.println("Static block 1");
    }
}
