package Lesson06.HW_part_02;

public class HDD {
    String nameHDD;
    int memoryHDD;
    String type;  // external -�������, internal - �����������.

    public HDD(String name, int memoryHDD, String type) {
        this.nameHDD = name;
        this.memoryHDD = memoryHDD;
        this.type = type;
    }
    public HDD(){

    }
    public void infoHDD(){
        System.out.println("�������� HDD: "+ nameHDD + "\n����� HDD: " + memoryHDD + " GB" + "\n��� HDD: " + type);
    }
}
