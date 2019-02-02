package prototypePattern.prototypeManager;

public class FAR implements OfficialDocument{
    public  OfficialDocument clone()
    {
        OfficialDocument  far = null;
        try
        {
            //调用的是Object的clone 由于事先的接口里继承了cloneAble 相当于它也实现了cloneable
            far  = (OfficialDocument)super.clone();
        }
        catch(CloneNotSupportedException  e)
        {
            System.out.println("不支持复制！");
        }
        return  far;
    }

    public  void display()
    {
        System.out.println("《可行性分析报告》");
    }
}
