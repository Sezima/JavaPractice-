public class some {
    public static void main(String[] args) {

        String str = "Hello world";
        System.out.println((str.charAt(4)));
        System.out.println(str.indexOf("wor"));
        System.out.println(str.indexOf(4));
        System.out.println(str.length()-1);
        System.out.println(str.substring(4, 5));
        System.out.println(str.substring(str.length()-3));
        System.out.println(str.substring(str.indexOf("rld")));

    }
}
