public class App {
    public static void main(String[] args) throws Exception {
        // StackStringContainer data = new StackStringContainer();
        QueueStringContainer data = new QueueStringContainer();

        data.push("1");
        data.push("2");
        data.push("3");
        data.push("4");
        data.push("5");
        // System.out.println("-----------------------");
        // System.out.println(data.pop());
        // System.out.println(data.pop());
        // System.out.println(data.pop());
        // System.out.println("-----------------------");
        System.out.println("-----------------------");
        System.out.println(data.peek());
        System.out.println(data.peek());
        System.out.println(data.peek());
        System.out.println("-----------------------");

        data.push("1");

        for (int i = 0; i < data.length(); i++) {
            System.out.println(data.get(i));
        }
        
        System.out.println(data.get(20));

    }
}
