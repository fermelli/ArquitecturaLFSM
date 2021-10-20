package main;

import websitepages.HTMLWebsitePageFactory;
import websitepages.IWebsitePageFactory;

public class SimulatorWebsitePages {

    public static void main(String[] args) {

        IWebsitePageFactory websitePageFactory = new HTMLWebsitePageFactory();

        System.out.println(websitePageFactory.createHeader("Header").getContent());
        System.out.println(websitePageFactory.createContent("Content").getContent());
        System.out.println(websitePageFactory.createFooter("Footer").getContent());
    }
}
