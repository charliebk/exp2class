public class IfcRepresentationContext {
    public IfcLabel ContextIdentifier;
    public IfcLabel ContextType;

    // === EXTENDED BY ===
    // IfcGeometricRepresentationContext

    // === INVERSE CLAUSES ===
    // RepresentationsInContext : SET [0:?] OF IfcRepresentation FOR ContextOfItems
}
