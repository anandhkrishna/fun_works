import java.util.*;
public class MinesWeeper
{
	public static int ithUpperBound=-1;
	public static int jthUpperBound;
	public static int ithLowerBound;
	public static int jthLowerBound=-1;
	public static void start()
	{
		System.out.println();
		for(int i=0;i<67;i++)
		{
			System.out.print("---");
		}
		System.out.print("--");
	
		System.out.println();
		for(int i=0;i<67;i++)
		{
			System.out.print("---");
		}
		System.out.print("--");
		System.out.println();
		System.out.println();
		System.out.print("\t\t\t\t\t\t\t\t #    #  #  #    #  #####  #####  #    #  #####  #####  ####   #####  ####  ");
		System.out.println();
		System.out.print("\t\t\t\t\t\t\t\t ##  ##  #  ##   #  #      #      #    #  #      #      #   #  #      #   # ");
		System.out.println();
		System.out.print("\t\t\t\t\t\t\t\t # ## #  #  # #  #  ###    #####  # ## #  ###    ###    ####   ###    ####  ");
		System.out.println();
		System.out.print("\t\t\t\t\t\t\t\t #    #  #  #  # #  #          #  ##  ##  #      #      #      #      ##    ");
		System.out.println();
		System.out.print("\t\t\t\t\t\t\t\t #    #  #  #   ##  #####  #####  #    #  #####  #####  #      #####  # ###  ");
		System.out.println();
		System.out.println();
		for(int i=0;i<67;i++)
		{
			System.out.print("---");
		}
		System.out.print("--");
	
		System.out.println();
		for(int i=0;i<67;i++)
		{
			System.out.print("---");
		}
		System.out.print("--");
	}
	public static int[][] fillMatrix(int backMatrix[][],int i,int j,int n)
	{
		jthUpperBound=n;
		ithLowerBound=n;
		if(i-1!=ithUpperBound)
		{
			if(backMatrix[i-1][j]!=-1)
			{
				backMatrix[i-1][j]=backMatrix[i-1][j]+1;
			}
		}
		if(j+1!=jthUpperBound)
		{
			if(backMatrix[i][j+1]!=-1)
			{
				backMatrix[i][j+1]=backMatrix[i][j+1]+1;
			}
		}
		if(i+1!=ithLowerBound)
		{
			if(backMatrix[i+1][j]!=-1)
			{
				backMatrix[i+1][j]=backMatrix[i+1][j]+1;
			}
		}
		if(j-1!=jthLowerBound)
		{
			if(backMatrix[i][j-1]!=-1)
			{
				backMatrix[i][j-1]=backMatrix[i][j-1]+1;
			}
		}
		if(i-1!=ithUpperBound && j+1!=jthUpperBound)
		{
			if(backMatrix[i-1][j+1]!=-1)
			{
				backMatrix[i-1][j+1]=backMatrix[i-1][j+1]+1;
			}
		}
		if(i+1!=ithLowerBound && j+1!=jthUpperBound)
		{
			if(backMatrix[i+1][j+1]!=-1)
			{
				backMatrix[i+1][j+1]=backMatrix[i+1][j+1]+1;
			}
		}
		if(i+1!=ithLowerBound && j-1!=jthLowerBound)
		{
			if(backMatrix[i+1][j-1]!=-1)
			{
				backMatrix[i+1][j-1]=backMatrix[i+1][j-1]+1;
			}
		}
		if(i-1!=ithUpperBound && j-1!=jthLowerBound)
		{
			if(backMatrix[i-1][j-1]!=-1)
			{	
				backMatrix[i-1][j-1]=backMatrix[i-1][j-1]+1;
			}
		}
		return backMatrix;
	}
	public static char[][] changeInMatrix(int backMatrix[][],char showMatrix[][],int i,int j,int n)
	{

		jthUpperBound=n;
		ithLowerBound=n;
		int symbol=9311;
		if(i-1!=ithUpperBound)
		{
			
			showMatrix[i-1][j]=(char)(backMatrix[i-1][j]+'0');
		}
		if(j+1!=jthUpperBound)
		{
			
			showMatrix[i][j+1]=(char)(backMatrix[i][j+1]+'0');
		}
		if(i+1!=ithLowerBound)
		{
		
			showMatrix[i+1][j]=(char)(backMatrix[i+1][j]+'0');
		}
		if(j-1!=jthLowerBound)
		{
		
			showMatrix[i][j-1]=(char)(backMatrix[i][j-1]+'0');

		}
		if(i-1!=ithUpperBound && j+1!=jthUpperBound)
		{
		
			showMatrix[i-1][j+1]=(char)(backMatrix[i-1][j+1]+'0');
		}
		if(i+1!=ithLowerBound && j+1!=jthUpperBound)
		{
			
			showMatrix[i+1][j+1]=(char)(backMatrix[i+1][j+1]+'0');
		}
		if(i+1!=ithLowerBound && j-1!=jthLowerBound)
		{
			
			showMatrix[i+1][j-1]=(char)(backMatrix[i+1][j-1]+'0');
		}
		if(i-1!=ithUpperBound && j-1!=jthLowerBound)
		{
				
			showMatrix[i-1][j-1]=(char)(backMatrix[i-1][j-1]+'0');
		}
		return showMatrix;
	}
	public static char[][] matrixInitiation(int backMatrix[][],char showMatrix[][],int row,int col,int n)
	{
		showMatrix[row][col]=(char)(0+'0');
		changeInMatrix(backMatrix,showMatrix,row,col,n);
		return showMatrix;
	}
	
