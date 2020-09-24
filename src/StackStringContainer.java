public class StackStringContainer extends StringContainer {
    public String pop() {
        String data = strings[index-1];
        strings[index-1] = null;
        
        index--;

        return data;
    }
}
