public class IfcContext extends IfcObjectDefinition {
    public IfcLabel ObjectType;
    public IfcLabel LongName;
    public IfcLabel Phase;
    public SET [1:?] OF IfcRepresentationContext RepresentationContexts;
    public IfcUnitAssignment UnitsInContext;

    // === EXTENDED BY ===
    // IfcProject
    // IfcProjectLibrary

    // === INVERSE CLAUSES ===
    // IsDefinedBy : SET [0:?] OF IfcRelDefinesByProperties FOR RelatedObjects
    // Declares : SET [0:?] OF IfcRelDeclares FOR RelatingContext
}
