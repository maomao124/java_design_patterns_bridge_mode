package mao.video_player;

/**
 * Project name(项目名称)：java设计模式_桥接模式
 * Package(包名): mao.video_player
 * Class(类名): AVIFile
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/16
 * Time(创建时间)： 13:31
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class AVIFile implements VideoFile
{

    @Override
    public void decode(String fileName)
    {
        System.out.println("avi视频文件：" + fileName);
    }
}
