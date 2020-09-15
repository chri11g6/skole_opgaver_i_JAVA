public class App {
    public static void main(String[] args) throws Exception {
        StringContainer data = new StringContainer();

        data.put("Kage");
        data.put("Ged");
        data.put("Is");
        data.put("Isbil");
        data.put("Bil");

        for (int i = 0; i < data.length(); i++) {
            System.out.println(data.get(i));
        }
        
        System.out.println(data.get(20));

    }
}
