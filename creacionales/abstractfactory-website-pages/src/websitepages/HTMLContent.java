package websitepages;

public class HTMLContent implements IContent {

    String content;

    public HTMLContent(String text) {
        this.content = String.format("<main>%s</main>", text);
    }

    @Override
    public String getContent() {
        return content;
    }

}
