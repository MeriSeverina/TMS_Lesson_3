import documents.ContractProd.ContractProduct;
import documents.Document;
import documents.Register.IDocInfo;
import documents.lnvoice.FinancialInvoice;
import documents.Register.Register;
import documents.Staff.ContractEmployee;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Register register = new Register ();


        ContractProduct contractProduct1=new ContractProduct(5545645, "Телевизор", 54, new Date(20-01-2020));
        register.saveDocumentInRegister(contractProduct1);
        register.getDocumentInfoFromRegister(contractProduct1);
        System.out.println(contractProduct1);


        ContractEmployee contractEmployee1=new ContractEmployee(545, new Date(11-01-2002), new Date(23-01-2002), "Петр");
        register.saveDocumentInRegister(contractEmployee1);
        register.getDocumentInfoFromRegister(contractEmployee1);
        System.out.println(contractEmployee1);

        FinancialInvoice financialInvoice1=new FinancialInvoice(54000, new Date(30-01-2021), 225, 821);
        register.saveDocumentInRegister(financialInvoice1);
        register.getDocumentInfoFromRegister(financialInvoice1);
        System.out.println(financialInvoice1);
    }
}
