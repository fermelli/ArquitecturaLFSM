package websitepages;

public class HTMLHeader implements IHeader {

    String content;

    public HTMLHeader(String text) {
        this.content = String.format("<head>%s</head>", text);
    }

    @Override
    public String getContent() {
        return content;
    }

}
