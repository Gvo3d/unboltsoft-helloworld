public class Main {

    public static void main(String[] args) {
        String name;
        try {
             name = args[0];
        } catch (NullPointerException e){
            name = null;
        }
        
        //name!=null ? name : "World!"
        if(name == null) { // not corect
            name = name; //not corect
        } else () {
            name = "World!";
        }
        
        System.out.println("Hello " + name);
    }
}
