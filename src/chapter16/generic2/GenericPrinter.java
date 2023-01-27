package chapter16.generic2;

public class GenericPrinter<T extends Material> {
	
	private T meterial;
	

	public T getmeterial() {
		return meterial;
	}

	public void setmeterial(T meterial) {
		this.meterial = meterial;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return meterial.toString();
	}
	
	
	

}
