package proxyPattern;

public class Logger {
    public void log(String id){
        System.out.println("更新数据库，用户'{0}'查询次数加1"+id);
    }
}
