package sec06.ch07;

public interface MyList {
	public abstract void add(int value);
	public abstract void add(int idx, int value);
	
	public abstract int size();
	public abstract int get(int index);

	public abstract int remove();
	public abstract int remove(int delVal);
	}


