class IfcRelSpaceBoundary(IfcRelConnects):
    def __init__(self):
        self.RelatingSpace: IfcSpaceBoundarySelect = None
        self.RelatedBuildingElement: IfcElement = None
        self.ConnectionGeometry: IfcConnectionGeometry = None
        self.PhysicalOrVirtualBoundary: IfcPhysicalOrVirtualEnum = None
        self.InternalOrExternalBoundary: IfcInternalOrExternalEnum = None

    # === EXTENDED BY ===
    # IfcRelSpaceBoundary1stLevel

    # === WHERE CLAUSES ===
    # CorrectPhysOrVirt : ((PhysicalOrVirtualBoundary = IfcPhysicalOrVirtualEnum.Physical) AND (NOT('IFC4X3_DEV_73740fe4.IFCVIRTUALELEMENT' IN TYPEOF(RelatedBuildingElement)))) OR ((PhysicalOrVirtualBoundary = IfcPhysicalOrVirtualEnum.Virtual) AND (('IFC4X3_DEV_73740fe4.IFCVIRTUALELEMENT' IN TYPEOF(RelatedBuildingElement)) OR   ('IFC4X3_DEV_73740fe4.IFCOPENINGELEMENT' IN TYPEOF(RelatedBuildingElement)))) OR (PhysicalOrVirtualBoundary = IfcPhysicalOrVirtualEnum.NotDefined)
