package homework;

/**
 * 高射炮是武器，不能移动，可以射击
 */
public class GaoShePao extends Weapon implements Shootable {
    @Override
    public void shoot() {
        System.out.println("高射炮开炮");
    }
}
