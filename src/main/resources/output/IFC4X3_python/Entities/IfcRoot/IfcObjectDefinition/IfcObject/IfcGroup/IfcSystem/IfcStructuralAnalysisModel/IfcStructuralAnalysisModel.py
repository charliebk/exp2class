class IfcStructuralAnalysisModel(IfcSystem):
    def __init__(self):
        self.PredefinedType: IfcAnalysisModelTypeEnum = None
        self.OrientationOf2DPlane: IfcAxis2Placement3D = None
        self.LoadedBy: SET [1:?] OF IfcStructuralLoadGroup = None
        self.HasResults: SET [1:?] OF IfcStructuralResultGroup = None
        self.SharedPlacement: IfcObjectPlacement = None

    # === WHERE CLAUSES ===
    # CorrectPredefinedType : (PredefinedType <> IfcAnalysisModelTypeEnum.USERDEFINED) OR ((PredefinedType = IfcAnalysisModelTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
