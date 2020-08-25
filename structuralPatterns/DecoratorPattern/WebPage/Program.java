public class Program {
    public static void main(String args[]) {
        WebPage myPage = new BasicWebPage();
        myPage = new AuthenticatedWebPage(myPage);
        myPage = new AuthorizedWebPage(myPage);
        myPage.display();
    }
}