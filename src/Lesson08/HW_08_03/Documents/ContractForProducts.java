package Lesson08.HW_08_03.Documents;

public class ContractForProducts extends Documents {


    private String typeProducts;   // поле тип товара в контракте на поставку товара
    private int quantityProducts;  // поле количесвта товара в контракте на поставку товара

    public ContractForProducts(String type,
                               int numDocument,
                               String dataDocument,
                               String typeProducts,
                               int quantityProducts) {
        super(type, numDocument, dataDocument);
        this.typeProducts = typeProducts;
        this.quantityProducts = quantityProducts;
    }

    public ContractForProducts(String type, int numDocument, String dataDocument) {
        super(type, numDocument, dataDocument);
    }

    public ContractForProducts() {
    }

    public String getTypeProducts() {
        return typeProducts;
    }

    public void setTypeProducts(String typeProducts) {
        this.typeProducts = typeProducts;
    }

    public int getQuantityProducts() {
        return quantityProducts;
    }

    public void setQuantityProducts(int quantityProducts) {
        this.quantityProducts = quantityProducts;
    }

    @Override
    public void showInfoDoc(String type, int numDocuments, String dataDocument, String typeProducts, int quantityProducts) {
        System.out.println("Типо документа: " + type + ", Номер документа: " + numDocuments + ", Дата документа: "
                + dataDocument + ", Тип продукции: " + typeProducts + ", Количество товара: " + quantityProducts);
    }
}

