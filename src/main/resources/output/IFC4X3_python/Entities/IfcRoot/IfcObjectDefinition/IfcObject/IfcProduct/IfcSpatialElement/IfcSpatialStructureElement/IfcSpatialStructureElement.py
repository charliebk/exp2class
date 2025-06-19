class IfcSpatialStructureElement(IfcSpatialElement):
    def __init__(self):
        self.CompositionType: IfcElementCompositionEnum = None

    # === EXTENDED BY ===
    # IfcBuildingStorey
    # IfcFacility
    # IfcFacilityPart
    # IfcSite
    # IfcSpace

    # === WHERE CLAUSES ===
    # WR41 : (HIINDEX(SELF\IfcObjectDefinition.Decomposes) = 1) AND ('IFC4X3_DEV_73740fe4.IFCRELAGGREGATES' IN TYPEOF(SELF\IfcObjectDefinition.Decomposes[1])) AND (('IFC4X3_DEV_73740fe4.IFCPROJECT' IN TYPEOF (SELF\IfcObjectDefinition.Decomposes[1].RelatingObject)) OR ('IFC4X3_DEV_73740fe4.IFCSPATIALSTRUCTUREELEMENT' IN TYPEOF (SELF\IfcObjectDefinition.Decomposes[1].RelatingObject)) )
