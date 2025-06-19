class IfcSpatialZoneType(IfcSpatialElementType):
    def __init__(self):
        self.PredefinedType: IfcSpatialZoneTypeEnum = None
        self.LongName: IfcLabel = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcSpatialZoneTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSpatialZoneTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcSpatialElementType.ElementType))
