public class IfcRelSpaceBoundary : IfcRelConnects
{
    public IfcSpaceBoundarySelect RelatingSpace { get; set; }
    public IfcElement RelatedBuildingElement { get; set; }
    public IfcConnectionGeometry ConnectionGeometry { get; set; }
    public IfcPhysicalOrVirtualEnum PhysicalOrVirtualBoundary { get; set; }
    public IfcInternalOrExternalEnum InternalOrExternalBoundary { get; set; }

    // === EXTENDED BY ===
    // IfcRelSpaceBoundary1stLevel

    // === WHERE CLAUSES ===
    // CorrectPhysOrVirt : ((PhysicalOrVirtualBoundary = IfcPhysicalOrVirtualEnum.Physical) AND (NOT('IFC4X3_DEV_73740fe4.IFCVIRTUALELEMENT' IN TYPEOF(RelatedBuildingElement)))) OR ((PhysicalOrVirtualBoundary = IfcPhysicalOrVirtualEnum.Virtual) AND (('IFC4X3_DEV_73740fe4.IFCVIRTUALELEMENT' IN TYPEOF(RelatedBuildingElement)) OR   ('IFC4X3_DEV_73740fe4.IFCOPENINGELEMENT' IN TYPEOF(RelatedBuildingElement)))) OR (PhysicalOrVirtualBoundary = IfcPhysicalOrVirtualEnum.NotDefined)
}
