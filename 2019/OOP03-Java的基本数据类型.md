# Java的基本数据类型
整数, 有理数, 字符, 字符串, 字节, 逻辑值/布尔值, 对象的名字

|数据类型名称 |占用内存大小 |中文名称 |示例              |说明               |
| ------------- | ------------- | --------- | ------------ |-------------|
|byte|	8位|	字节|	0x1A, 26, 0b0001_1010|	16进制,10进制,2进制
|char|16位|字符|’m’, ‘\u0000’, ‘\uffff’|16-bit Unicode字符|
|short|16位|短整数|998|16-bit有符号整数|
|int|32位|整数|123456789|32-bit 有符号整数|
|long|64位|长整数|123_456_789_000_000L|64-bit有符号整数|
|float|32位|浮点数|123.456|32-bit IEEE 754|
|double|64位|双精度浮点数|123.456789|64-bit IEEE 754|
|boolean|不应当知道|逻辑值/布尔值|true, false|猜测是1位 |	
|名字变量|不应当知道|名字|对象名称, 代表对象|猜测是32位|

## 数据类型之间的转换
### 字符串转数字/逻辑类型
- String转int用Integer.parseInt()
- String转double用Double.parseDouble()
- String转boolean用Boolean.parseBoolean()

示例如下:

	public class Convert {
	    public static void main(String[] args) {
	        int age = Integer.parseInt("120");
	        age++;
	        double height = Double.parseDouble("1.72");
	        height += 0.01;
	        boolean isStudent = Boolean.parseBoolean("false");
	        isStudent = isStudent || true;
	        System.out.println("age=" + age);
	        System.out.println("height=" + height);
	        System.out.println("isStudent=" + isStudent);
	    }
	}
运行结果:

	age=121
	height=1.73
	isStudent=true

### 数字/逻辑类型转字符串
- 任何类型转String一律用String.valueOf().

示例如下:

    public class ConvertToString {
        public static void main(String[] args) {
            String age = String.valueOf(120);
            String height = String.valueOf(1.73);
            String isStudent = String.valueOf(true);
            System.out.println("age=" + age);
            System.out.println("height=" + height);
            System.out.println("isStudent=" + isStudent);
        }
    }
运行结果:

    age=120
    height=1.73
    isStudent=true
