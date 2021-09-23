package documents;

/**
 * Абстрактный класс
 */

import java.util.Date;

public abstract class Document {
    public long numDoc;
    public Date docDate;

    public Document () {
    }

    public Document (long numDoc, Date docDate) {
    this.docDate=docDate;
    this.numDoc=numDoc;
    }

    @Override
    public String toString() {
        return "Document{" +
                "numDoc=" + numDoc +
                ", docDate=" + docDate +
                '}';
    }
}
