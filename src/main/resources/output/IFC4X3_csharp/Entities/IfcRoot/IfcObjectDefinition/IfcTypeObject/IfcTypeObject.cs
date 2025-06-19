public class IfcTypeObject : IfcObjectDefinition
{
    public IfcIdentifier ApplicableOccurrence { get; set; }
    public SET [1:?] OF IfcPropertySetDefinition HasPropertySets { get; set; }

    // === EXTENDED BY ===
    // IfcTypeProcess
    // IfcTypeProduct
    // IfcTypeResource

    // === INVERSE CLAUSES ===
    // Types : SET [0:1] OF IfcRelDefinesByType FOR RelatingType

    // === WHERE CLAUSES ===
    // NameRequired : EXISTS(SELF\IfcRoot.Name)
    // UniquePropertySetNames : (NOT(EXISTS(HasPropertySets))) OR IfcUniquePropertySetNames(HasPropertySets)
}
