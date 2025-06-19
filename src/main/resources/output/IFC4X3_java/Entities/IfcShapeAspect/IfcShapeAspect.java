public class IfcShapeAspect {
    public List<IfcShapeModel> ShapeRepresentations;
    public IfcLabel Name;
    public IfcText Description;
    public IfcLogical ProductDefinitional;
    public IfcProductRepresentationSelect PartOfProductDefinitionShape;

    // === INVERSE CLAUSES ===
    // HasExternalReferences : SET [0:?] OF IfcExternalReferenceRelationship FOR RelatedResourceObjects
}
