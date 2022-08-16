package mao.shape;

/**
 * Project name(项目名称)：java设计模式_桥接模式
 * Package(包名): mao.shape
 * Class(类名): Rectangle
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/16
 * Time(创建时间)： 13:52
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Rectangle implements Shape
{
    private final Color color;

    public Rectangle(Color color)
    {
        this.color = color;
    }

    @Override
    public void draw()
    {
        System.out.println("画一个颜色为" + color.getColor() + "的长方形");
    }
}
