package constructorinjection;

import java.util.List;

public class Employees {

	private int id;
	private String name;
	private student obj;
	private List<String> list;
	public Employees(int id, String name ,student obj,List<String> list) {
		this.id = id;
		this.name = name;
		this.obj=obj;
		this.list= list;
	}
	
	public Employees(int id ,String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", obj=" + obj + ", list=" + list + "]";
	}
	
}
