package org.example;

import org.example.models.Directory;

import static org.example.models.Directory.ExplorerDirectories.explorerDirectory;

public class Main {
    public static void main(String[] args) {

     Directory root = new Directory(1, "root");
     Directory docs = new Directory(2, "Documents");
     Directory img = new Directory(3, "Imagery");
     Directory txt = new Directory(4, "Texts");

     root.getListOfSubdirectories().add(docs);
     root.getListOfSubdirectories().add(img);
     root.getListOfSubdirectories().add(txt);

     docs.getListOfFiles().add("document1.txt");
     docs.getListOfFiles().add("document2.txt");

     img.getListOfFiles().add("image1.jpg");
     img.getListOfFiles().add("image2.jpg");

     Directory.ExplorerDirectories.explorerDirectory(root, 0);
    }
}