package newtestfile;


/**
 * @author charwayH
 *
 */
public class TestMethod {

    /**
    public void testOne(){
        this.testTwo();
        System.out.println("我是testOne方法");
    }
    public void testTwo(){
        this.testThree();
        System.out.println("我是testTwo方法");
    }
    public void testThree(){
        System.out.println("我是testThree方法");
    }

    public static void main(String[] args) {
        TestMethod tm = new TestMethod();
        tm.testOne();
    }


    //递归--》本质是方法的调用
    //  设计一个方法

    public void buildTower(int floor){
        for (int i = 1; i <=floor ; i++) {
            System.out.println("盖到第" + i + "层");

        }
    }
     */


    public void buildHouse(int floor){
        if(floor > 0){
            buildHouse(floor - 1);
            System.out.println("盖到第" + floor + "层");
        }
    }
    public static void main(String[] args) {
        TestMethod testMethod = new TestMethod();
        testMethod.buildHouse(5);
    }
}
