public class Test03 {
    // 静态变量
    static String name = "蔡徐坤";
    // 成员变量
    int age  = 5;
    public static void main(String[] args) {
        // 局部变量
        char bb = 'b';
        long l = 19L;
        float f = 19.0f;
        System.out.println(name);
        System.out.println(new Test03().age);
        System.out.println(bb);
        System.out.println(l);
        System.out.println(f);
    }
}
