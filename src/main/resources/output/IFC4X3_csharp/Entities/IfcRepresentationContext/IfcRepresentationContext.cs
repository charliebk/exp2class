public class IfcRepresentationContext
{
    public IfcLabel ContextIdentifier { get; set; }
    public IfcLabel ContextType { get; set; }

    // === EXTENDED BY ===
    // IfcGeometricRepresentationContext

    // === INVERSE CLAUSES ===
    // RepresentationsInContext : SET [0:?] OF IfcRepresentation FOR ContextOfItems
}
