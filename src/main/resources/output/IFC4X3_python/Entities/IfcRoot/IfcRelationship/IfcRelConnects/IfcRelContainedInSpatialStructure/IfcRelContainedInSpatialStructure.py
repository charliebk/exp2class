class IfcRelContainedInSpatialStructure(IfcRelConnects):
    def __init__(self):
        self.RelatedElements: SET [1:?] OF IfcProduct = None
        self.RelatingStructure: IfcSpatialElement = None

    # === WHERE CLAUSES ===
    # WR31 : SIZEOF(QUERY(temp <* RelatedElements | 'IFC4X3_DEV_73740fe4.IFCSPATIALSTRUCTUREELEMENT' IN TYPEOF(temp))) = 0
