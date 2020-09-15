public class StringContainer {

    private String[] datas;

    public void put(String string) {
        if (datas == null){
            datas = new String[1];
            datas[0] = string;
        }else{
            String[] buffer = new String[datas.length + 1];
            for(int i = 0; i < datas.length + 1; i++){
                if(i < datas.length){
                    buffer[i] = datas[i];
                } else {
                    buffer[i] = string;
                }
            }
            datas = buffer;
        }
    }

    public String get(int i) {
        if(i < datas.length){
            return datas[i];
        }else{
            return null;
        }
        
    }

    public int length() {
        return datas.length;
    }
}
