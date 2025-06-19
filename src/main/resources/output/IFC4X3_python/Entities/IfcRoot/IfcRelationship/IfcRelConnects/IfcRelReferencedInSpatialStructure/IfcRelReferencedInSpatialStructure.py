class IfcRelReferencedInSpatialStructure(IfcRelConnects):
    def __init__(self):
        self.RelatedElements: SET [1:?] OF IfcSpatialReferenceSelect = None
        self.RelatingStructure: IfcSpatialElement = None

    # === WHERE CLAUSES ===
    # AllowedRelatedElements : SIZEOF(QUERY(temp <* RelatedElements | ('IFC4X3_DEV_73740fe4.IFCSPATIALSTRUCTUREELEMENT' IN TYPEOF(temp)) AND (NOT ('IFC4X3_DEV_73740fe4.IFCSPACE' IN TYPEOF(temp))) )) = 0
