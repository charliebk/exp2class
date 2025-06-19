class IfcGeotechnicalStratum(IfcGeotechnicalElement):
    def __init__(self):
        self.PredefinedType: IfcGeotechnicalStratumTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcGeotechnicalStratumTypeEnum.USERDEFINED) OR ((PredefinedType = IfcGeotechnicalStratumTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
