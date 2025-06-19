class IfcMaterialDefinitionRepresentation(IfcProductRepresentation):
    def __init__(self):
        self.RepresentedMaterial: IfcMaterial = None

    # === WHERE CLAUSES ===
    # OnlyStyledRepresentations : SIZEOF(QUERY(temp <* Representations | (NOT('IFC4X3_DEV_73740fe4.IFCSTYLEDREPRESENTATION' IN TYPEOF(temp))) )) = 0
