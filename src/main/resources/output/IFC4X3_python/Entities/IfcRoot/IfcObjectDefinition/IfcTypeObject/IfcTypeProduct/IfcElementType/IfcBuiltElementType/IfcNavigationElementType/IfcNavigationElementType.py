class IfcNavigationElementType(IfcBuiltElementType):
    def __init__(self):
        self.PredefinedType: IfcNavigationElementTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcNavigationElementTypeEnum.USERDEFINED) OR ((PredefinedType = IfcNavigationElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
