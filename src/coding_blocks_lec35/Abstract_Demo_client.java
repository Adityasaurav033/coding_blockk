package coding_blocks_lec35;

public class Abstract_Demo_client {
    public static void main(String[] args) {
        Abstract_Demo_2 ad = new Abstract_Demo_2();
        ad.fun();

        Abstract_Demo ab = new Abstract_Demo() {
            @Override
            public void fun() {

            }

            @Override
            public int get() {
                return 0;
            }
        };

        Abstract_Demo ab1 = new Abstract_Demo() {
            @Override
            public void fun() {

            }

            @Override
            public int get() {
                return 0;
            }
        };
    }
}
