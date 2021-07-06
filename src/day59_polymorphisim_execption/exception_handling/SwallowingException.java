package day59_polymorphisim_execption.exception_handling;

public class SwallowingException {
    public static void main(String[] args) {
        try {
            System.out.println("hello");
            System.out.println(5 / 0);
        } catch (Exception ignore) {
        }
        System.out.println("how are you today?");
        System.out.println("we just suppressed / swallowed the runtime exception");
        System.out.println("error is not reported, we just ignore it . nobody knows about it");
    }
}