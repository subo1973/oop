# OOP02-Java基本输入输出
## 输出各种类型的变量的值
    public class Main {
        public static void main(String[] args) {
            int number = 100;
            System.out.println(number);
            char c1 = 'a'; //字符的要用单引号, 用于区分变量名和字符.
            System.out.println(c1);
            char c2 = '中'; //Java的char是Unicode的, 可以表示全世界的任何语言文字
            System.out.println(c2);
            byte b = 0b101; //二进制的0b101就是10进制的5
            System.out.println(b);
            double height = 1.72;
            System.out.println(height);
            boolean isOK = true;
            System.out.println(isOK);
        }
    }
运行后输出:

    100
    a
    中
    5
    1.72
    true
## 从键盘输入字符串
    import java.util.Scanner; //从路径java.util找到Scanner
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input Name:");
            String name = scanner.next();
            System.out.println("你好!" + name);
        }
    }
运行程序, 控制台上显示”Input Name:”后等待从键盘输入.

    Input Name:

输入subookman后, 程序继续执行. 程序的完整的运行结果如下:

    Input Name:
    subookman
    你好!subookman
## 从键盘输入各种类型的数据
Scanner能够自动把从键盘输入的内容转换成指定类型的数据.

    import java.util.Scanner; //从路径java.util找到Scanner
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input Name:");
            String name = scanner.next();
            System.out.println("你好!" + name);
            System.out.println("Input age(整数)");
            int age = scanner.nextInt();
            System.out.println("Input 身高(小数)");
            double height = scanner.nextDouble();
            System.out.println("Input 否是是学生(是输入true, 不是输入false)");
            boolean isStudent = scanner.nextBoolean();
            System.out.println("华丽的分割线------------");
            System.out.println("age=" + age);
            System.out.println("height=" + height);
            System.out.println("是学生吗?=" + isStudent);
        }
    }
运行结果:

    Input Name:
    zhangsanfeng
    你好!zhangsanfeng
    Input age(整数)
    120
    Input 身高(小数)
    1.72
    Input 否是是学生(是输入true, 不是输入false)
    false
    华丽的分割线------------
    age=120
    height=1.72
    是学生吗?=false
