class IfcTask(IfcProcess):
    def __init__(self):
        self.Status: IfcLabel = None
        self.WorkMethod: IfcLabel = None
        self.IsMilestone: IfcBoolean = None
        self.Priority: IfcInteger = None
        self.TaskTime: IfcTaskTime = None
        self.PredefinedType: IfcTaskTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcTaskTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTaskTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcObject.ObjectType))
    # HasName : EXISTS(SELF\IfcRoot.Name)
