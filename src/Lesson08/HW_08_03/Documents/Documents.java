package Lesson08.HW_08_03.Documents;

import Lesson08.HW_08_03.Register.Register;
import Lesson08.HW_08_03.InterfaceShowInfo.ShowInfoContractWithEmployee;
import Lesson08.HW_08_03.InterfaceShowInfo.ShowInfoFinancialInvoice;
import Lesson08.HW_08_03.InterfaceShowInfo.ShowerInfoContractForProducts;

import java.util.Objects;

public abstract class Documents extends Register implements ShowerInfoContractForProducts, ShowInfoContractWithEmployee, ShowInfoFinancialInvoice {

    private String type;
    private int numDocument;     //поле номер документа (есть у всех документов)
    private String dataDocument;    //поле дата создания документа (есть у всех документов)

    public Documents(String type, int numDocument, String dataDocument) {
        this.type = type;
        this.numDocument = numDocument;
        this.dataDocument = dataDocument;
    }

    public Documents() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumDocument() {
        return numDocument;
    }

    public void setNumDocument(int numDocument) {
        this.numDocument = numDocument;
    }

    public String getDataDocument() {
        return dataDocument;
    }

    public void setDataDocument(String dataDocument) {
        this.dataDocument = dataDocument;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Documents documents = (Documents) o;
        return numDocument == documents.numDocument && dataDocument == documents.dataDocument;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numDocument, dataDocument);
    }

    @Override
    public void showInfoDoc(String type, int numDocuments, String dataDocument, String nameEmployee, String dateEndContract) {

    }

    @Override
    public void showInfoDoc(String type, int numDocuments, String dataDocument, int endAmountPerMonth, int codeDepartament) {

    }

    @Override
    public void showInfoDoc(String type, int numDocuments, String dataDocument, String typeProducts, int quantityProducts) {

    }
}


