package Lesson06.HW_part_02;

public class RAM {
    String nameRAM;
    int memoryRAM;

    public RAM(String nameRAM, int memoryRAM) {
        this.nameRAM = nameRAM;
        this.memoryRAM = memoryRAM;
    }
    public RAM (){

    }
    public void infoRAM(){
        System.out.println("�������� (������) RAM: " + nameRAM + "\n����� RAM: " + memoryRAM + " GB");
    }
}
