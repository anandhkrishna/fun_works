import java.util.*;
public class DirectoryMain
{
	public static void main(String []args)
	{
		//creating root
		Scanner scan=new Scanner(System.in);
		Directory root; 							
		root= new Directory();
		Directory currDir=root;
		List<Directory>directories=new LinkedList<>();
		directories.add(currDir);
		boolean start=false;
		//start
		System.out.println("enter 1 to start");
		int begin=scan.nextInt();
		if(begin==1)
		{

			start = true;
		}
		while(start)
		{	
			System.out.println("enter 2 to stop or 1 to continue ");
			begin=scan.nextInt();
			scan.nextLine();
			if(begin==2)
			{
				start = false;
				break;
			}
			//commanding 
			System.out.println("enter your operation  :");
			String operation=scan.nextLine();
			String which=scan.nextLine();	
			
			if(operation.equals("md") || operation.equals("MD"))
			{
				if(currDir.name.equals("root"))
				{
					try
					{
						Directory directory=new Directory(which,root);
						root.subDirectories.add(directory);
						currDir=directory;
						directories.add(currDir);
					}
					catch(Exception e)
					{

					}
				}
				else
				{
					Directory directory=new Directory(which,currDir);
					currDir.subDirectories.add(directory);
					currDir=directory;
					directories.add(currDir);
				}
			}
			if(operation.equals("pwd") ||operation.equals("PWD"))
			{
				if(which.equals("this")|| which.equals("THIS"))
				{
					System.out.println(currDir.fullPath);
				}
			}
			if(operation.equals("cd") || operation.equals("CD"))
			{
				for(Directory sub:currDir.subDirectories)
				{
					if(which.equals(sub.name))
					{
						currDir=sub;
						System.out.println("moved to"+currDir.fullPath);
					}
				}
				if(which.equals("/"))
				{
					for(Directory d:directories)
					{
						if(d.name.equals("root"))
						{
							currDir=d;
							System.out.println("moved to root");
						}
					}
				}
				if(which.equals(".."))
				{
					currDir=currDir.parentDir;
				}
			}

			if(operation.equals("touch")||operation.equals("TOUCH"))
			{
				String file=which;
				currDir.files.add(which);
				System.out.println(file+"created");
			}
			if(operation.equals("show")||operation.equals("SHOW"))
			{
				if(which.equals("tree")|| which.equals("TREE"))
				{
					for(Directory d:directories)
					{
						System.out.println(d.name);
						for(Directory sub:d.subDirectories)
						{
							System.out.println("dir: "+sub.name);
						}
						for(String file:d.files)
						{
							System.out.println("file "+file);
						}
					}
				}
			}
			if(operation.equals("exit")|| operation.equals("EXIT"))
			{
				if(which.equals("now")|| operation.equals("NOW"))
				{
					System.exit(0);
				}
			}
			//for(Directory d:directories)
			//{

			//	for(Directory)
			//}

		}
		//|| directory.parentDir.name.contains(directory.parentDir.subDirectories.directory.name)
		//if(operation.equalsTo("cd") || operation.equalsTo("CD"))
		//{

		//}

	}
}