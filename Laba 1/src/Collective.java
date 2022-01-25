

public class Collective {
	
	private Integer value;
	private String name;
	private Integer colvo;
	
	public Collective(Integer value, String name, Integer colvo) {
		this.value = value;
		this.name = name;
		this.colvo = colvo;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getColvo() {
		return colvo;
	}

	public void setColvo(Integer colvo) {
		this.colvo = colvo;
	}

	@Override
	public String toString() {
		return "Collective [value=" + value + ", name=" + name + ", colvo=" + colvo + "]";
	}
		
}
