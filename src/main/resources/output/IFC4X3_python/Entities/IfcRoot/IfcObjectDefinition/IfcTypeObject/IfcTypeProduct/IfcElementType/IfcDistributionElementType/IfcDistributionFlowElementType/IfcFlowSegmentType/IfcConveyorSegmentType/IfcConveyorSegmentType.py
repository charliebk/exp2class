class IfcConveyorSegmentType(IfcFlowSegmentType):
    def __init__(self):
        self.PredefinedType: IfcConveyorSegmentTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcConveyorSegmentTypeEnum.USERDEFINED) OR ((PredefinedType = IfcConveyorSegmentTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
