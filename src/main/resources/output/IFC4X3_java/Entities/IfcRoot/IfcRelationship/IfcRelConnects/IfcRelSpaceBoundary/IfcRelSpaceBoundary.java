public class IfcRelSpaceBoundary extends IfcRelConnects {
    public IfcSpaceBoundarySelect RelatingSpace;
    public IfcElement RelatedBuildingElement;
    public IfcConnectionGeometry ConnectionGeometry;
    public IfcPhysicalOrVirtualEnum PhysicalOrVirtualBoundary;
    public IfcInternalOrExternalEnum InternalOrExternalBoundary;

    // === EXTENDED BY ===
    // IfcRelSpaceBoundary1stLevel

    // === WHERE CLAUSES ===
    // CorrectPhysOrVirt : ((PhysicalOrVirtualBoundary = IfcPhysicalOrVirtualEnum.Physical) AND (NOT('IFC4X3_DEV_73740fe4.IFCVIRTUALELEMENT' IN TYPEOF(RelatedBuildingElement)))) OR ((PhysicalOrVirtualBoundary = IfcPhysicalOrVirtualEnum.Virtual) AND (('IFC4X3_DEV_73740fe4.IFCVIRTUALELEMENT' IN TYPEOF(RelatedBuildingElement)) OR   ('IFC4X3_DEV_73740fe4.IFCOPENINGELEMENT' IN TYPEOF(RelatedBuildingElement)))) OR (PhysicalOrVirtualBoundary = IfcPhysicalOrVirtualEnum.NotDefined)
}
