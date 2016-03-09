package dropboxEasyAccess;

import java.util.Scanner;

public class JavaConsoleCMD {
	private String curPath = "/";
	
	public String getCommandPath(String cmd) {
		String path = curPath;
		Scanner cmdSc = new Scanner(cmd);
		String cmdText = cmdSc.next();
		String cmdArg = cmdSc.next();
		
//		System.out.println("!! "+cmdText+" "+cmdArg);
		
		if (cmdArg.length() < 1)
			cmdArg = "/";
		else if (cmdArg.equals("."))
			cmdArg = curPath;
		else if (cmdArg.length()>1 && cmdArg.substring(0, 2).equals("./"))
			cmdArg = curPath + cmdArg.substring(2) + "/";
		else if (cmdArg.charAt(0)!='/')
			cmdArg = curPath + cmdArg + "/";
		
		path = cmdArg.replace("//", "/");
		if (cmdText.equals("cd"))
			curPath = path;
		if (path.length() > 1) path = path.substring(0, path.length()-1);
		return path;
	}
	public String getCurrentPath()
	{
		return curPath;
	}
}
