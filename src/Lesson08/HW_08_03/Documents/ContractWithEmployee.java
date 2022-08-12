package Lesson08.HW_08_03.Documents;

public class ContractWithEmployee extends Documents{

    private String nameEmployee;  //поле имя сотрудника
    private String dateEndContract;  //поле дата окончания контракта

    public ContractWithEmployee(String type,
                                int numDocument,
                                String dataDocument,
                                String nameEmployee,
                                String dateEndContract) {
        super(type, numDocument, dataDocument);
        this.nameEmployee = nameEmployee;
        this.dateEndContract = dateEndContract;
    }

    public ContractWithEmployee(String type, int numDocument, String dataDocument) {
        super(type, numDocument, dataDocument);
    }

    public ContractWithEmployee() {
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getDateEndContract() {
        return dateEndContract;
    }

    public void setDateEndContract(String dateEndContract) {
        this.dateEndContract = dateEndContract;
    }

    @Override
    public void showInfoDoc(String type, int numDocuments, String dataDocument, String nameEmployee, String dateEndContract) {
        System.out.println("Тип документа: " + type + ", Номер документа: " + numDocuments + ", Дата документа " + dataDocument +
                ", Имя рабочего: " + nameEmployee + ", Дата окончания контракта: " + dateEndContract);
    }
}

