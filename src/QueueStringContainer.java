public class QueueStringContainer extends StringContainer {
    public String peek() {
        String data = strings[0];

        for (int i = 0; i+1 < strings.length; i++) {
            strings[i] = strings[i + 1];
        }
        
        index--;
        return data;
    }
}
