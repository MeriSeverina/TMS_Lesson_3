package documents.lnvoice;
import documents.Document;
import java.util.Date;

/*
Класс содержащий информацию о финансовых накладных
 */
public class FinancialInvoice extends Document {

    int sumMonth;
    int codeDepartment;

    public FinancialInvoice (){
    }

    public FinancialInvoice (int sumMonth, Date docDate, long numDoc, int codeDepartment){
        super(numDoc, docDate);
        this.sumMonth=sumMonth;
        this.docDate=docDate;
        this.numDoc=numDoc;
        this.codeDepartment=codeDepartment;
    }
    @Override
    public String toString() {
        return "FinancialInvoice{" +
                "sumMonth=" + sumMonth +
                ", codeDepartment=" + codeDepartment +
                ", numDoc=" + numDoc +
                ", docDate=" + docDate +
                '}';
    }
}
