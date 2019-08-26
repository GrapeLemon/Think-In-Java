package _07_reuse._3_proxy;

/**
 * @Author wx-li
 * @Date 2019/8/26 14:34
 **/
public class SpaceShipDelegation {
    private String name;
    private SpaceShipConstols constols = new SpaceShipConstols();

    public SpaceShipDelegation(String name) {
        this.name = name;
    }

    public void up(int volecity) {
        constols.up(volecity);
    }

    public void down(int volecity) {
        constols.down(volecity);
    }

    public void left(int volecity) {
        constols.left(volecity);
    }

    public void right(int volecity) {
        constols.right(volecity);
    }

    public void forward(int volecity) {
        constols.forward(volecity);
    }

    public void back(int volecity) {
        constols.back(volecity);
    }

    public void turboBoost() {
        constols.turboBoost();
    }

    public static void main(String[] args) {
        SpaceShipDelegation protector = new SpaceShipDelegation("NESA Protector");
        protector.forward(100);
    }


}
