package Lesson08.HW_08_03.Documents;

public class FinancialInvoice extends Documents{

    private int EndAmountPerMonth;  //поле итоговая сумма за месяц в классе финансовой наклодной
    private int codeDepartament;    //поле кода департамента

    public FinancialInvoice(String type,
                            int numDocument,
                            String dataDocument,
                            int endAmountPerMonth,
                            int codeDepartament) {
        super(type, numDocument, dataDocument);
        EndAmountPerMonth = endAmountPerMonth;
        this.codeDepartament = codeDepartament;
    }

    public FinancialInvoice(String type, int numDocument, String dataDocument) {
        super(type, numDocument, dataDocument);
    }

    public FinancialInvoice() {
    }

    public int getEndAmountPerMonth() {
        return EndAmountPerMonth;
    }

    public void setEndAmountPerMonth(int endAmountPerMonth) {
        EndAmountPerMonth = endAmountPerMonth;
    }

    public int getCodeDepartament() {
        return codeDepartament;
    }

    public void setCodeDepartament(int codeDepartament) {
        this.codeDepartament = codeDepartament;
    }

    @Override
    public void showInfoDoc(String type, int numDocuments, String dataDocument, int endAmountPerMonth, int codeDepartament) {
        System.out.println("Типо документа: " + type + ", Номер документа: " + numDocuments + ", Дата документа: " + dataDocument +
               ", Сумма затрат за месяц: " + endAmountPerMonth + ", Код департамента: " + codeDepartament);
    }
}
