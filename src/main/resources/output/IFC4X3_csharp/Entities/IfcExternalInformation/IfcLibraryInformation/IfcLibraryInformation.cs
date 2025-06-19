public class IfcLibraryInformation : IfcExternalInformation
{
    public IfcLabel Name { get; set; }
    public IfcLabel Version { get; set; }
    public IfcActorSelect Publisher { get; set; }
    public IfcDateTime VersionDate { get; set; }
    public IfcURIReference Location { get; set; }
    public IfcText Description { get; set; }

    // === INVERSE CLAUSES ===
    // LibraryInfoForObjects : SET [0:?] OF IfcRelAssociatesLibrary FOR RelatingLibrary
    // HasLibraryReferences : SET [0:?] OF IfcLibraryReference FOR ReferencedLibrary
}
