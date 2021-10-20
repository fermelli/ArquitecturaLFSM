package websitepages;

public class HTMLWebsitePageFactory implements IWebsitePageFactory {

    @Override
    public IHeader createHeader(String text) {
        return new HTMLHeader(text);
    }

    @Override
    public IContent createContent(String text) {
        return new HTMLContent(text);
    }

    @Override
    public IFooter createFooter(String text) {
        return new HTMLFooter(text);
    }

}
