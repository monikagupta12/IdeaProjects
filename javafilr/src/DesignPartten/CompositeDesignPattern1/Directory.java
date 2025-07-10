package DesignPartten.CompositeDesignPattern1;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    String name;
    List<FileSystem> list;
    public Directory(String name) {
        this.name = name;
        list=new ArrayList<>();
    }

    public void addNewFile(FileSystem fs) {
       list.add(fs);
    }

    @Override
    public void ls() {
        System.out.println("Directory Name="+name);
        System.out.println();
        System.out.println("file inside directory"+ name);
        for (FileSystem fs:list){
            fs.ls();
        }
        System.out.println();
    }
}
