class IfcLaborResource(IfcConstructionResource):
    def __init__(self):
        self.PredefinedType: IfcLaborResourceTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcLaborResourceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcLaborResourceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
