class IfcProcedure(IfcProcess):
    def __init__(self):
        self.PredefinedType: IfcProcedureTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcProcedureTypeEnum.USERDEFINED) OR ((PredefinedType = IfcProcedureTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcObject.ObjectType))
    # HasName : EXISTS(SELF\IfcRoot.Name)
