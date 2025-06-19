class IfcRelDefinesByProperties(IfcRelDefines):
    def __init__(self):
        self.RelatedObjects: SET [1:?] OF IfcObjectDefinition = None
        self.RelatingPropertyDefinition: IfcPropertySetDefinitionSelect = None

    # === WHERE CLAUSES ===
    # NoRelatedTypeObject : SIZEOF(QUERY(Types <* SELF\IfcRelDefinesByProperties.RelatedObjects |  'IFC4X3_DEV_73740fe4.IFCTYPEOBJECT' IN TYPEOF(Types))) = 0
