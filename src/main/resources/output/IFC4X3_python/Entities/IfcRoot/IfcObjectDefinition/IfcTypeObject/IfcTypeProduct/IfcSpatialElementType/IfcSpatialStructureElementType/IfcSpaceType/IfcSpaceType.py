class IfcSpaceType(IfcSpatialStructureElementType):
    def __init__(self):
        self.PredefinedType: IfcSpaceTypeEnum = None
        self.LongName: IfcLabel = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcSpaceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSpaceTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcSpatialElementType.ElementType))
