class IfcPropertySet(IfcPropertySetDefinition):
    def __init__(self):
        self.HasProperties: SET [1:?] OF IfcProperty = None

    # === WHERE CLAUSES ===
    # ExistsName : EXISTS(SELF\IfcRoot.Name)
    # UniquePropertyNames : IfcUniquePropertyName(HasProperties)
