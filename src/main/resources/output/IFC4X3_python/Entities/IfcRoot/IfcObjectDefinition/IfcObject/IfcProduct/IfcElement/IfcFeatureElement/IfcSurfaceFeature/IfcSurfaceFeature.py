class IfcSurfaceFeature(IfcFeatureElement):
    def __init__(self):
        self.PredefinedType: IfcSurfaceFeatureTypeEnum = None

    # === INVERSE CLAUSES ===
    # AdheresToElement : IfcRelAdheresToElement FOR RelatedSurfaceFeatures

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcSurfaceFeatureTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSurfaceFeatureTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
