class IfcRelConnectsStructuralMember(IfcRelConnects):
    def __init__(self):
        self.RelatingStructuralMember: IfcStructuralMember = None
        self.RelatedStructuralConnection: IfcStructuralConnection = None
        self.AppliedCondition: IfcBoundaryCondition = None
        self.AdditionalConditions: IfcStructuralConnectionCondition = None
        self.SupportedLength: IfcLengthMeasure = None
        self.ConditionCoordinateSystem: IfcAxis2Placement3D = None

    # === EXTENDED BY ===
    # IfcRelConnectsWithEccentricity
