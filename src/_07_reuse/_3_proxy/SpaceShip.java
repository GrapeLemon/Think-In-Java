package _07_reuse._3_proxy;

/**
 * @Author wx-li
 * @Date 2019/8/26 14:21
 **/
public class SpaceShip extends SpaceShipConstols{
    private String name;

    public SpaceShip(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        SpaceShip protector = new SpaceShip("NESA Protector");
        protector.forward(100);
    }
}
