package coding_blocks_lec24;

public class StudentClient {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Aditya";
        s.age = 21;
        System.out.println(s.name);
        System.out.println(s.age);
        s.Intro_yourself();
        Student s1 = new Student();
        s1.name = "Anushka";
        s1.age = 20;
        System.out.println(s1.name);
        System.out.println(s1.age);
        s1.Intro_yourself();
        s1.sayHey("Aditya");
        Student.Mentore_Name();
    }
    static{
        System.out.println("Static block in main");
    }
}
