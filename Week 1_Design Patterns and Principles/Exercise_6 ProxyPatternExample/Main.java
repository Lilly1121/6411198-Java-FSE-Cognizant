public class Main {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("pic1.jpg");
        Image img2 = new ProxyImage("pic2.jpg");

        img1.display(); // loads from server
        img1.display(); // uses cache

        img2.display(); // loads from server
        img2.display(); // uses cache
    }
}
