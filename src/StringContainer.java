public class StringContainer {
    private String[] strings = new String[5];
	private int index = 0; // pointer to next free element in array

	public void put(String string) {
		if (index >= strings.length) {
			String[] tempArray = new String[strings.length * 2];
			for (int i = 0; i < strings.length; i++) {
				tempArray[i] = strings[i];
			}
			strings = tempArray;
		}
		strings[index] = string;
		index++;
	}
	
	public String get(int i) {
		if (i >= 0 && i<index) {
			return strings[i];
		} else {
			return null;
		}
	}
	
	public int length() {
		return index;
	}
}
