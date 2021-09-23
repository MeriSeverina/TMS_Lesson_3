package documents.ContractProd;
import documents.Document;
import java.util.Date;

/*
Класс содержащий информацию о контрактах на поставку товаров
 */

public class ContractProduct extends Document {

    String typeProd;
    int numberOfProducts;

    public ContractProduct () {
    }
    public ContractProduct (long numDoc, String typeProd, int numberOfProducts, Date docDate){
        super(numDoc,docDate);
        this.numDoc=numDoc;
        this.typeProd=typeProd;
        this.numberOfProducts=numberOfProducts;
        this.docDate=docDate;
    }

    @Override
    public String toString() {
        return "ContractProduct{" +
                "typeProd='" + typeProd + '\'' +
                ", numberOfProducts=" + numberOfProducts +
                ", numDoc=" + numDoc +
                ", docDate=" + docDate +
                '}';
    }
}
