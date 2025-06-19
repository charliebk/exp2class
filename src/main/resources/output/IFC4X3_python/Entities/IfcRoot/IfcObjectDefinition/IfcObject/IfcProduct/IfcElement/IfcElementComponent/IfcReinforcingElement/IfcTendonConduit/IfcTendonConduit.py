class IfcTendonConduit(IfcReinforcingElement):
    def __init__(self):
        self.PredefinedType: IfcTendonConduitTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcTendonConduitTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTendonConduitTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    # CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCTENDONCONDUITTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
