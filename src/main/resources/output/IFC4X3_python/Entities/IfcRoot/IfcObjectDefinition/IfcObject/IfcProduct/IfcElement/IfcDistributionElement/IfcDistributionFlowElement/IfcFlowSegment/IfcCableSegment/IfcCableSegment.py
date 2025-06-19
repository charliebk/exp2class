class IfcCableSegment(IfcFlowSegment):
    def __init__(self):
        self.PredefinedType: IfcCableSegmentTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcCableSegmentTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCableSegmentTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    # CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCCABLESEGMENTTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
