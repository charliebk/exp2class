public class IfcContextDependentUnit : IfcNamedUnit
{
    public IfcLabel Name { get; set; }

    // === INVERSE CLAUSES ===
    // HasExternalReference : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
}
