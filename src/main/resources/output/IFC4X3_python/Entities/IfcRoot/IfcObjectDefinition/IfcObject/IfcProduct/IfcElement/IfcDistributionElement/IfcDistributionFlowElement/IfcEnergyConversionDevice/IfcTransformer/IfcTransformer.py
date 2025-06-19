class IfcTransformer(IfcEnergyConversionDevice):
    def __init__(self):
        self.PredefinedType: IfcTransformerTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcTransformerTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTransformerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    # CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCTRANSFORMERTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
