package coding_blocks_lec35;

public class Cars {
    int speed;
    int price;
    String color;

    public Cars() {
        // TODO Auto-generated constructor stub
    }

    public Cars(int price, int speed, String color) {
        // TODO Auto-generated constructor stub
        this.price = price;
        this.speed = speed;
        this.color = color;
    }

    @Override
    public String toString(){
        return "P" + price + "S" + speed + "C" +color;
    }


    public int compareTo(Cars o){
        return this.price-o.price;
    }

}
