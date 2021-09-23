package documents.Register;
import documents.Document;

public interface IDocInfo {

    void saveDocumentInRegister(Document document);

    String getDocumentInfoFromRegister(Document document);
}