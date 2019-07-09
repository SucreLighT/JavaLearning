package object;

public class ToString {
    public static void main(String[] args) {
        Stu stu = new Stu("小王","中国");
        System.out.println(stu);
        System.out.println(stu.toString());
    }
}

class Stu{
    private String name;
    private String country;

    public Stu(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
