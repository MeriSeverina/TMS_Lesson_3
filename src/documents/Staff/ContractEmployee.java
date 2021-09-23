package documents.Staff;
import documents.Document;
import java.util.Date;

/*
Класс содержащий информацию о контрактах сотрудников
*/

    public class ContractEmployee extends Document {

    String nameEmployee;
    Date contractEndDate;

    public ContractEmployee () {
    }

    public ContractEmployee (long NumDoc, Date docDate, Date contractEndDate, String nameEmployee){
    super(NumDoc, docDate);
    this.numDoc=NumDoc;
    this.docDate=docDate;
    this.contractEndDate=contractEndDate;
    this.nameEmployee=nameEmployee;
    }
        @Override
        public String toString() {
            return "ContractEmployee{" +
                    "nameEmployee='" + nameEmployee + '\'' +
                    ", contractEndDate=" + contractEndDate +
                    ", NumDoc=" + numDoc +
                    ", docDate=" + docDate +
                    '}';
        }
    }
