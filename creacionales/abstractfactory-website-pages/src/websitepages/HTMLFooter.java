package websitepages;

public class HTMLFooter implements IFooter {

    String content;

    public HTMLFooter(String text) {
        this.content = String.format("<footer>%s</footer>", text);
    }

    @Override
    public String getContent() {
        return content;
    }

}
