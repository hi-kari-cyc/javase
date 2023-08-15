package shujia25.day07.test;

/*

        3.某公司要开发新游戏，请用面向对象的思想，设计游戏中的蛇怪和蜈蚣精  设定
            1)蛇怪类:
            属性包括：怪物名字，生命值，攻击力
            方法包括：攻击，移动（曲线移动），补血（当生命值<10 时，可以补加 20 生命值）
            2)蜈蚣精类：
            属性包括：怪物名字，生命值，攻击力
            方法包括：攻击，移动（飞行移动）
            要求
            1)分析蛇怪和蜈蚣精的公共成员，提取出父类—怪物类
            2)利用继承机制，实现蛇怪类和蜈蚣精类
            3)攻击方法，描述攻击状态。内容包括怪物名字，生命值，攻击力
            4)编写测试类，分别测试蛇怪和蜈蚣精的对象及相关方法
            定义名为 mon 的包存怪物类，蛇怪类，蜈蚣精类和测试类
 */
class Monster {
    private String name;
    private int hp;
    private int ad;

    public Monster(String name, int hp, int ad) {
        this.name = name;
        setHp(hp);
        setAd(ad);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp > 0) {
            this.hp = hp;
        } else {
            System.out.println("请正确输入生命值！");
        }
    }

    public int getAd() {
        return ad;
    }

    public void setAd(int ad) {
        if (ad > 0) {
            this.ad = ad;
        } else {
            System.out.println("请正确输入攻击力！");
        }
    }

    public void attack() {
        System.out.println("怪物" + name + "展开攻击");
    }

    public void move() {
    }
}

class Snake extends Monster {

    public Snake(String name, int hp, int ad) {
        super(name, hp, ad);       // 在子类中调用父类的属性
    }

    public void move() {
        System.out.println("我是" + getName() + "，我走S型路线");
    }

    public void blood() {
        if (getHp() < 10) {
            setHp(getHp()+20);
            System.out.println("实施大蛇补血术。。。。。。，当前生命值为：" + getHp());
        } else {
            setHp(getHp());
        }
    }

    public void show() {
        attack();
        System.out.println("当前生命值是：" + getHp());
        System.out.println("攻击力是：" + getAd());
        blood();
        move();
    }
}

class Centipede extends Monster {

    public Centipede(String name, int hp, int ad) {
        super(name, hp, ad);
    }

    public void move() {
        System.out.println("我是" + getName() + "，御风飞行");
    }

    public void show() {
        attack();
        System.out.println("当前生命值是：" + getHp());
        System.out.println("攻击力是：" + getAd());
        move();
    }
}

public class HomeTest3 {
    public static void main(String[] args) {
        Snake g1 = new Snake("蛇妖甲", 5, 20);
        g1.show();
        System.out.println("====================");
        Centipede g2 = new Centipede("蜈蚣乙", 60, 15);
        g2.show();
    }
}