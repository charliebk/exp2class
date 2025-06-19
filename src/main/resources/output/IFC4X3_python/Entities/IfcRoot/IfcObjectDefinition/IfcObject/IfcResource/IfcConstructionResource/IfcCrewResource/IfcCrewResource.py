class IfcCrewResource(IfcConstructionResource):
    def __init__(self):
        self.PredefinedType: IfcCrewResourceTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcCrewResourceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCrewResourceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
