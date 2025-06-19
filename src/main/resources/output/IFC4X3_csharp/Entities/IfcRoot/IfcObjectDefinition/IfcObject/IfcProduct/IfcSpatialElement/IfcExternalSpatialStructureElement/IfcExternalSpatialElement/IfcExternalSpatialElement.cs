public class IfcExternalSpatialElement : IfcExternalSpatialStructureElement
{
    public IfcExternalSpatialElementTypeEnum PredefinedType { get; set; }

    // === INVERSE CLAUSES ===
    // BoundedBy : SET [0:?] OF IfcRelSpaceBoundary FOR RelatingSpace
}
