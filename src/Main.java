import java.net.SocketTimeoutException;

public class Main {
    public static void main(String[] args)
    {
        Person Colton = new Person("Colton", "Fox", "000001", "Student", 2003);

        System.out.println(Colton);
        System.out.println(Colton.getFullName());
        System.out.print(Colton.getFormalName());
        System.out.println("Current age is " + Colton.getAge());
        System.out.println("Age at 2023 " + Colton.getAge(2023));
    }
}