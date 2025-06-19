class IfcOpeningElement(IfcFeatureElementSubtraction):
    def __init__(self):
        self.PredefinedType: IfcOpeningElementTypeEnum = None

    # === INVERSE CLAUSES ===
    # HasFillings : SET [0:?] OF IfcRelFillsElement FOR RelatingOpeningElement

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcOpeningElementTypeEnum.USERDEFINED) OR ((PredefinedType = IfcOpeningElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
