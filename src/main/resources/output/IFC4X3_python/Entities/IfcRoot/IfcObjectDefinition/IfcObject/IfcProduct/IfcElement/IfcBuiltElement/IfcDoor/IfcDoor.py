class IfcDoor(IfcBuiltElement):
    def __init__(self):
        self.OverallHeight: IfcPositiveLengthMeasure = None
        self.OverallWidth: IfcPositiveLengthMeasure = None
        self.PredefinedType: IfcDoorTypeEnum = None
        self.OperationType: IfcDoorTypeOperationEnum = None
        self.UserDefinedOperationType: IfcLabel = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcDoorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcDoorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    # CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCDOORTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
