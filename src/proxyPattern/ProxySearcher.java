package proxyPattern;

public class ProxySearcher implements Searcher {
    private RealSearch searcher = new RealSearch();

    @Override
    public void search(String id, String keyword) {
        AccessValidator validator = new AccessValidator();
        Logger logger = new Logger();
        //如果身份验证成功，则执行查询
        if (validator.Validate("杨过")) {
            searcher.search(id, keyword); //调用真实主题对象的查询方法
            logger.log(id); //记录查询日志
        } else {

        }
    }
}
