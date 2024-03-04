package ch12.sec04;

public class GetProperty {
    public static void main(String[] args) {

        String osName = System.getProperty("os.name");
        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("user.home");

        System.out.println(osName);
        System.out.println(userName);
        System.out.println(userHome);
    }
}
