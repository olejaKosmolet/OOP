package ООП.Lection2.Ex006.Interface;

import ООП.Lection2.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
