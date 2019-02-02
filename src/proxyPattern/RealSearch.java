package proxyPattern;

public class RealSearch implements Searcher {
    @Override
    public void search(String id, String keyword) {
        System.out.println("search"+ id +keyword);
    }
}
