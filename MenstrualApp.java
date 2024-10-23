
public class MenstrualApp{
	private int lastCycleDate;
	private String name;
	
	public void setDate(int lastCycleDate){
		this.lastCycleDate = lastCycleDate;
	}
	
	public int getDate (){
		return lastCycleDate;
	}
	
	public void setName(String name){
		this.name  =  name;
	}
	
	public String getName(){
		return name;
	}
}