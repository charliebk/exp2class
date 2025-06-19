Public Class IfcRelSpaceBoundary Inherits IfcRelConnects
    Public RelatingSpace As IfcSpaceBoundarySelect
    Public RelatedBuildingElement As IfcElement
    Public ConnectionGeometry As IfcConnectionGeometry
    Public PhysicalOrVirtualBoundary As IfcPhysicalOrVirtualEnum
    Public InternalOrExternalBoundary As IfcInternalOrExternalEnum

    ' === EXTENDED BY ===
    ' IfcRelSpaceBoundary1stLevel

    ' === WHERE CLAUSES ===
    ' CorrectPhysOrVirt : ((PhysicalOrVirtualBoundary = IfcPhysicalOrVirtualEnum.Physical) AND (NOT('IFC4X3_DEV_73740fe4.IFCVIRTUALELEMENT' IN TYPEOF(RelatedBuildingElement)))) OR ((PhysicalOrVirtualBoundary = IfcPhysicalOrVirtualEnum.Virtual) AND (('IFC4X3_DEV_73740fe4.IFCVIRTUALELEMENT' IN TYPEOF(RelatedBuildingElement)) OR   ('IFC4X3_DEV_73740fe4.IFCOPENINGELEMENT' IN TYPEOF(RelatedBuildingElement)))) OR (PhysicalOrVirtualBoundary = IfcPhysicalOrVirtualEnum.NotDefined)
End Class
