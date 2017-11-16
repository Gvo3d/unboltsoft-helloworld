public class Main {

    public static void main(String[] args) {
        String name;
        try {
             name = args[0];
        } catch (NullPointerException e){
            name = null;
        }
        System.out.println("Hello "+ name!=null? name : "World!");
    }
}
