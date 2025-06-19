class IfcProcedureType(IfcTypeProcess):
    def __init__(self):
        self.PredefinedType: IfcProcedureTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcProcedureTypeEnum.USERDEFINED) OR ((PredefinedType = IfcProcedureTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeProcess.ProcessType))
