public class Alumn{
	private String name, lastname, noControl, gesc;

public Alumn(String name, String lastname, String noControl, String gesc){
	this.name = name;
	this.lastname = lastname;
	this.noControl = noControl;
	this.gesc = gesc;
}

public void inscribirse(){
	System.out.println(name + "" + lastname + "has been enrrolled.");
}
public void pagarColegiatura(){
	System.out.println(name + "" + lastname + "has paid the tuition.");
}
public void darseDeBaja(){
	System.out.println(name + "" + lastname + "has withdrawn.");
}
@Override
public String toString(){
	return "Alumn{name='" + name + "', lastname='" + lastname + "', noControl='" + noControl + "', gesc='" + gesc + "'}";
}
public String getNoControl(){

	return noControl;
}

}
