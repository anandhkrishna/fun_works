import java.util.*;

public class Directory
{
	Directory parentDir;
	String name;
	List<Directory> subDirectories=new LinkedList<>();
	List<String> files = new LinkedList<>();
	String fullPath="";

	public Directory()
	{	this.parentDir=null;
		this.name="root";
		this.fullPath=fullPath+"/"+name;
	}
	public Directory(String name,Directory parentDir)
	{
		this.parentDir=parentDir;
		this.name=name;
		this.fullPath=fullPath+"/"+name;
	}
	
}