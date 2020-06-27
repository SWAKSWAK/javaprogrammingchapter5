package final_exam.test10;

public class Dictionary extends PairMap{
	private int index=0;
	public Dictionary(int length) {
		this.keyArray = new String[length];
		this.valueArray = new String[length];
	}
	
	@Override
	String get(String key) {
		for (int i = 0 ; i < key.length() ; i++) {
			if (keyArray[i]!=null && keyArray[i].equals(key))
				return valueArray[i];
		}
			
		
			
		return null;
	}

	@Override
	void put(String key, String value) {
			keyArray[index] = key;
			valueArray[index] = value;
		index++;
		
	}

	@Override
	String delete(String key) {
		for (int i = 0 ; i < valueArray.length ; i++) {
			if (valueArray[i] != null && keyArray[i].equals(key)) {
				valueArray[i] = null;
				return valueArray[i];
			}else if (valueArray[i]==null)
				return key;
		}
		return key;
	}

	@Override
	int length() {
		return this.length();
	}
	
}
