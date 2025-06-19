class IfcContext(IfcObjectDefinition):
    def __init__(self):
        self.ObjectType: IfcLabel = None
        self.LongName: IfcLabel = None
        self.Phase: IfcLabel = None
        self.RepresentationContexts: SET [1:?] OF IfcRepresentationContext = None
        self.UnitsInContext: IfcUnitAssignment = None

    # === EXTENDED BY ===
    # IfcProject
    # IfcProjectLibrary

    # === INVERSE CLAUSES ===
    # IsDefinedBy : SET [0:?] OF IfcRelDefinesByProperties FOR RelatedObjects
    # Declares : SET [0:?] OF IfcRelDeclares FOR RelatingContext
