public class IfcLibraryReference : IfcExternalReference
{
    public IfcText Description { get; set; }
    public IfcLanguageId Language { get; set; }
    public IfcLibraryInformation ReferencedLibrary { get; set; }

    // === INVERSE CLAUSES ===
    // LibraryRefForObjects : SET [0:?] OF IfcRelAssociatesLibrary FOR RelatingLibrary
}