	public static void displayShowMatrix(char showMatrix[][],int n)
	{
		System.out.print("\t\t\t\t\t\t\t\t\t\t  ");
		for(int j=1;j<=n;j++)
		{
			System.out.print("   "+j);
		}
		System.out.println();
		System.out.print("\t\t\t\t\t\t\t\t\t\t  ");	
		for(int j=1;j<=n;j++)
		{
			System.out.print("   "+"_");
		}
			
		System.out.println();
		System.out.println();
		for(int i=0;i<n;i++)
		{
			System.out.print("\t\t\t\t\t\t\t\t\t\t"+(i+1)+"|");

			for(int j=0;j<n;j++)
			{
				System.out.print("   "+showMatrix[i][j]);
			}
			System.out.println();
			System.out.println();

		}
	}
	public static int[][] createMatrix(int backMatrix[][],int n,int mode,int bombCount)
	{
		Random random = new Random();
		while(bombCount>0)
		{
			int rand1=random.nextInt(n);
			int rand2=random.nextInt(n);
			if(backMatrix[rand1][rand2]!=-1)
			{
				backMatrix[rand1][rand2]=-1;
				bombCount--;
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(backMatrix[i][j]==-1)
				{
					fillMatrix(backMatrix,i,j,n);
				}
			}
		}
		return backMatrix;

	}
	public static Boolean[][] createCheckMatrix(Boolean checkMatrix[][],int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				checkMatrix[i][j]=false;
			}
		}
		return checkMatrix;
	}
	public static int flagging(int backMatrix[][],Boolean checkMatrix[][],char showMatrix[][],int positionI,int positionJ,int n,int bombCount,int noOfflags)
	{
		showMatrix[positionI][positionJ]='\u2691';
		if(backMatrix[positionI][positionJ]==-1 && checkMatrix[positionI][positionJ]==false)		
		{
			checkMatrix[positionI][positionJ]=true;
			bombCount--;
			noOfflags++;
			System.out.println(bombCount);

	
		}
		else if(checkMatrix[positionI][positionJ]==true)
		{
			noOfflags++;
		}
		return bombCount;
		
	}
	public static int unflagging(int backMatrix[][],Boolean checkMatrix[][],char showMatrix[][],int positionI,int positionJ,int n,int bombCount,int noOfflags)
	{
		if(checkMatrix[positionI][positionJ]==true  && showMatrix[positionI][positionJ]=='\u2691')
		{
			checkMatrix[positionI][positionJ]=false;
			showMatrix[positionI][positionJ]='\u25a9';
			if(backMatrix[positionI][positionJ]==-1)
			{
				bombCount=bombCount+1;
			}
		}
		return  bombCount;
	}
	public static Boolean selecting(int backMatrix[][],Boolean checkMatrix[][],char showMatrix[][],int positionI,int positionJ,int n,int bombCount,int noOfflags,Boolean start)
	{
		if(checkMatrix[positionI][positionJ]==false)
		{
			checkMatrix[positionI][positionJ]=true;
			if(showMatrix[positionI][positionJ]!='\u25a3' && backMatrix[positionI][positionJ]==-1)
			{
				start=dead(showMatrix,backMatrix,n,start);
			}
			else
			{
				showMatrix[positionI][positionJ]=(char)(backMatrix[positionI][positionJ]+'0');
			}
		}
		/*for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(showMatrix[])
			}
		}
		*/
		return start;
	}
	public static Boolean dead(char showMatrix[][],int backMatrix[][],int n,Boolean start)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(backMatrix[i][j]==-1)
				{
					showMatrix[i][j]='\u2739';
				}
			}
		}
		displayShowMatrix(showMatrix,n);
		System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t  "+"GAME OVER"+"\t\t\t\t\t\tWATCH ADD TO RESTART ▶"+"\n");
		start=false;
		return start;	
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int size=0;
		Boolean start=false;
		int positionI=0;
		int positionJ=0;
		int n=0;
		int noOfBombs=0;
		int noOfflags=0;
		

		/*for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(backMatrix[i][j]==-1)
				{
					fillMatrix(backMatrix,i,j);
				}
			}
		}
		*/
	/*	for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(" "+backMatrix[i][j]);
			}
			System.out.println();
		}
	*/
		start();
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t\t\t✹ ✹ ✹ ✹ ✹___--க ண்  ணி  வெ  டி வி ளை  யா  ட்  டு--___✹ ✹ ✹ ✹ ✹");
		System.out.println("enter size:"+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\texample...if size = 9 grid structure will be 9x9...");
		n=scan.nextInt();
		System.out.println();
		System.out.println("slect your difficulty.."+"\n1.easy"+"\n2.moderate"+"\n3.Hard"+"\n4.God Mode");
		int mode=scan.nextInt();
		char [][]showMatrix=new char[n][n];
		Boolean [][]checkMatrix = new Boolean[n][n];
		createCheckMatrix(checkMatrix,n);
		int bombCount=0;
		if(mode==1)
		{
			bombCount=n;
			System.out.println("BOMBS:"+bombCount+"✹");
		}
		if(mode==2)
		{
			bombCount=(n*2)/3;
			System.out.println("BOMBS:"+bombCount+"✹");
		}
		if(mode==3)
		{
			bombCount=n*2;
			System.out.println("BOMBS:"+bombCount+"✹");
		}
		if(mode==4)
		{
			bombCount=(n*5)/2;
			System.out.println("BOMBS:"+bombCount+"✹");
			System.out.println("play with your own risk ☣ ☣ ☣!!!");
			System.out.println();
			

		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				showMatrix[i][j]='\u25a9';
			}
		}
		displayShowMatrix(showMatrix,n);
		noOfflags=bombCount;
		System.out.println("press one to start the game:");
		int ok=0;
		ok=scan.nextInt();
		if(ok==1)
		{
			start=true;
			
		}
		int[][] backMatrix=new int[n][n];
		createMatrix(backMatrix,n,mode,bombCount);
		while(start)
		{	
			System.out.print("\033[H\033[2J");
      		System.out.flush();
      		start();
      		System.out.println();
			System.out.println("\t\t\t\t\t\t\t\t\t✹ ✹ ✹ ✹ ✹___--க ண்  ணி  வெ  டி வி ளை  யா  ட்  டு--___✹ ✹ ✹ ✹ ✹");
			System.out.println("FLAGS : "+noOfflags+'\u2691'+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tguides");
		
			/*for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print("  "+backMatrix[i][j]);
				}
				System.out.println();
			}*/
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(backMatrix[i][j]==0)
					{
						matrixInitiation(backMatrix,showMatrix,i,j,n);
					}
				}
			}
			displayShowMatrix(showMatrix,n);
			System.out.println("1.selct"+"\n"+"2.flag"+"\n"+"3.unflag"+"\n");
			System.out.println("enter your choice:");
			int choice=scan.nextInt();
			System.out.println("enter row and col index  "+"\t\t\t\t\t\t\t\t\t\t\t\t\t\texample if postion is 1-row and 1-column.then just type 1 1");
			positionI=scan.nextInt();
			positionJ=scan.nextInt();
			positionI=positionI-1;
			positionJ=positionJ-1;
			
			System.out.println();
			if(choice==1)
			{
				start=selecting(backMatrix,checkMatrix,showMatrix,positionI,positionJ,n,bombCount,noOfflags,start);
			}
			if(choice==2)
			{
				bombCount=flagging(backMatrix,checkMatrix,showMatrix,positionI,positionJ,n,bombCount,noOfflags);
				noOfflags--;
			}
			if(choice==3)
			{
				bombCount=unflagging(backMatrix,checkMatrix,showMatrix,positionI,positionJ,n,bombCount,noOfflags);
				noOfflags++;
			}
			/*for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(" "+showMatrix[i][j]);
				}
				System.out.println();	
			}
			*/
			if(start==false)
			{
				break;
			}
			System.out.println(bombCount);
			if(bombCount==0 )
			{
				for(int i=0;i<n;i++)
				{
					for(int j=0;j<n;j++)
					{
						if(checkMatrix[i][j]==false)
						{
							showMatrix[i][j]=(char)(backMatrix[i][j]+'0');
						}
					}
				}

				displayShowMatrix(showMatrix,n);
				System.out.println("WON");
				break;
			}
		}


	}

}