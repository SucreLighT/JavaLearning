package Basic01_easyGo;

public class StringDemo {
    public static void main(String[] args) {
        // TODO 自动生成的方法存根
        char a[] = {' ','h','e','l','l','o'};
        String s1 = new String(a);
        char b[] = {'w','o','r','l','d'};
        String s2 = new String(b);
        String s = s1 + " " + s2;
        System.out.println(s);

        // 实现lastIndexOf()功能
        int size =s.lastIndexOf("");
        System.out.println("空字符串在s中最后的位置：" + size);
        System.out.println("字符串s长度为：" + s.length());

        // 实现substring()功能
        String substr = s.substring(6);
        System.out.println(substr);
        System.out.println("去除前后空格后长度：" + s.trim().length());

        // 实现replace()功能
        String newstr = s.replace('l', 'L');
        System.out.println(newstr);

        // 实现compareTo()功能
        String str = new String("b");
        String str2 = new String("a");
        String str3 = new String ("c");
        System.out.println(str + " compareTo " + str2 + ":" + str.compareTo(str2));
        System.out.println(str + " compareTo " + str3 + ":" + str.compareTo(str3));

        // 实现split()功能
        String ss = new String("abc,def,ghi,gkl");
        String[] newss = ss.split(",");
        for(int i = 0; i < newss.length; i++)
        {
            System.out.println(newss[i]);
        }
        System.out.println();
        String[] newss2 = ss.split(",", 2);
        for(int j = 0; j < newss2.length; j++)
        {
            System.out.println(newss2[j]);
        }
    }
}
