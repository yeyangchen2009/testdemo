import java.io.File;

//打印目录树、结合递归
public class PrintFileTree {
    public static void main(String[] args) {
        File f = new File("D:\\颺塵\\视频\\高淇\\新建文件夹");
        // File f = new File(System.getProperty("user.dir"));
        printFile(f,0);
    }

    static void printFile(File file, int level) {
        for(int i=0; i<level; i++) {
            System.out.print("\t");
        }
        //输出文件名
        System.out.println(file.getName());

        if(file.isDirectory()) {
            File[] files = file.listFiles();//列出它所有的子文件、子目录
            for(File temp:files) {
                printFile(temp,level+1);
            }
        }
    }
}