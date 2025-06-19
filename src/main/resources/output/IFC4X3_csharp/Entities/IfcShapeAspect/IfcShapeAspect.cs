public class IfcShapeAspect
{
    public List<IfcShapeModel> ShapeRepresentations { get; set; }
    public IfcLabel Name { get; set; }
    public IfcText Description { get; set; }
    public IfcLogical ProductDefinitional { get; set; }
    public IfcProductRepresentationSelect PartOfProductDefinitionShape { get; set; }

    // === INVERSE CLAUSES ===
    // HasExternalReferences : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
}
