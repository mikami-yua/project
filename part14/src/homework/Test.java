package homework;

public class Test {
    public static void main(String[] args) {
        //构建一个军队
        Army army = new Army(4);//军队只有4个武器

        //创建武器对象
        Fighter fighter = new Fighter();
        Tank tank = new Tank();
        WuZiFeiJI wuZiFeiJI = new WuZiFeiJI();
        GaoShePao gaoShePao1 = new GaoShePao();
        GaoShePao gaoShePao2 = new GaoShePao();

        //添加武器

        try {
            army.addWeapon(fighter);
            army.addWeapon(tank);
            army.addWeapon(wuZiFeiJI);
            army.addWeapon(gaoShePao1);
            army.addWeapon(gaoShePao2);
        } catch (AddWeaponException e) {
            System.out.println(e.getMessage());
        }

        //攻击
        army.attackAll();

        //移动
        army.moveAll();
    }
}
