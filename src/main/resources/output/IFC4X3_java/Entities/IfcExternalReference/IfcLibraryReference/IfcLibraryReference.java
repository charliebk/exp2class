public class IfcLibraryReference extends IfcExternalReference {
    public IfcText Description;
    public IfcLanguageId Language;
    public IfcLibraryInformation ReferencedLibrary;

    // === INVERSE CLAUSES ===
    // LibraryRefForObjects : SET [0:?] OF IfcRelAssociatesLibrary FOR RelatingLibrary
}
