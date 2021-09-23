package documents.Register;

import documents.Document;

public class Register implements IDocInfo {

    Document[] registers = new Document[10];

    @Override
    public void saveDocumentInRegister(Document document) {
        for (int i = 0; i < registers.length; i++) {
            if (registers[i] == null) {
                registers[i] = document;
                return;
            }
        }
    }

    @Override
    public String getDocumentInfoFromRegister(Document document) {
        return document.toString();
    }

}
