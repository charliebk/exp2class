class IfcStairFlight(IfcBuiltElement):
    def __init__(self):
        self.NumberOfRisers: IfcInteger = None
        self.NumberOfTreads: IfcInteger = None
        self.RiserHeight: IfcPositiveLengthMeasure = None
        self.TreadLength: IfcPositiveLengthMeasure = None
        self.PredefinedType: IfcStairFlightTypeEnum = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcStairFlightTypeEnum.USERDEFINED) OR ((PredefinedType = IfcStairFlightTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    # CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCSTAIRFLIGHTTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
