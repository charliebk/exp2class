class IfcWindow(IfcBuiltElement):
    def __init__(self):
        self.OverallHeight: IfcPositiveLengthMeasure = None
        self.OverallWidth: IfcPositiveLengthMeasure = None
        self.PredefinedType: IfcWindowTypeEnum = None
        self.PartitioningType: IfcWindowTypePartitioningEnum = None
        self.UserDefinedPartitioningType: IfcLabel = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcWindowTypeEnum.USERDEFINED) OR ((PredefinedType = IfcWindowTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    # CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCWINDOWTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
