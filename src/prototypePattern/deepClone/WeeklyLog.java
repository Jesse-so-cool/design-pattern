package prototypePattern.deepClone;

import prototypePattern.Attachment;

import java.io.*;

/**
 * 在深克隆中，无论原型对象的成员变量是值类型还是引用类型，都将复制一份给克隆对象，
 * 深克隆将原型对象的所有引用对象也复制一份给克隆对象。
 * 简单来说，在深克隆中，除了对象本身被复制外，对象所包含的所有成员变量也将复制
 */
public class  WeeklyLog implements Serializable
{
    private  Attachment attachment;
    private  String name;
    private  String date;
    private  String content;
    public  void setAttachment(Attachment attachment) {
        this.attachment  = attachment;
    }
    public  void setName(String name) {
        this.name  = name;
    }
    public  void setDate(String date) {
        this.date  = date;
    }
    public  void setContent(String content) {
        this.content  = content;
    }
    public  Attachment getAttachment(){
        return  (this.attachment);
    }
    public  String getName() {
        return  (this.name);
    }
    public  String getDate() {
        return  (this.date);
    }
    public  String getContent() {
        return  (this.content);
    }
    //使用序列化技术实现深克隆
    @Override
    public WeeklyLog clone() {
        //将对象写入流中
        ByteArrayOutputStream bao=new  ByteArrayOutputStream();
        ObjectOutputStream oos= null;
        try {
            oos = new ObjectOutputStream(bao);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            oos.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //将对象从流中取出
        ByteArrayInputStream bis=new  ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois= null;
        try {
            ois = new ObjectInputStream(bis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            return  (WeeklyLog)ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public  static void main(String args[])
    {
        WeeklyLog  log_previous, log_new = null;
        log_previous  = new WeeklyLog(); //创建原型对象
        Attachment  attachment = new Attachment(); //创建附件对象
        log_previous.setAttachment(attachment);  //将附件添加到周报中
        try
        {
            log_new =  log_previous.clone(); //调用深克隆方法创建克隆对象
        }
        catch(Exception e)
        {
            System.err.println("克隆失败！");
        }
        //比较周报
        System.out.println("周报是否相同？ " + (log_previous ==  log_new));
        //比较附件
        System.out.println("附件是否相同？ " +  (log_previous.getAttachment() == log_new.getAttachment()));
    }
}
