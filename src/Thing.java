
public abstract class Thing {
	private Field field;
	
	Thing(Field field) {
		this.field = field;
	}
	
	public abstract void Destroy();
	public abstract boolean InteractWorker(Directions d);
	
	public Field GetField() {
		return field;
	}
	
	public abstract boolean Movable(Directions d);
	public abstract boolean InteractBox(Directions d);
}
