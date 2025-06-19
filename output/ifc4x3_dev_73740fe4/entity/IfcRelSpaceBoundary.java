package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcRelSpaceBoundary extends IfcRelConnects {

    public IfcSpaceBoundarySelect RelatingSpace;
    public IfcElement RelatedBuildingElement;
    public IfcConnectionGeometry ConnectionGeometry; // OPTIONAL
    public IfcPhysicalOrVirtualEnum PhysicalOrVirtualBoundary;
    public IfcInternalOrExternalEnum InternalOrExternalBoundary;
    // INVERSE attributes:
    // CorrectPhysOrVirt : ((PhysicalOrVirtualBoundary = IfcPhysicalOrVirtualEnum.Physical)
    // AND (NOT('IFC4X3_DEV_73740fe4.IFCVIRTUALELEMENT' IN TYPEOF(RelatedBuildingElement))))
    // OR
    // ((PhysicalOrVirtualBoundary = IfcPhysicalOrVirtualEnum.Virtual)
    // AND (('IFC4X3_DEV_73740fe4.IFCVIRTUALELEMENT' IN TYPEOF(RelatedBuildingElement))
    // OR   ('IFC4X3_DEV_73740fe4.IFCOPENINGELEMENT' IN TYPEOF(RelatedBuildingElement))))
    // OR
    // (PhysicalOrVirtualBoundary = IfcPhysicalOrVirtualEnum.NotDefined);

    // SUPERTYPE OF:
    // - IfcRelSpaceBoundary1stLevel SUBTYPE OF IfcRelConnects

    // WHERE constraints:
    // CorrectPhysOrVirt : ((PhysicalOrVirtualBoundary = IfcPhysicalOrVirtualEnum.Physical)
    // AND (NOT('IFC4X3_DEV_73740fe4.IFCVIRTUALELEMENT' IN TYPEOF(RelatedBuildingElement))))
    // OR
    // ((PhysicalOrVirtualBoundary = IfcPhysicalOrVirtualEnum.Virtual)
    // AND (('IFC4X3_DEV_73740fe4.IFCVIRTUALELEMENT' IN TYPEOF(RelatedBuildingElement))
    // OR   ('IFC4X3_DEV_73740fe4.IFCOPENINGELEMENT' IN TYPEOF(RelatedBuildingElement))))
    // OR
    // (PhysicalOrVirtualBoundary = IfcPhysicalOrVirtualEnum.NotDefined);
}
