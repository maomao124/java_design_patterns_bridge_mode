package mao.shape;

/**
 * Project name(项目名称)：java设计模式_桥接模式
 * Package(包名): mao.shape
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/16
 * Time(创建时间)： 13:54
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static void main(String[] args)
    {
        Shape shape = new Circle(new Black());
        shape.draw();
        shape = new Circle(new Gray());
        shape.draw();
        shape = new Circle(new White());
        shape.draw();
        System.out.println("--------");
        shape = new Rectangle(new Black());
        shape.draw();
        shape = new Rectangle(new Gray());
        shape.draw();
        shape = new Rectangle(new White());
        shape.draw();
        System.out.println("--------");
        shape = new Square(new Black());
        shape.draw();
        shape = new Square(new Gray());
        shape.draw();
        shape = new Square(new White());
        shape.draw();
    }
}
