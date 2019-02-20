# OOP01-Java版的Hello,World!详解
##Java从main方法开始执行

    public class DemoClass{
      public static void main(String[] args) {
        //Java程序从这里开始执行//表示本行是注释
        System.out.println("Hello,World!");
        System.out.println("世界,你好!");
        System.out.println("大家好!");
      }
    }
执行上面的程序会输出:

    Hello,World!
    世界,你好!
    大家好!

1. Java文件的名字必须是public class 后面的名字(通常称为类名).java
例如上面的程序必须放在DemoClass.java文件中. 
1. 英文字符大小写必须一致. Java认为大写和小写的字符不是同一个字符.
1. Java语言中用{}表示范围. 
   - 类名后面的一对{}表示这个类的包含的范围. void main(String[] args)后面的一对{}表示这个方法的包含的范围.
   - 方法名字后面的一对()是方法要处理的变量.
1. 分号表示一条语句的结尾. 双引号""表示字符串的开始和结尾.
1. 英文的句号(.)可以读作"的", 用于限定范围. 
例如语句System.out.println("Hello,World!");其真实含义是计算机系统(System)的标准输出(out,显示器)的输出一行方法(println)负责处理字符串"Hello,World!", 也就是在计算机的显示器上打印(显示)一行文字Hello,World!.
1. Java的源程序文件通常用包(package)组织起来， 包名就是目录名。
