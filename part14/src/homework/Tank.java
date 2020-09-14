package homework;

//坦克是武器：extends weapon
//可以移动的：implements moveable
//可以射击：implements shootable
public class Tank extends Weapon implements Moveable,Shootable{

    @Override
    public void move() {
        System.out.println("坦克移动");
    }

    @Override
    public void shoot() {
        System.out.println("坦克开炮");
    }
}
