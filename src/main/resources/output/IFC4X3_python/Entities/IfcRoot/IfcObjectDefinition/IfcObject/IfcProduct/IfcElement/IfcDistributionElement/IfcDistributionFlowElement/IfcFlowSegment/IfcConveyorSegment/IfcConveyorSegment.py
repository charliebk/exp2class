class IfcConveyorSegment(IfcFlowSegment):
    def __init__(self):
        self.PredefinedType: IfcConveyorSegmentTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcConveyorSegmentTypeEnum.USERDEFINED) OR ((PredefinedType = IfcConveyorSegmentTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    # CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCCONVEYORSEGMENTTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
