package Lesson06.HW_part_02;

public class HDD {
    String nameHDD;
    int memoryHDD;
    String type;

    public HDD(String name, int memoryHDD, String type) {
        this.nameHDD = name;
        this.memoryHDD = memoryHDD;
        this.type = type;
    }
    public HDD(){
        this.nameHDD = "Xiomi";
        this.memoryHDD = 1000;
        this.type = "внешний";
    }
    public void infoHDD(){
        System.out.println("Название HDD: "+ nameHDD + "\nОбъем HDD: " + memoryHDD + " GB" + "\nТип HDD: " + type);
    }
}
