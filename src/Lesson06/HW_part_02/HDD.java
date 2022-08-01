package Lesson06.HW_part_02;

public class HDD {
    String nameHDD;
    int memoryHDD;
    String type;  // external -внешний, internal - внеутренний.

    public HDD(String name, int memoryHDD, String type) {
        this.nameHDD = name;
        this.memoryHDD = memoryHDD;
        this.type = type;
    }
    public HDD(){

    }
    public void infoHDD(){
        System.out.println("Название HDD: "+ nameHDD + "\nОбъем HDD: " + memoryHDD + " GB" + "\nТип HDD: " + type);
    }
}
