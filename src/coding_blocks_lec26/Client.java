package coding_blocks_lec26;

public class Client {

    public static void main(String[] args) {
        //Case 1
//        P obj = new P();
//        System.out.println(obj.d);
//        System.out.println(obj.d1);
//        obj.fun();
//        obj.fun1();

        //case 2
//        P obj = new C(); // object of C created from the reference variable P.
//        System.out.println(obj.d); // Here object created is of the P reference variable.
//        System.out.println(obj.d1);
//        System.out.println(((C)obj).d2); //we have to explicitly tell the compiler (we want the data of C type ).
//        System.out.println(((C)obj).d);
//        obj.fun(); // ban toh P ka raha h call C ka hoga........Hum cha kar v p k fun ko call nahi kar sakte hai kyuki C ka object ban raha hai.
//        obj.fun1();
//        ((C)obj).fun2();
        //Case 3
//        C obj = new P();
//        System.out.println(obj.d);
//        System.out.println(obj.d1);
//        System.out.println(obj.d2);

//        Case 4
        C obj = new C();
        System.out.println(obj.d);
        System.out.println(obj.d1);
        System.out.println(obj.d2);
        System.out.println(((P) obj).d);
        obj.fun();
        obj.fun1();
        obj.fun2();

    }

}
