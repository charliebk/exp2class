class IfcTaskType(IfcTypeProcess):
    def __init__(self):
        self.PredefinedType: IfcTaskTypeEnum = None
        self.WorkMethod: IfcLabel = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcTaskTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTaskTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeProcess.ProcessType))
