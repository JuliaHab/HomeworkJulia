package hw9;

public class Dogs {

    private String nikename;
    private int age;
    private String coloring;

    public void BuyDog (String name){
        System.out.println(name+" bought himself a "+coloring+" dog. He called him "+nikename+", the dog is "+age+" years old.");
    }

    public Dogs(){}

    public Dogs(String nike, int age, String coloring){
        nikename = nike;
        this.age = age;
        this.coloring = coloring;
    }

    public void setNikename(String name){
        nikename = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setColoring(String color){
        coloring = color;
    }

    public String getNikename(){
        return nikename;
    }
    public int getAge(){
        return this.age;
    }
    public String getColoring(){
        return coloring;
    }
}
