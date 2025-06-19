public class IfcContext : IfcObjectDefinition
{
    public IfcLabel ObjectType { get; set; }
    public IfcLabel LongName { get; set; }
    public IfcLabel Phase { get; set; }
    public SET [1:?] OF IfcRepresentationContext RepresentationContexts { get; set; }
    public IfcUnitAssignment UnitsInContext { get; set; }

    // === EXTENDED BY ===
    // IfcProject
    // IfcProjectLibrary

    // === INVERSE CLAUSES ===
    // IsDefinedBy : SET [0:?] OF IfcRelDefinesByProperties FOR RelatedObjects
    // Declares : SET [0:?] OF IfcRelDeclares FOR RelatingContext
}
