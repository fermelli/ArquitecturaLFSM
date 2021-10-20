package websitepages;

public interface IWebsitePageFactory {

    public IHeader createHeader(String text);

    public IContent createContent(String text);

    public IFooter createFooter(String text);

}
