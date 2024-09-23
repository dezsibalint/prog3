import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
static File wd=new File(System.getProperty("user.dir"));
protected static void hello(String[] cmd){
    System.out.println("Hello World!");
}
protected  static void ls(String []cmd){
File[]out=wd.listFiles();
if(cmd.length<2) {
    for (File i : out) {
        System.out.println(i.getName());
    }
}else {
    if(cmd[1].equals("-l")){
        for (File i : out) {
            System.out.printf(i.getName()+" "+i.getTotalSpace()+"byte");
                    if(i.isDirectory()){System.out.printf(" -d");}
                    else if(i.isFile()){System.out.printf(" -f");}

            System.out.println();
        }
    }

}
}

protected static void rm(String []cmd){
    File tmp=new File(cmd[1]);
    if(!tmp.delete()){
        System.out.println("Failed to delete "+cmd[1]);
    }

}

protected static void mkdir(String []cmd){
    File tmp=new File(cmd[1]);
    if(!tmp.mkdir()){
        System.out.println("Failed to create "+cmd[1]);
    }
}

protected static void mv(String []cmd){
    File tmp=new File(cmd[1]);
   if(!tmp.renameTo(new File(cmd[2]))){
       System.out.println("Failed to rename "+cmd[1]);
   }
}



protected static void pwd (String[]cmd) throws IOException {

  System.out.println(wd.getCanonicalPath());
}
protected static void cd(String[]cmd)   {
    if(cmd[1].equals("..")){
        wd=wd.getParentFile();
    }else{

        File tmp=new File(cmd[1]);
        if(tmp.exists()){
            wd=new File(cmd[1]);
        }else {
            System.out.println("No such file or directory");
        }

    }
}

    public static void main(String[] args) throws IOException {
        System.out.println("Add meg a parancsot");
        Reader rd = new Reader();



        while(true){
            String comm= rd.readLine();
            String[] cmd=comm.split(" ");
            if(cmd[0].equals("exit")){
                System.exit(0);
            }
            if(cmd[0].equals("hello")){
                hello(cmd);
            }
            if(cmd[0].equals("pwd")){
                pwd(cmd);
            }
            if(cmd[0].equals("ls")){
                ls(cmd);
            }
            if(cmd[0].equals("cd")){
                cd(cmd);
            }
            if(cmd[0].equals("mv")){
                mv(cmd);
            }
            if(cmd[0].equals("mkdir")){
                mkdir(cmd);
            }
            if(cmd[0].equals("rm")){
                rm(cmd);
            }

        }
        
    }
}