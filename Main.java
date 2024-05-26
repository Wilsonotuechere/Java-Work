package java_class_barka;

public class Main {
    String name = "wilson otuechere";
    String password;
    String schoolName;
    String matricNo;
    int staffNo;
    public static void main(String[] args) {
        Person wilson = new Person("binghamUni", "wilson", "uk1234", "059");
        Person lecturer = new Person("uniBingham", "barka", "uk1234", "0098");

        wilson.setName("wilson");
        wilson.setPass("uk1234");
        System.out.println(wilson.getName());
        System.out.println(wilson.getName());
        System.out.println(wilson.getPass());
    }


}


