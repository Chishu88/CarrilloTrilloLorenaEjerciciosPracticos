package org.example.models;

import java.util.ArrayList;

public class Directory {

    private int id;
    private String name;
    ArrayList<Directory> listOfSubdirectories;
    ArrayList<String> listOfFiles;

    public Directory() {
    }

    public Directory(int id, String name) {
        this.id = id;
        this.name = name;
        this.listOfSubdirectories = new ArrayList<>();
        this.listOfFiles = new ArrayList<>();
    }

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public ArrayList<Directory> getListOfSubdirectories() {return listOfSubdirectories;}

    public void setListOfSubdirectories(ArrayList<Directory> listOfSubdirectories) {this.listOfSubdirectories = listOfSubdirectories;}

    public ArrayList<String> getListOfFiles() {return listOfFiles;}

    public void setListOfFiles(ArrayList<String> listOfFiles) {this.listOfFiles = listOfFiles;}


    public static class ExplorerDirectories {
        public static void explorerDirectory(Directory directory, int level) {
            for (int i = 0; i < level; i++) {
                System.out.print("  ");
            }
            System.out.println(directory.name + "/");

            for (Directory subdirectory : directory.listOfSubdirectories) {
                explorerDirectory(subdirectory, level + 1);
            }

            for (String file : directory.listOfFiles) {
                for (int i = 0; i < level + 1; i++) {
                    System.out.print("  ");
                }
                System.out.println(file);
            }
        }
    }
}









