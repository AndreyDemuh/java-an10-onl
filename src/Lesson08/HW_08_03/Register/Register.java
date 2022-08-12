package Lesson08.HW_08_03.Register;

import Lesson08.HW_08_03.Documents.Documents;
import Lesson08.HW_08_03.InterfaceShowInfo.ShowInfoContractWithEmployee;
import Lesson08.HW_08_03.InterfaceShowInfo.ShowInfoFinancialInvoice;
import Lesson08.HW_08_03.InterfaceShowInfo.ShowerInfoContractForProducts;

public class Register implements ShowInfoContractWithEmployee, ShowInfoFinancialInvoice, ShowerInfoContractForProducts {

    private Documents[] documents;


    public Register() {
        this.documents = new Documents[10];
    }

    public void saveDocument(Documents document) {     //прописали метод который добавляет докумнет в регистр
        for (int i = 0; i < documents.length; i++) {
            if (documents[i] == null) {
                documents[i] = document;
                break;
            }
        }
    }
    public void removeDocuments(Documents document) {
        for (int i = 0; i < documents.length; i++) {
            if (documents[i].equals(document)) {
                documents[i] = null;
                break;
            }
        }
    }

    public Documents[] getDocuments() {
        return documents;
    }

    public void setDocuments(Documents[] documents) {
        this.documents = documents;
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


