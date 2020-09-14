package homework;

/**
 *
 */
public class Army {
    /**
     * 武器数组
     */
    private Weapon[] weapons=null;

    public Army(int count){
        //动态初始化，数组中每个元素是null
        weapons = new Weapon[count];
    }

    /**
     * 将武器加入数组
     * @param weapon
     */
    public void addWeapon(Weapon weapon) throws AddWeaponException {
        for (int i=0;i<weapons.length;i++){
            if(null==weapons[i]){
                weapons[i]=weapon;
                System.out.println("武器"+weapon+"添加成功");
                return;
            }
        }
        //执行至此处说明没有添加成功
        throw new AddWeaponException("武器数量已达上限");
    }

    /**
     *所有可攻击的武器攻击
     */
    public void attackAll(){
        for (int i=0;i<weapons.length;i++){
            if(weapons[i] instanceof Shootable){
                //调用子类中特有的方法，向下转型
                Shootable shootable=(Shootable)weapons[i];
                shootable.shoot();
            }
        }
    }

    /**
     * 所有可移动的武器移动
     */
    public void moveAll(){
        for (int i=0;i<weapons.length;i++){
            if(weapons[i] instanceof Moveable){
                Moveable moveable=(Moveable) weapons[i];
                moveable.move();
            }
        }
    }
}
