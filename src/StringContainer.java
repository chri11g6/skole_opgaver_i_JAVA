public class StringContainer {

    private String[] data;

    public void put(String string) {
        if (data == null){
            data = new String[1];
            data[0] = string;
        }else{
            String[] buffer = new String[data.length + 1];
            for(int i = 0; i < data.length + 1; i++){
                if(i < data.length){
                    buffer[i] = data[i];
                } else {
                    buffer[i] = string;
                }
            }
            data = buffer;
        }
    }

    public String get(int i) {
        return data[i];
    }

    public int length() {
        return data.length;
    }
}
