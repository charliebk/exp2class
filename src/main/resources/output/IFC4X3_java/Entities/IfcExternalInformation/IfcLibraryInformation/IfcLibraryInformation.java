public class IfcLibraryInformation extends IfcExternalInformation {
    public IfcLabel Name;
    public IfcLabel Version;
    public IfcActorSelect Publisher;
    public IfcDateTime VersionDate;
    public IfcURIReference Location;
    public IfcText Description;

    // === INVERSE CLAUSES ===
    // LibraryInfoForObjects : SET [0:?] OF IfcRelAssociatesLibrary FOR RelatingLibrary
    // HasLibraryReferences : SET [0:?] OF IfcLibraryReference FOR ReferencedLibrary
}
