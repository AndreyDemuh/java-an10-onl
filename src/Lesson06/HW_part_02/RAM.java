package Lesson06.HW_part_02;

public class RAM {
    String nameRAM;
    int memoryRAM;

    public RAM(String nameRAM, int memoryRAM) {
        this.nameRAM = nameRAM;
        this.memoryRAM = memoryRAM;
    }
    public RAM (){
        this.nameRAM = "HyperX";
        this.memoryRAM = 8;
    }
    public void infoRAM(){
        System.out.println("Название (модель) RAM: " + nameRAM + "\nОбъем RAM: " + memoryRAM + " GB");
    }
}

