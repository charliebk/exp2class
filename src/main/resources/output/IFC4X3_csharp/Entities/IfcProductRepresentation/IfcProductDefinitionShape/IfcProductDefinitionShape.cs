public class IfcProductDefinitionShape : IfcProductRepresentation
{

    // === INVERSE CLAUSES ===
    // ShapeOfProduct : SET [1:?] OF IfcProduct FOR Representation
    // HasShapeAspects : SET [0:?] OF IfcShapeAspect FOR PartOfProductDefinitionShape

    // === WHERE CLAUSES ===
    // OnlyShapeModel : SIZEOF(QUERY(temp <* Representations | (NOT('IFC4X3_DEV_73740fe4.IFCSHAPEMODEL' IN TYPEOF(temp))) )) = 0
}
