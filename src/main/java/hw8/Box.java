package hw8;

public class Box {
    public int width;
    public double height;
    public int depth;

    public void volume() {
        System.out.println("Volume= "+width*height*depth);
    }

    public void boxarea(String name) {
        System.out.println(name+" received a package the size of:"+"\nWidth: "+width+"\nHeight: "+height+"\nDepth: "+depth);
    }

}
