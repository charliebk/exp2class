class IfcDistributionSystem(IfcSystem):
    def __init__(self):
        self.LongName: IfcLabel = None
        self.PredefinedType: IfcDistributionSystemEnum = None

    # === EXTENDED BY ===
    # IfcDistributionCircuit

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcDistributionSystemEnum.USERDEFINED) OR ((PredefinedType = IfcDistributionSystemEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
