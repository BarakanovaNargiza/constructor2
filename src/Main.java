public class Main {
    public static void main(String[] args) {

        Sinder sinder= new Sinder();
        Programmer programmer = new Programmer();
        Dancer d = new Dancer();

        Persen[] persens = {sinder,programmer,d};
        for (Persen t :persens) {
            t.walk();

        }









    }
}